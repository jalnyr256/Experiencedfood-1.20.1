package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.AllosaurusEntity;
import net.jalnyr.experiencedfood.entity.custom.SaurosuchusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AllosaurusRenderer extends MobRenderer<AllosaurusEntity, AllosaurusModel<AllosaurusEntity>> {

    public AllosaurusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AllosaurusModel<>(pContext.bakeLayer(ModModelLayers.ALLOSAURUS_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(AllosaurusEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/allosaurus.png");
    }

    @Override
    public void render(AllosaurusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(3f, 2.5f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
