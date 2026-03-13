package net.jalnyr.experiencedfood.entity.custom;

import net.jalnyr.experiencedfood.entity.ai.SaurosuchusAttackGoal;
import net.jalnyr.experiencedfood.entity.ai.SaurosuchusSwingGoal;
import net.jalnyr.experiencedfood.item.ModItems;
import net.jalnyr.experiencedfood.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.FollowTemptation;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class AllosaurusEntity extends Monster implements Enemy {


    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(AllosaurusEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> SWINGING =
            SynchedEntityData.defineId(AllosaurusEntity.class, EntityDataSerializers.BOOLEAN);

    private final ServerBossEvent bossEvent  = new ServerBossEvent(Component.literal("Allosaurus"),
            BossEvent.BossBarColor.GREEN, BossEvent.BossBarOverlay.NOTCHED_6);

    public AllosaurusEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;
    public final AnimationState swingAnimationState = new AnimationState();
    public int swingAnimationTimeout = 0;


    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }

        if (this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 20;
            attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()) {
            attackAnimationState.stop();
        }


        if (this.isSwinging() && swingAnimationTimeout <= 0) {
            swingAnimationTimeout = 40;
            swingAnimationState.start(this.tickCount);
        } else {
            --this.swingAnimationTimeout;
        }

        if(!this.isSwinging()) {
            swingAnimationState.stop();
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }

    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }

    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }

    public void setSwinging(boolean swinging) {
        this.entityData.set(SWINGING, swinging);
    }

    public boolean isSwinging() {
        return this.entityData.get(SWINGING);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
        this.entityData.define(SWINGING, false);
    }

    @Override
    protected void registerGoals() {
            this.goalSelector.addGoal(0, new FloatGoal(this));
            this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1f));
            this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1f, true));
            this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
            this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 20f));



        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, false, false));
    }


    public static AttributeSupplier.Builder CreateAttributes() {
        return createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 1200D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 350.0D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 10f)
                .add(Attributes.ATTACK_DAMAGE, 10f);

    }
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.SAUROSUCHUS_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return ModSounds.SAUROSUCHUS_HIT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.SAUROSUCHUS_DEATH.get();
    }


    protected SoundEvent getStepSound() {
        return ModSounds.SAUROSUCHUS_STEP.get();
    }

    @Override
    protected void playStepSound(BlockPos pPos, BlockState pBlock) {
        this.playSound(this.getStepSound(), 0.15F, 1.0F);
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }
    protected Item getDefaultItem() {
        return ModItems.TRIASSIC_HEART.get();
    }


    @Override
    public void startSeenByPlayer(ServerPlayer pServerPlayer) {
        super.startSeenByPlayer(pServerPlayer);
        this.bossEvent.addPlayer(pServerPlayer);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer pServerPlayer) {
        super.stopSeenByPlayer(pServerPlayer);
        this.bossEvent.removePlayer(pServerPlayer);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
    }
}
