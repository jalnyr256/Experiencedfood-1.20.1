package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.PerchEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PerchRenderer extends MobRenderer<PerchEntity, PerchModel<PerchEntity>> {

    public PerchRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PerchModel<>(pContext.bakeLayer(ModModelLayers.PERCH_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(PerchEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/perch.png");
    }

    @Override
    public void render(PerchEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
