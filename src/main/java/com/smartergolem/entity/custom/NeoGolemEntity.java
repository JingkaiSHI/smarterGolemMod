package com.smartergolem.entity.custom;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class NeoGolemEntity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neogolem"), "main");
	private final ModelPart RightHand;
	private final ModelPart LeftHand;
	private final ModelPart RightFoot;
	private final ModelPart LeftFoot;
	private final ModelPart Head;
	private final ModelPart MainBody;

	public NeoGolemEntity(ModelPart root) {
		this.RightHand = root.getChild("RightHand");
		this.LeftHand = root.getChild("LeftHand");
		this.RightFoot = root.getChild("RightFoot");
		this.LeftFoot = root.getChild("LeftFoot");
		this.Head = root.getChild("Head");
		this.MainBody = root.getChild("MainBody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightHand = partdefinition.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(6.0F, 9.0F, 0.0F));

		PartDefinition cube_r1 = RightHand.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0392F, 0.0244F, -0.0186F));

		PartDefinition LeftHand = partdefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(8, 10).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 9.0F, 0.0F));

		PartDefinition RightFoot = partdefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 16.0F, 0.0F));

		PartDefinition LeftFoot = partdefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 16.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 22).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition MainBody = partdefinition.addOrReplaceChild("MainBody", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightHand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftHand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MainBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}