// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Saurosuchus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "saurosuchus"), "main");
	private final ModelPart saurosuchus;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart foot;
	private final ModelPart leg2;
	private final ModelPart bone3;
	private final ModelPart foot2;
	private final ModelPart bone4;
	private final ModelPart leg3;
	private final ModelPart bone5;
	private final ModelPart foot3;
	private final ModelPart bone6;
	private final ModelPart leg4;
	private final ModelPart bone7;
	private final ModelPart foot4;
	private final ModelPart bone8;
	private final ModelPart torso;
	private final ModelPart spikesall;
	private final ModelPart spikeneck2;
	private final ModelPart spikes7;
	private final ModelPart spikes8;
	private final ModelPart spikes9;
	private final ModelPart spikes10;
	private final ModelPart spikes11;
	private final ModelPart spikes12;
	private final ModelPart spikes13;
	private final ModelPart spikeneck3;
	private final ModelPart spikes14;
	private final ModelPart spikes15;
	private final ModelPart spikes16;
	private final ModelPart spikes17;
	private final ModelPart spikes18;
	private final ModelPart spikes19;
	private final ModelPart spikes20;
	private final ModelPart spikeneck4;
	private final ModelPart spikes21;
	private final ModelPart spikes22;
	private final ModelPart spikes23;
	private final ModelPart spikes24;
	private final ModelPart spikes25;
	private final ModelPart spikes26;
	private final ModelPart spikes27;
	private final ModelPart head;
	private final ModelPart alaleuka;
	private final ModelPart tooth;
	private final ModelPart tooth8;
	private final ModelPart tooth6;
	private final ModelPart tooth7;
	private final ModelPart tooth2;
	private final ModelPart tooth9;
	private final ModelPart tooth3;
	private final ModelPart tooth11;
	private final ModelPart tooth4;
	private final ModelPart tooth10;
	private final ModelPart tooth5;
	private final ModelPart tooth12;
	private final ModelPart ylaleuka;
	private final ModelPart leuka;
	private final ModelPart tooth13;
	private final ModelPart tooth14;
	private final ModelPart tooth15;
	private final ModelPart tooth16;
	private final ModelPart tooth17;
	private final ModelPart tooth18;
	private final ModelPart tooth19;
	private final ModelPart tooth20;
	private final ModelPart tooth21;
	private final ModelPart tooth22;
	private final ModelPart tooth23;
	private final ModelPart tooth24;
	private final ModelPart neck;
	private final ModelPart spikeneck;
	private final ModelPart spikes;
	private final ModelPart spikes4;
	private final ModelPart spikes5;
	private final ModelPart spikes2;
	private final ModelPart spikes3;
	private final ModelPart spikes6;
	private final ModelPart kieli;
	private final ModelPart tail;

	public Saurosuchus(ModelPart root) {
		this.saurosuchus = root.getChild("saurosuchus");
		this.body = this.saurosuchus.getChild("body");
		this.leg1 = this.body.getChild("leg1");
		this.bone2 = this.leg1.getChild("bone2");
		this.bone = this.leg1.getChild("bone");
		this.foot = this.bone.getChild("foot");
		this.leg2 = this.body.getChild("leg2");
		this.bone3 = this.leg2.getChild("bone3");
		this.foot2 = this.bone3.getChild("foot2");
		this.bone4 = this.leg2.getChild("bone4");
		this.leg3 = this.body.getChild("leg3");
		this.bone5 = this.leg3.getChild("bone5");
		this.foot3 = this.bone5.getChild("foot3");
		this.bone6 = this.leg3.getChild("bone6");
		this.leg4 = this.body.getChild("leg4");
		this.bone7 = this.leg4.getChild("bone7");
		this.foot4 = this.bone7.getChild("foot4");
		this.bone8 = this.leg4.getChild("bone8");
		this.torso = this.body.getChild("torso");
		this.spikesall = this.torso.getChild("spikesall");
		this.spikeneck2 = this.spikesall.getChild("spikeneck2");
		this.spikes7 = this.spikeneck2.getChild("spikes7");
		this.spikes8 = this.spikeneck2.getChild("spikes8");
		this.spikes9 = this.spikeneck2.getChild("spikes9");
		this.spikes10 = this.spikeneck2.getChild("spikes10");
		this.spikes11 = this.spikeneck2.getChild("spikes11");
		this.spikes12 = this.spikeneck2.getChild("spikes12");
		this.spikes13 = this.spikeneck2.getChild("spikes13");
		this.spikeneck3 = this.spikesall.getChild("spikeneck3");
		this.spikes14 = this.spikeneck3.getChild("spikes14");
		this.spikes15 = this.spikeneck3.getChild("spikes15");
		this.spikes16 = this.spikeneck3.getChild("spikes16");
		this.spikes17 = this.spikeneck3.getChild("spikes17");
		this.spikes18 = this.spikeneck3.getChild("spikes18");
		this.spikes19 = this.spikeneck3.getChild("spikes19");
		this.spikes20 = this.spikeneck3.getChild("spikes20");
		this.spikeneck4 = this.spikesall.getChild("spikeneck4");
		this.spikes21 = this.spikeneck4.getChild("spikes21");
		this.spikes22 = this.spikeneck4.getChild("spikes22");
		this.spikes23 = this.spikeneck4.getChild("spikes23");
		this.spikes24 = this.spikeneck4.getChild("spikes24");
		this.spikes25 = this.spikeneck4.getChild("spikes25");
		this.spikes26 = this.spikeneck4.getChild("spikes26");
		this.spikes27 = this.spikeneck4.getChild("spikes27");
		this.head = this.body.getChild("head");
		this.alaleuka = this.head.getChild("alaleuka");
		this.tooth = this.alaleuka.getChild("tooth");
		this.tooth8 = this.alaleuka.getChild("tooth8");
		this.tooth6 = this.alaleuka.getChild("tooth6");
		this.tooth7 = this.alaleuka.getChild("tooth7");
		this.tooth2 = this.alaleuka.getChild("tooth2");
		this.tooth9 = this.alaleuka.getChild("tooth9");
		this.tooth3 = this.alaleuka.getChild("tooth3");
		this.tooth11 = this.alaleuka.getChild("tooth11");
		this.tooth4 = this.alaleuka.getChild("tooth4");
		this.tooth10 = this.alaleuka.getChild("tooth10");
		this.tooth5 = this.alaleuka.getChild("tooth5");
		this.tooth12 = this.alaleuka.getChild("tooth12");
		this.ylaleuka = this.head.getChild("ylaleuka");
		this.leuka = this.ylaleuka.getChild("leuka");
		this.tooth13 = this.ylaleuka.getChild("tooth13");
		this.tooth14 = this.ylaleuka.getChild("tooth14");
		this.tooth15 = this.ylaleuka.getChild("tooth15");
		this.tooth16 = this.ylaleuka.getChild("tooth16");
		this.tooth17 = this.ylaleuka.getChild("tooth17");
		this.tooth18 = this.ylaleuka.getChild("tooth18");
		this.tooth19 = this.ylaleuka.getChild("tooth19");
		this.tooth20 = this.ylaleuka.getChild("tooth20");
		this.tooth21 = this.ylaleuka.getChild("tooth21");
		this.tooth22 = this.ylaleuka.getChild("tooth22");
		this.tooth23 = this.ylaleuka.getChild("tooth23");
		this.tooth24 = this.ylaleuka.getChild("tooth24");
		this.neck = this.head.getChild("neck");
		this.spikeneck = this.neck.getChild("spikeneck");
		this.spikes = this.spikeneck.getChild("spikes");
		this.spikes4 = this.spikeneck.getChild("spikes4");
		this.spikes5 = this.spikeneck.getChild("spikes5");
		this.spikes2 = this.spikeneck.getChild("spikes2");
		this.spikes3 = this.spikeneck.getChild("spikes3");
		this.spikes6 = this.spikeneck.getChild("spikes6");
		this.kieli = this.head.getChild("kieli");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition saurosuchus = partdefinition.addOrReplaceChild("saurosuchus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = saurosuchus.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(8.0F, -36.0F, -24.0F));

		PartDefinition bone2 = leg1.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 169).addBox(-2.0F, -19.0F, -9.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 7.0F));

		PartDefinition bone = leg1.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(34, 149).addBox(-2.0F, 0.0F, -5.0F, 5.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 3.0F));

		PartDefinition foot = bone.addOrReplaceChild("foot", CubeListBuilder.create().texOffs(86, 178).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(92, 178).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(98, 178).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -5.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-9.0F, -37.0F, -23.0F));

		PartDefinition bone3 = leg2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(54, 149).addBox(-2.0F, 0.0F, -5.0F, 5.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 2.0F));

		PartDefinition foot2 = bone3.addOrReplaceChild("foot2", CubeListBuilder.create().texOffs(104, 178).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(134, 179).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(180, 91).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -5.0F));

		PartDefinition bone4 = leg2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(170, 42).addBox(-2.0F, -19.0F, -9.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 6.0F));

		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-9.0F, -36.0F, 11.0F));

		PartDefinition bone5 = leg3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(74, 149).addBox(-2.0F, -24.0F, -9.0F, 5.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 36.0F, 6.0F));

		PartDefinition foot3 = bone5.addOrReplaceChild("foot3", CubeListBuilder.create().texOffs(180, 94).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(180, 97).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(180, 100).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -9.0F));

		PartDefinition bone6 = leg3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(170, 138).addBox(-2.0F, -19.0F, -9.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 6.0F));

		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(8.0F, -36.0F, 10.0F));

		PartDefinition bone7 = leg4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(94, 149).addBox(-2.0F, -24.0F, -9.0F, 5.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 35.7672F, 8.1058F));

		PartDefinition foot4 = bone7.addOrReplaceChild("foot4", CubeListBuilder.create().texOffs(164, 63).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 169).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 172).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -9.0F));

		PartDefinition bone8 = leg4.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(170, 155).addBox(-2.0F, -19.0F, -9.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.7672F, 8.1058F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -24.0F, -27.0F, 24.0F, 24.0F, 42.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-11.0F, -27.0F, -26.0F, 22.0F, 3.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(0, 109).addBox(-10.0F, -29.0F, -25.0F, 20.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -36.0F, 0.0F));

		PartDefinition spikesall = torso.addOrReplaceChild("spikesall", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikeneck2 = spikesall.addOrReplaceChild("spikeneck2", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, -10.0F));

		PartDefinition spikes7 = spikeneck2.addOrReplaceChild("spikes7", CubeListBuilder.create().texOffs(166, 138).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 141).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 144).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 147).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 150).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(110, 178).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes8 = spikeneck2.addOrReplaceChild("spikes8", CubeListBuilder.create().texOffs(140, 179).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(180, 103).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(144, 180).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 180).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(152, 180).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(156, 180).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition spikes9 = spikeneck2.addOrReplaceChild("spikes9", CubeListBuilder.create().texOffs(160, 180).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(164, 180).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 181).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 181).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 181).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 181).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition spikes10 = spikeneck2.addOrReplaceChild("spikes10", CubeListBuilder.create().texOffs(36, 181).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 181).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 181).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 181).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 181).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 181).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition spikes11 = spikeneck2.addOrReplaceChild("spikes11", CubeListBuilder.create().texOffs(60, 181).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 181).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 181).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(72, 181).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 181).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(80, 181).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition spikes12 = spikeneck2.addOrReplaceChild("spikes12", CubeListBuilder.create().texOffs(84, 181).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 181).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 181).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 181).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 181).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 181).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition spikes13 = spikeneck2.addOrReplaceChild("spikes13", CubeListBuilder.create().texOffs(108, 181).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 82).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 85).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 88).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 106).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 109).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition spikeneck3 = spikesall.addOrReplaceChild("spikeneck3", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 4.0F));

		PartDefinition spikes14 = spikeneck3.addOrReplaceChild("spikes14", CubeListBuilder.create().texOffs(112, 182).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 112).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 115).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 182).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 118).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 182).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 121).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes15 = spikeneck3.addOrReplaceChild("spikes15", CubeListBuilder.create().texOffs(124, 182).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 124).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 127).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(128, 182).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 130).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 182).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(182, 133).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition spikes16 = spikeneck3.addOrReplaceChild("spikes16", CubeListBuilder.create().texOffs(136, 182).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 182).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(144, 183).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 183).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(152, 183).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(156, 183).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(160, 183).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition spikes17 = spikeneck3.addOrReplaceChild("spikes17", CubeListBuilder.create().texOffs(164, 183).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 184).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 184).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 184).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 184).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 184).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 184).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition spikes18 = spikeneck3.addOrReplaceChild("spikes18", CubeListBuilder.create().texOffs(44, 184).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 184).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 184).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 184).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 184).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 184).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 184).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition spikes19 = spikeneck3.addOrReplaceChild("spikes19", CubeListBuilder.create().texOffs(72, 184).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 184).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(80, 184).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 184).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 184).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 184).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 184).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition spikes20 = spikeneck3.addOrReplaceChild("spikes20", CubeListBuilder.create().texOffs(100, 184).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(184, 103).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 184).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 184).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(168, 184).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(172, 184).addBox(-6.0F, -17.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(176, 184).addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition spikeneck4 = spikesall.addOrReplaceChild("spikeneck4", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 18.0F));

		PartDefinition spikes21 = spikeneck4.addOrReplaceChild("spikes21", CubeListBuilder.create().texOffs(180, 184).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(184, 184).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 185).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 185).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 185).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes22 = spikeneck4.addOrReplaceChild("spikes22", CubeListBuilder.create().texOffs(124, 185).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(128, 185).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 185).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(136, 185).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 185).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition spikes23 = spikeneck4.addOrReplaceChild("spikes23", CubeListBuilder.create().texOffs(0, 186).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 0).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 3).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 186).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 6).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition spikes24 = spikeneck4.addOrReplaceChild("spikes24", CubeListBuilder.create().texOffs(8, 186).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 9).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 186).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 12).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 15).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition spikes25 = spikeneck4.addOrReplaceChild("spikes25", CubeListBuilder.create().texOffs(16, 186).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 82).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 85).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 88).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 91).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition spikes26 = spikeneck4.addOrReplaceChild("spikes26", CubeListBuilder.create().texOffs(186, 94).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 97).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 100).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 106).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 109).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition spikes27 = spikeneck4.addOrReplaceChild("spikes27", CubeListBuilder.create().texOffs(186, 112).addBox(-6.0F, -17.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 115).addBox(-6.0F, -17.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 118).addBox(-6.0F, -17.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 121).addBox(-6.0F, -17.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(186, 124).addBox(-6.0F, -17.0F, -15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -48.0F, -27.0F));

		PartDefinition alaleuka = head.addOrReplaceChild("alaleuka", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -14.0F));

		PartDefinition cube_r1 = alaleuka.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 77).addBox(-3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.0F, -22.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = alaleuka.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 64).addBox(-4.0F, -2.0F, 1.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.0F, -18.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = alaleuka.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(170, 59).addBox(-5.0F, -2.0F, -1.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0F, -14.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = alaleuka.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(124, 91).addBox(-7.0F, -2.0F, -13.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition tooth = alaleuka.addOrReplaceChild("tooth", CubeListBuilder.create().texOffs(28, 175).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(124, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 1.0F, 0.0F));

		PartDefinition tooth8 = alaleuka.addOrReplaceChild("tooth8", CubeListBuilder.create().texOffs(50, 178).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(152, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 1.0F, 0.0F));

		PartDefinition tooth6 = alaleuka.addOrReplaceChild("tooth6", CubeListBuilder.create().texOffs(144, 107).addBox(4.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 3.0F, -2.0F));

		PartDefinition tooth7 = alaleuka.addOrReplaceChild("tooth7", CubeListBuilder.create().texOffs(148, 107).addBox(4.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 3.0F, -2.0F));

		PartDefinition tooth2 = alaleuka.addOrReplaceChild("tooth2", CubeListBuilder.create().texOffs(44, 178).addBox(5.0F, 14.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 107).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -1.0F, 3.0F));

		PartDefinition tooth9 = alaleuka.addOrReplaceChild("tooth9", CubeListBuilder.create().texOffs(56, 178).addBox(5.0F, 14.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(156, 107).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -1.0F, 3.0F));

		PartDefinition tooth3 = alaleuka.addOrReplaceChild("tooth3", CubeListBuilder.create().texOffs(132, 63).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(140, 63).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(132, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 6.0F));

		PartDefinition tooth11 = alaleuka.addOrReplaceChild("tooth11", CubeListBuilder.create().texOffs(174, 85).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 88).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(164, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -3.0F, 6.0F));

		PartDefinition tooth4 = alaleuka.addOrReplaceChild("tooth4", CubeListBuilder.create().texOffs(148, 63).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(156, 63).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(136, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 9.0F));

		PartDefinition tooth10 = alaleuka.addOrReplaceChild("tooth10", CubeListBuilder.create().texOffs(134, 173).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 82).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(160, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -5.0F, 9.0F));

		PartDefinition tooth5 = alaleuka.addOrReplaceChild("tooth5", CubeListBuilder.create().texOffs(158, 147).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(158, 150).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(140, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 12.0F));

		PartDefinition tooth12 = alaleuka.addOrReplaceChild("tooth12", CubeListBuilder.create().texOffs(174, 107).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 110).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(168, 107).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -6.0F, 12.0F));

		PartDefinition ylaleuka = head.addOrReplaceChild("ylaleuka", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -12.0F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition leuka = ylaleuka.addOrReplaceChild("leuka", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leuka.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(174, 69).addBox(-3.0F, -1.0F, 2.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.0F, -22.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leuka.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(114, 173).addBox(-4.0F, -2.0F, 1.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.0F, -18.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leuka.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(144, 171).addBox(-5.0F, -2.0F, -1.0F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0F, -14.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leuka.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(132, 0).addBox(-7.0F, -2.0F, -13.0F, 14.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition tooth13 = ylaleuka.addOrReplaceChild("tooth13", CubeListBuilder.create().texOffs(62, 178).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(170, 64).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 1.0F, 0.0F));

		PartDefinition tooth14 = ylaleuka.addOrReplaceChild("tooth14", CubeListBuilder.create().texOffs(68, 178).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 40).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 1.0F, 0.0F));

		PartDefinition tooth15 = ylaleuka.addOrReplaceChild("tooth15", CubeListBuilder.create().texOffs(178, 40).addBox(4.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 3.0F, -2.0F));

		PartDefinition tooth16 = ylaleuka.addOrReplaceChild("tooth16", CubeListBuilder.create().texOffs(182, 40).addBox(4.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 3.0F, -2.0F));

		PartDefinition tooth17 = ylaleuka.addOrReplaceChild("tooth17", CubeListBuilder.create().texOffs(74, 178).addBox(5.0F, 14.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(182, 136).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -1.0F, 3.0F));

		PartDefinition tooth18 = ylaleuka.addOrReplaceChild("tooth18", CubeListBuilder.create().texOffs(80, 178).addBox(5.0F, 14.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 18).addBox(5.0F, 13.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -1.0F, 3.0F));

		PartDefinition tooth19 = ylaleuka.addOrReplaceChild("tooth19", CubeListBuilder.create().texOffs(174, 113).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 116).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 40).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 6.0F));

		PartDefinition tooth20 = ylaleuka.addOrReplaceChild("tooth20", CubeListBuilder.create().texOffs(174, 119).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 122).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 127).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -3.0F, 6.0F));

		PartDefinition tooth21 = ylaleuka.addOrReplaceChild("tooth21", CubeListBuilder.create().texOffs(174, 125).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 128).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 129).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 9.0F));

		PartDefinition tooth22 = ylaleuka.addOrReplaceChild("tooth22", CubeListBuilder.create().texOffs(174, 131).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(174, 134).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 131).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -5.0F, 9.0F));

		PartDefinition tooth23 = ylaleuka.addOrReplaceChild("tooth23", CubeListBuilder.create().texOffs(134, 176).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 178).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 133).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 12.0F));

		PartDefinition tooth24 = ylaleuka.addOrReplaceChild("tooth24", CubeListBuilder.create().texOffs(28, 178).addBox(4.0F, 14.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 178).addBox(4.0F, 13.0F, -18.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(186, 135).addBox(5.0F, 12.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -6.0F, 12.0F));

		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(20, 169).addBox(-7.0F, -9.0F, -17.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(158, 138).addBox(5.0F, -9.0F, -17.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(116, 109).addBox(-7.0F, -15.0F, -15.0F, 14.0F, 14.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition spikeneck = neck.addOrReplaceChild("spikeneck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes = spikeneck.addOrReplaceChild("spikes", CubeListBuilder.create().texOffs(160, 186).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(148, 186).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(152, 186).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(156, 186).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(144, 186).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 187).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(164, 186).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes4 = spikeneck.addOrReplaceChild("spikes4", CubeListBuilder.create().texOffs(112, 188).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 188).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 188).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(124, 188).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(128, 188).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 188).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(136, 188).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition spikes5 = spikeneck.addOrReplaceChild("spikes5", CubeListBuilder.create().texOffs(80, 187).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 187).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 187).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 187).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 187).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 187).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 187).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition spikes2 = spikeneck.addOrReplaceChild("spikes2", CubeListBuilder.create().texOffs(24, 187).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 187).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 187).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 187).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 187).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 187).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 187).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition spikes3 = spikeneck.addOrReplaceChild("spikes3", CubeListBuilder.create().texOffs(52, 187).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 187).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 187).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 187).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 187).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(72, 187).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 187).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition spikes6 = spikeneck.addOrReplaceChild("spikes6", CubeListBuilder.create().texOffs(108, 187).addBox(-6.0F, -16.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(168, 187).addBox(-6.0F, -16.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(172, 187).addBox(-6.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(176, 187).addBox(-6.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(180, 187).addBox(-6.0F, -16.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(184, 187).addBox(-6.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(188, 103).addBox(-6.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, 0.0F, 0.0F));

		PartDefinition kieli = head.addOrReplaceChild("kieli", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -16.0F));

		PartDefinition cube_r9 = kieli.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(116, 138).addBox(-3.0F, -1.0F, -14.0F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(124, 66).addBox(-8.0F, -9.0F, 0.0F, 16.0F, 16.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(132, 20).addBox(-7.0F, -7.0F, 9.0F, 14.0F, 15.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(132, 42).addBox(-6.0F, -5.0F, 16.0F, 12.0F, 14.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 149).addBox(-5.0F, -4.0F, 23.0F, 10.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(114, 154).addBox(-4.0F, -3.0F, 30.0F, 8.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(144, 154).addBox(-3.0F, -2.0F, 37.0F, 6.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(168, 172).addBox(-3.0F, -1.0F, 44.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(174, 30).addBox(-2.0F, 0.0F, 48.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(174, 20).addBox(-1.0F, 1.0F, 52.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -47.0F, 15.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		saurosuchus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}