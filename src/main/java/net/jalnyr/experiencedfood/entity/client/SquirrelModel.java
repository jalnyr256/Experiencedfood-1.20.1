package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.experiencedfood.entity.animations.ModAnimationDefenitions;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.jalnyr.experiencedfood.entity.custom.SquirrelEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SquirrelModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "squirrel"), "main");
    private final ModelPart squirrel;
    private final ModelPart body;
    private final ModelPart leg3;
    private final ModelPart leg4;
    private final ModelPart torso;
    private final ModelPart head;
    private final ModelPart leg;
    private final ModelPart leg2;
    private final ModelPart tail;

    public SquirrelModel(ModelPart root) {
        this.squirrel = root.getChild("squirrel");
        this.body = this.squirrel.getChild("body");
        this.leg3 = this.body.getChild("leg3");
        this.leg4 = this.body.getChild("leg4");
        this.torso = this.body.getChild("torso");
        this.head = this.body.getChild("head");
        this.leg = this.body.getChild("leg");
        this.leg2 = this.body.getChild("leg2");
        this.tail = this.body.getChild("tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition squirrel = partdefinition.addOrReplaceChild("squirrel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = squirrel.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 10).addBox(0.0F, 3.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -4.0F, 3.0F));

        PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(22, 5).addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 13).addBox(0.0F, 3.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -4.0F, 3.0F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -5.0F, -4.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, -3.0F));

        PartDefinition leg = body.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(10, 16).addBox(0.0F, 1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 23).addBox(0.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -3.0F));

        PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(22, 16).addBox(0.0F, 1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 23).addBox(0.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.0F, -3.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 10).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 19).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-1.0F, -10.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(18, 19).addBox(-1.0F, -9.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 3.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(ModAnimationDefenitions.RUN, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((SquirrelEntity) entity).idleAnimationState, ModAnimationDefenitions.SIDLE, ageInTicks, 1f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        squirrel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    @Override
    public ModelPart root() {
        return squirrel;
    }
}
