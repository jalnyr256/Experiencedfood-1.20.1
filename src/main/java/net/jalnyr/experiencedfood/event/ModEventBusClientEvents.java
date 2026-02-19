package net.jalnyr.experiencedfood.event;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.client.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExperiencedFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CARROT_GOLEM_LAYER, CarrotGolemModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PIKE_LAYER, PikeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PERCH_LAYER, PerchModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SAUROSUCHUS_LAYER, SaurosuchusModel::createBodyLayer);
    }

}
