// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Allosaurus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "allosaurus"), "main");
	private final ModelPart Allosaurus;
	private final ModelPart Body;
	private final ModelPart upper_body;
	private final ModelPart neck;
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart alaleuka;
	private final ModelPart tooth;
	private final ModelPart ylaleuka;
	private final ModelPart tooth2;
	private final ModelPart eyes;
	private final ModelPart hand2;
	private final ModelPart kammen2;
	private final ModelPart hand;
	private final ModelPart kammen;
	private final ModelPart torso;
	private final ModelPart leg1;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart leg2;
	private final ModelPart bone3;
	private final ModelPart bone4;

	public Allosaurus(ModelPart root) {
		this.Allosaurus = root.getChild("Allosaurus");
		this.Body = this.Allosaurus.getChild("Body");
		this.upper_body = this.Body.getChild("upper_body");
		this.neck = this.upper_body.getChild("neck");
		this.tail = this.upper_body.getChild("tail");
		this.head = this.upper_body.getChild("head");
		this.alaleuka = this.head.getChild("alaleuka");
		this.tooth = this.alaleuka.getChild("tooth");
		this.ylaleuka = this.head.getChild("ylaleuka");
		this.tooth2 = this.ylaleuka.getChild("tooth2");
		this.eyes = this.ylaleuka.getChild("eyes");
		this.hand2 = this.upper_body.getChild("hand2");
		this.kammen2 = this.hand2.getChild("kammen2");
		this.hand = this.upper_body.getChild("hand");
		this.kammen = this.hand.getChild("kammen");
		this.torso = this.upper_body.getChild("torso");
		this.leg1 = this.Body.getChild("leg1");
		this.bone2 = this.leg1.getChild("bone2");
		this.bone = this.leg1.getChild("bone");
		this.leg2 = this.Body.getChild("leg2");
		this.bone3 = this.leg2.getChild("bone3");
		this.bone4 = this.leg2.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Allosaurus = partdefinition.addOrReplaceChild("Allosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Allosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -31.0F, 0.0F));

		PartDefinition upper_body = Body.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition neck = upper_body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(108, 0).addBox(-6.0F, -13.0F, -21.0F, 12.0F, 17.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(114, 127).addBox(-5.0F, -11.0F, -32.0F, 10.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.0F, -16.0F));

		PartDefinition tail = upper_body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 96).addBox(-7.0F, -6.0F, 0.0F, 14.0F, 15.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(92, 92).addBox(-6.0F, -5.0F, 19.0F, 12.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(0, 130).addBox(-3.0F, -2.0F, 57.0F, 6.0F, 7.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(108, 28).addBox(-4.0F, -3.0F, 41.0F, 8.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -7.0F, 12.0F));

		PartDefinition head = upper_body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 152).addBox(2.0F, 1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 164).addBox(2.0F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 164).addBox(-3.0F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 160).addBox(-3.0F, 1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(92, 145).addBox(-2.0F, 3.0F, -8.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -8.0F, -48.0F));

		PartDefinition alaleuka = head.addOrReplaceChild("alaleuka", CubeListBuilder.create().texOffs(108, 53).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(132, 53).addBox(-3.0F, -1.0F, -8.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(160, 118).addBox(-2.0F, -1.0F, -12.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(144, 164).addBox(-1.0F, -1.0F, -15.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 124).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition tooth = alaleuka.addOrReplaceChild("tooth", CubeListBuilder.create().texOffs(156, 149).addBox(5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(160, 149).addBox(5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(164, 149).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(122, 165).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(126, 165).addBox(4.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(130, 165).addBox(1.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 167).addBox(2.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 167).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(134, 165).addBox(3.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 167).addBox(3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 165).addBox(1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 124).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 166).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 164).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -1.0F, -3.0F));

		PartDefinition ylaleuka = head.addOrReplaceChild("ylaleuka", CubeListBuilder.create().texOffs(156, 35).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(156, 44).addBox(-3.0F, 0.0F, -8.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(156, 140).addBox(-2.0F, 1.0F, -12.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(156, 164).addBox(-1.0F, 2.0F, -15.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(152, 53).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition tooth2 = ylaleuka.addOrReplaceChild("tooth2", CubeListBuilder.create().texOffs(12, 167).addBox(5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 167).addBox(5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 167).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 167).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 167).addBox(4.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 167).addBox(1.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 167).addBox(2.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(122, 167).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(126, 167).addBox(3.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(130, 167).addBox(3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(134, 167).addBox(1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 167).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 168).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 168).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 5.0F, -3.0F));

		PartDefinition eyes = ylaleuka.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(92, 165).addBox(2.0F, -5.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(98, 165).addBox(-3.0F, -5.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition hand2 = upper_body.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.0F, 1.0F, -19.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hand2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(160, 101).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hand2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(160, 111).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hand2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(160, 92).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition kammen2 = hand2.addOrReplaceChild("kammen2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -5.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition hand = upper_body.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, 1.0F, -19.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hand.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(156, 127).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 160).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hand.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 156).addBox(-2.0F, -5.0F, -1.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition kammen = hand.addOrReplaceChild("kammen", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -5.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition torso = upper_body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -17.0F, -26.0F, 16.0F, 22.0F, 38.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-8.0F, -19.0F, -24.0F, 12.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
		.texOffs(92, 60).addBox(-6.0F, -21.0F, -22.0F, 8.0F, 2.0F, 30.0F, new CubeDeformation(0.0F))
		.texOffs(66, 127).addBox(-6.0F, 5.0F, -5.0F, 8.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(156, 26).addBox(-5.0F, 7.0F, 3.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition leg1 = Body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(5.0F, -7.0F, -3.0F));

		PartDefinition bone2 = leg1.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(144, 151).addBox(-4.0F, -9.0F, -3.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(66, 145).addBox(-4.0F, -15.0F, -5.0F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 13.0F, 1.0F));

		PartDefinition bone = leg1.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(160, 124).addBox(-2.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(86, 124).addBox(-4.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 152).addBox(-4.0F, 2.0F, -4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(164, 56).addBox(0.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 130).addBox(-4.0F, -19.0F, -2.0F, 5.0F, 19.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(154, 0).addBox(-4.0F, -25.0F, -3.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(154, 14).addBox(-4.0F, -1.0F, -3.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 33.0F, 3.0F));

		PartDefinition leg2 = Body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-15.0F, -7.0F, -3.0F));

		PartDefinition bone3 = leg2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(92, 151).addBox(-4.0F, -10.0F, -3.0F, 5.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(118, 151).addBox(-4.0F, -14.0F, -5.0F, 5.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 13.0F, 1.0F));

		PartDefinition bone4 = leg2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(104, 165).addBox(-2.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(110, 165).addBox(-4.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(152, 56).addBox(-4.0F, 2.0F, -4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 165).addBox(0.0F, 3.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 96).addBox(-4.0F, -20.0F, -2.0F, 5.0F, 21.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(-4.0F, -26.0F, -3.0F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(24, 156).addBox(-4.0F, -1.0F, -3.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 33.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Allosaurus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}