package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.experiencedfood.entity.animations.ModAnimationDefenitions;
import net.jalnyr.experiencedfood.entity.custom.PenguinEntity;
import net.jalnyr.experiencedfood.entity.custom.SquirrelEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class PenguinModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "penguin"), "main");
    private final ModelPart penguin;
    private final ModelPart body;
    private final ModelPart leg1;
    private final ModelPart leg2;
    private final ModelPart torso;
    private final ModelPart hand1;
    private final ModelPart hand2;
    private final ModelPart head;

    public PenguinModel(ModelPart root) {
        this.penguin = root.getChild("penguin");
        this.body = this.penguin.getChild("body");
        this.leg1 = this.body.getChild("leg1");
        this.leg2 = this.body.getChild("leg2");
        this.torso = this.body.getChild("torso");
        this.hand1 = this.torso.getChild("hand1");
        this.hand2 = this.torso.getChild("hand2");
        this.head = this.torso.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition penguin = partdefinition.addOrReplaceChild("penguin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition body = penguin.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(24, 28).addBox(-1.0F, 1.0F, -1.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(32, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 3.0F));

        PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 1.0F, -1.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(24, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -20.0F, -5.0F, 6.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition hand1 = torso.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 5.0F));

        PartDefinition cube_r1 = hand1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 10).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

        PartDefinition hand2 = torso.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.0F, -5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r2 = hand2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 18).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

        PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(32, 4).addBox(3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(32, 7).addBox(3.0F, -3.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(24, 35).addBox(3.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(ModAnimationDefenitions.PENGUINWALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((PenguinEntity) entity).idleAnimationState, ModAnimationDefenitions.PENGUINIDLE, ageInTicks, 1f);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        penguin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return penguin;
    }
}