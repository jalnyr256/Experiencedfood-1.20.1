package net.jalnyr.experiencedfood.block;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.block.custom.OnionCropBlock;
import net.jalnyr.experiencedfood.block.custom.TurnipCropBlock;
import net.jalnyr.experiencedfood.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExperiencedFood.MOD_ID);

    public static final RegistryObject<Block> TURNIP_CRATE = registerBlock("turnip_crate",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));
    public static final RegistryObject<Block> ONION_CRATE = registerBlock("onion_crate",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));
    public static final RegistryObject<Block> CRATE = registerBlock("crate",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ONION_CROP = BLOCKS.register("onion_crop",
            ()-> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> TURNIP_CROP = BLOCKS.register("turnip_crop",
            ()-> new TurnipCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> SALAD_CROP = BLOCKS.register("salad_crop",
            ()-> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CABBAGE_CROP = BLOCKS.register("cabbage_crop",
            ()-> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
