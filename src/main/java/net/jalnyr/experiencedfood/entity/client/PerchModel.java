package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.experiencedfood.entity.animations.ModAnimationDefenitions;
import net.jalnyr.experiencedfood.entity.custom.PerchEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class PerchModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "perch"), "main");
    private final ModelPart perch;
    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart selkaeva;
    private final ModelPart selkaeva2;
    private final ModelPart evaa;

    public PerchModel(ModelPart root) {
        this.perch = root.getChild("perch");
        this.body = this.perch.getChild("body");
        this.tail = this.body.getChild("tail");
        this.selkaeva = this.body.getChild("selkaeva");
        this.selkaeva2 = this.body.getChild("selkaeva2");
        this.evaa = this.body.getChild("evaa");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition perch = partdefinition.addOrReplaceChild("perch", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = perch.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 13).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 6.0F));

        PartDefinition eva2_r1 = tail.addOrReplaceChild("eva2_r1", CubeListBuilder.create().texOffs(12, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.7854F, 1.5708F));

        PartDefinition eva1_r1 = tail.addOrReplaceChild("eva1_r1", CubeListBuilder.create().texOffs(4, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.7854F, -1.5708F));

        PartDefinition selkaeva = body.addOrReplaceChild("selkaeva", CubeListBuilder.create().texOffs(14, 13).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

        PartDefinition selkaeva2 = body.addOrReplaceChild("selkaeva2", CubeListBuilder.create().texOffs(8, 16).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 4.0F));

        PartDefinition evaa = body.addOrReplaceChild("evaa", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 4.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(ModAnimationDefenitions.SWIM_PERK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((PerchEntity) entity).idleAnimationState, ModAnimationDefenitions.SWIM_PERK, ageInTicks, 1f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        perch.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return perch;
    }
}