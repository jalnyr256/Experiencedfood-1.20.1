package net.jalnyr.experiencedfood.entity;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.client.PikeRenderer;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.jalnyr.experiencedfood.entity.custom.PerchEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.jalnyr.experiencedfood.entity.custom.SaurosuchusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExperiencedFood.MOD_ID);

    public static final RegistryObject<EntityType<CarrotGolemEntity>> CARROT_GOLEM =
            ENTITY_TYPES.register("carrot_golem", ()-> EntityType.Builder.of(CarrotGolemEntity::new, MobCategory.CREATURE)
                    .sized(1.2f, 1.7f).build("carrot_golem"));
    public static final RegistryObject<EntityType<PikeEntity>> PIKE =
            ENTITY_TYPES.register("pike", ()-> EntityType.Builder.of(PikeEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1f, 0.3f).build("pike"));
    public static final RegistryObject<EntityType<PerchEntity>> PERCH =
            ENTITY_TYPES.register("perch", ()-> EntityType.Builder.of(PerchEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1f, 0.3f).build("perch"));
    public static final RegistryObject<EntityType<SaurosuchusEntity>> SAUROSUCHUS =
            ENTITY_TYPES.register("saurosuchus", ()-> EntityType.Builder.of(SaurosuchusEntity::new, MobCategory.MONSTER)
                    .sized(3f, 4f).build("saurosuchus"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
