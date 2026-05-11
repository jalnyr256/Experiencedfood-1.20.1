package net.jalnyr.experiencedfood.block.entity;

import com.google.common.eventbus.EventBus;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.block.ModBlocks;
import net.jalnyr.experiencedfood.util.ModTags;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExperiencedFood.MOD_ID);

    public static final RegistryObject<BlockEntityType<WindmillBlockEntity>> WINDMILL_BE =
            BLOCK_ENTITIES.register("windmill_be", () ->
                    BlockEntityType.Builder.of(WindmillBlockEntity::new,
                            ModBlocks.WINDMILL.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
