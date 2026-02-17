// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Perch<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "perch"), "main");
	private final ModelPart perch;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart evaa2;
	private final ModelPart selkaeva;
	private final ModelPart selkaeva2;
	private final ModelPart evaa;

	public Perch(ModelPart root) {
		this.perch = root.getChild("perch");
		this.body = this.perch.getChild("body");
		this.tail = this.body.getChild("tail");
		this.evaa2 = this.tail.getChild("evaa2");
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

		PartDefinition evaa2 = tail.addOrReplaceChild("evaa2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eva2_r1 = evaa2.addOrReplaceChild("eva2_r1", CubeListBuilder.create().texOffs(12, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.7854F, 1.5708F));

		PartDefinition eva1_r1 = evaa2.addOrReplaceChild("eva1_r1", CubeListBuilder.create().texOffs(4, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.7854F, -1.5708F));

		PartDefinition selkaeva = body.addOrReplaceChild("selkaeva", CubeListBuilder.create().texOffs(14, 13).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition selkaeva2 = body.addOrReplaceChild("selkaeva2", CubeListBuilder.create().texOffs(8, 16).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 4.0F));

		PartDefinition evaa = body.addOrReplaceChild("evaa", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		perch.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}