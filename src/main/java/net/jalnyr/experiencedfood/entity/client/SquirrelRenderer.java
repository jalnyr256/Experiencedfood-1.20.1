package net.jalnyr.experiencedfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.PerchEntity;
import net.jalnyr.experiencedfood.entity.custom.SquirrelEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, SquirrelModel<SquirrelEntity>> {

    public SquirrelRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SquirrelModel<>(pContext.bakeLayer(ModModelLayers.SQUIRREL_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SquirrelEntity pEntity) {
        return new ResourceLocation(ExperiencedFood.MOD_ID, "textures/entity/squirrel.png");
    }

    @Override
    public void render(SquirrelEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
