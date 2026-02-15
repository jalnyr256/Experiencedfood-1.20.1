package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PikeRenderer extends MobRenderer<PikeEntity, PikeModel<PikeEntity>> {

    public PikeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PikeModel<>(pContext.bakeLayer(ModModelLayers.PIKE_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(PikeEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/pike.png");
    }

    @Override
    public void render(PikeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
