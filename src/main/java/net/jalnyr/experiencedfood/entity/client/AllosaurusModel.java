package net.jalnyr.experiencedfood.entity.client;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.TypeRewriteRule;
import net.jalnyr.experiencedfood.entity.animations.ModAnimationDefenitions;
import net.jalnyr.experiencedfood.entity.custom.SaurosuchusEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class AllosaurusModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "allosaurus"), "main");
    private final ModelPart Allosaurus;
    private final ModelPart Body;
    private final ModelPart leg1;
    private final ModelPart bone2;
    private final ModelPart bone;
    private final ModelPart leg2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart torso;
    private final ModelPart hand;
    private final ModelPart kammen;
    private final ModelPart hand2;
    private final ModelPart kammen2;
    private final ModelPart head;
    private final ModelPart alaleuka;
    private final ModelPart ylaleuka;
    private final ModelPart eyes;
    private final ModelPart tooth;
    private final ModelPart tooth2;
    private final ModelPart tail;
    private final ModelPart neck;

    public AllosaurusModel(ModelPart root) {
        this.Allosaurus = root.getChild("Allosaurus");
        this.Body = this.Allosaurus.getChild("Body");
        this.leg1 = this.Body.getChild("leg1");
        this.bone2 = this.leg1.getChild("bone2");
        this.bone = this.leg1.getChild("bone");
        this.leg2 = this.Body.getChild("leg2");
        this.bone3 = this.leg2.getChild("bone3");
        this.bone4 = this.leg2.getChild("bone4");
        this.torso = this.Body.getChild("torso");
        this.hand = this.Body.getChild("hand");
        this.kammen = this.hand.getChild("kammen");
        this.hand2 = this.Body.getChild("hand2");
        this.kammen2 = this.hand2.getChild("kammen2");
        this.head = this.Body.getChild("head");
        this.alaleuka = this.head.getChild("alaleuka");
        this.ylaleuka = this.head.getChild("ylaleuka");
        this.eyes = this.head.getChild("eyes");
        this.tooth = this.head.getChild("tooth");
        this.tooth2 = this.head.getChild("tooth2");
        this.tail = this.Body.getChild("tail");
        this.neck = this.Body.getChild("neck");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Allosaurus = partdefinition.addOrReplaceChild("Allosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Body = Allosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -31.0F, 0.0F));

        PartDefinition leg1 = Body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(5.0F, -7.0F, -3.0F));

        PartDefinition bone2 = leg1.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(108, 0).addBox(-4.0F, -9.0F, -2.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(1.0F))
                .texOffs(108, 10).addBox(-4.0F, -13.0F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(1.0F)), PartPose.offset(4.0F, 13.0F, 1.0F));

        PartDefinition bone = leg1.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(70, 125).addBox(-2.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(64, 125).addBox(-4.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(20, 116).addBox(-4.0F, 3.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(76, 125).addBox(0.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(106, 60).addBox(-4.0F, -19.0F, -1.0F, 5.0F, 19.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(108, 40).addBox(-4.0F, -25.0F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(46, 110).addBox(-4.0F, 0.0F, -2.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(1.0F)), PartPose.offset(4.0F, 33.0F, 3.0F));

        PartDefinition leg2 = Body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-15.0F, -7.0F, -3.0F));

        PartDefinition bone3 = leg2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(108, 20).addBox(-4.0F, -9.0F, -2.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(1.0F))
                .texOffs(108, 30).addBox(-4.0F, -13.0F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(1.0F)), PartPose.offset(4.0F, 13.0F, 1.0F));

        PartDefinition bone4 = leg2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(126, 62).addBox(-2.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(126, 65).addBox(-4.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(62, 118).addBox(-4.0F, 3.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(126, 68).addBox(0.0F, 4.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
                .texOffs(0, 107).addBox(-4.0F, -19.0F, -1.0F, 5.0F, 19.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(104, 108).addBox(-4.0F, -25.0F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(66, 110).addBox(-4.0F, 0.0F, -2.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(1.0F)), PartPose.offset(4.0F, 33.0F, 3.0F));

        PartDefinition torso = Body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -17.0F, -26.0F, 16.0F, 22.0F, 38.0F, new CubeDeformation(0.0F))
                .texOffs(0, 89).addBox(-6.0F, 5.0F, -5.0F, 8.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(20, 107).addBox(-5.0F, 7.0F, 3.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition hand = Body.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, 1.0F, -19.0F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r1 = hand.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 101).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, -1.309F, 0.0F, 0.0F));

        PartDefinition cube_r2 = hand.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 89).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r3 = hand.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 123).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition kammen = hand.addOrReplaceChild("kammen", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -5.0F, 0.48F, 0.0F, 0.0F));

        PartDefinition hand2 = Body.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.0F, 1.0F, -19.0F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r4 = hand2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(124, 108).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, -1.309F, 0.0F, 0.0F));

        PartDefinition cube_r5 = hand2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r6 = hand2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 123).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition kammen2 = hand2.addOrReplaceChild("kammen2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -5.0F, 0.48F, 0.0F, 0.0F));

        PartDefinition head = Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(124, 115).addBox(2.0F, 1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(116, 124).addBox(2.0F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(120, 125).addBox(-3.0F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 125).addBox(-3.0F, 1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(82, 118).addBox(-2.0F, 3.0F, -8.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -10.0F, -48.0F));

        PartDefinition alaleuka = head.addOrReplaceChild("alaleuka", CubeListBuilder.create().texOffs(40, 118).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(102, 119).addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(82, 124).addBox(-2.0F, -1.0F, -9.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(96, 124).addBox(-1.0F, -1.0F, -12.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(120, 119).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition ylaleuka = head.addOrReplaceChild("ylaleuka", CubeListBuilder.create().texOffs(108, 51).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(86, 110).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(32, 123).addBox(-2.0F, 1.0F, -9.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(106, 124).addBox(-1.0F, 2.0F, -12.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(120, 122).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

        PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(124, 125).addBox(2.0F, -5.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(126, 59).addBox(-3.0F, -5.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tooth = head.addOrReplaceChild("tooth", CubeListBuilder.create().texOffs(106, 84).addBox(5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 108).addBox(5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 108).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(110, 84).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(114, 84).addBox(3.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 116).addBox(2.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 75).addBox(2.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(118, 84).addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(122, 84).addBox(1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 123).addBox(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 73).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 71).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 4.0F, -3.0F));

        PartDefinition tooth2 = head.addOrReplaceChild("tooth2", CubeListBuilder.create().texOffs(126, 77).addBox(5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 79).addBox(5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 81).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(126, 83).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 40).addBox(3.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 42).addBox(2.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 44).addBox(2.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 46).addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 48).addBox(1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 128).addBox(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 128).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(72, 128).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 1.0F, -3.0F));

        PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(56, 60).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 9.0F, 17.0F, new CubeDeformation(3.0F))
                .texOffs(0, 60).addBox(-3.0F, -2.0F, 16.0F, 6.0F, 7.0F, 22.0F, new CubeDeformation(3.0F)), PartPose.offset(-2.0F, -7.0F, 12.0F));

        PartDefinition neck = Body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(56, 86).addBox(-7.0F, -13.0F, -21.0F, 13.0F, 13.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(104, 86).addBox(-6.0F, -12.0F, -32.0F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.0F, -16.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Allosaurus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return Allosaurus;
    }
}