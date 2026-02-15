package net.jalnyr.experiencedfood.entity.client;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.experiencedfood.entity.animations.ModAnimationDefenitions;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class PikeModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pike"), "main");
    private final ModelPart pike;
    private final ModelPart body;
    private final ModelPart eva;
    private final ModelPart eva2;
    private final ModelPart head;
    private final ModelPart takaeva;
    private final ModelPart selkaeva;
    private final ModelPart selkaeva2;

    public PikeModel(ModelPart root) {
        this.pike = root.getChild("pike");
        this.body = this.pike.getChild("body");
        this.eva = this.body.getChild("eva");
        this.eva2 = this.body.getChild("eva2");
        this.head = this.body.getChild("head");
        this.takaeva = this.body.getChild("takaeva");
        this.selkaeva = this.body.getChild("selkaeva");
        this.selkaeva2 = this.body.getChild("selkaeva2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition pike = partdefinition.addOrReplaceChild("pike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition body = pike.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, -2.0F, 13.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition eva = body.addOrReplaceChild("eva", CubeListBuilder.create(), PartPose.offset(-4.0F, -3.0F, -2.0F));

        PartDefinition cube_r1 = eva.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.0F, 0.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition eva2 = body.addOrReplaceChild("eva2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -3.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r2 = eva2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, 0.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 14).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 13).addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 15).addBox(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -3.0F, 0.0F));

        PartDefinition takaeva = body.addOrReplaceChild("takaeva", CubeListBuilder.create(), PartPose.offset(8.0F, -4.0F, 0.0F));

        PartDefinition cube_r3 = takaeva.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 10).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r4 = takaeva.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 8).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition selkaeva = body.addOrReplaceChild("selkaeva", CubeListBuilder.create().texOffs(8, 14).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 12).addBox(0.0F, -3.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -6.0F, 0.0F));

        PartDefinition selkaeva2 = body.addOrReplaceChild("selkaeva2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(ModAnimationDefenitions.SWIM, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((PikeEntity) entity).idleAnimationState, ModAnimationDefenitions.SWIM, ageInTicks, 1f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        pike.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public ModelPart root() {
        return pike;
    }
}
