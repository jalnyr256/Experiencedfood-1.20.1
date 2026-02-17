package net.jalnyr.experiencedfood.event;

import net.jalnyr.experiencedfood.ExperiencedFood;

import net.jalnyr.experiencedfood.entity.ModEntities;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.jalnyr.experiencedfood.entity.custom.PerchEntity;
import net.jalnyr.experiencedfood.entity.custom.PikeEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExperiencedFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CARROT_GOLEM.get(), CarrotGolemEntity.CreateAttributes().build());
        event.put(ModEntities.PIKE.get(), PikeEntity.CreateAttributes().build());
        event.put(ModEntities.PERCH.get(), PerchEntity.CreateAttributes().build());
    }
}
