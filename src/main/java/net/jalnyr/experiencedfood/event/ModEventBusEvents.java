package net.jalnyr.experiencedfood.event;

import net.jalnyr.experiencedfood.ExperiencedFood;

import net.jalnyr.experiencedfood.entity.ModEntities;
import net.jalnyr.experiencedfood.entity.custom.*;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExperiencedFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CARROT_GOLEM.get(), CarrotGolemEntity.CreateAttributes().build());
        event.put(ModEntities.PIKE.get(), PikeEntity.CreateAttributes().build());
        event.put(ModEntities.SQUIRREL.get(), SquirrelEntity.CreateAttributes().build());
        event.put(ModEntities.PERCH.get(), PerchEntity.CreateAttributes().build());
        event.put(ModEntities.SAUROSUCHUS.get(), SaurosuchusEntity.CreateAttributes().build());
        event.put(ModEntities.ALLOSAURUS.get(), AllosaurusEntity.CreateAttributes().build());
        event.put(ModEntities.PENGUIN.get(), PenguinEntity.CreateAttributes().build());
    }
    public static void entitySpawnRestriction(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.SQUIRREL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.PENGUIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.PIKE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.PERCH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}
