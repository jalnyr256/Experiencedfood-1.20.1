// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class carrot_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "carrot_golem"), "main");
	private final ModelPart carrot_golem;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart hand;
	private final ModelPart hand2;
	private final ModelPart head;
	private final ModelPart leg1;
	private final ModelPart leg2;

	public carrot_golem(ModelPart root) {
		this.carrot_golem = root.getChild("carrot_golem");
		this.body = this.carrot_golem.getChild("body");
		this.torso = this.body.getChild("torso");
		this.hand = this.body.getChild("hand");
		this.hand2 = this.body.getChild("hand2");
		this.head = this.body.getChild("head");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition carrot_golem = partdefinition.addOrReplaceChild("carrot_golem", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = carrot_golem.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -4.0F, 14.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition hand = body.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(34, 21).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -20.0F, 0.0F));

		PartDefinition hand2 = body.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(34, 34).addBox(0.0F, 0.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -20.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -6.0F, -1.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(12, 37).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -6.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		carrot_golem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}