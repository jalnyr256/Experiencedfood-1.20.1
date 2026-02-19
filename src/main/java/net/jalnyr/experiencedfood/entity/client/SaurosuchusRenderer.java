package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.jalnyr.experiencedfood.entity.custom.SaurosuchusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SaurosuchusRenderer extends MobRenderer<SaurosuchusEntity, SaurosuchusModel<SaurosuchusEntity>> {

    public SaurosuchusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SaurosuchusModel<>(pContext.bakeLayer(ModModelLayers.SAUROSUCHUS_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SaurosuchusEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/saurosuchus.png");
    }

    @Override
    public void render(SaurosuchusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(3f, 2.5f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
