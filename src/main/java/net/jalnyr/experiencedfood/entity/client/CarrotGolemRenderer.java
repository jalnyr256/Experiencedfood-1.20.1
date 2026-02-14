package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CarrotGolemRenderer extends MobRenderer<CarrotGolemEntity, CarrotGolemModel<CarrotGolemEntity>> {

    public CarrotGolemRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CarrotGolemModel<>(pContext.bakeLayer(ModModelLayers.CARROT_GOLEM_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(CarrotGolemEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/carrotgolem.png");
    }

    @Override
    public void render(CarrotGolemEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
