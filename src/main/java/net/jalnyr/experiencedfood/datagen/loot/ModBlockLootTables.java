package net.jalnyr.experiencedfood.datagen.loot;

import net.jalnyr.experiencedfood.block.ModBlocks;
import net.jalnyr.experiencedfood.block.custom.OnionCropBlock;
import net.jalnyr.experiencedfood.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ONION_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));
        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CABBAGE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));
        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.TURNIP_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));
        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.SALAD_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));
        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.RYE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));



        this.add(ModBlocks.ONION_CROP.get(), createCropDrops(ModBlocks.ONION_CROP.get(), ModItems.ONION.get(),
                ModItems.ONION_SEEDS.get(), lootitemcondition$builder));
        this.add(ModBlocks.TURNIP_CROP.get(), createCropDrops(ModBlocks.TURNIP_CROP.get(), ModItems.TURNIP.get(),
                ModItems.TURNIP_SEEDS.get(), lootitemcondition$builder3));
        this.add(ModBlocks.SALAD_CROP.get(), createCropDrops(ModBlocks.SALAD_CROP.get(), ModItems.SALAD.get(),
                ModItems.SALAD.get(), lootitemcondition$builder4));
        this.add(ModBlocks.RYE_CROP.get(), createCropDrops(ModBlocks.RYE_CROP.get(), ModItems.RYE.get(),
                ModItems.RYE_SEEDS.get(), lootitemcondition$builder5));
        this.add(ModBlocks.CABBAGE_CROP.get(), createCropDrops(ModBlocks.CABBAGE_CROP.get(), ModItems.CABBAGE.get(),
                ModItems.CABBAGE_SEEDS.get(), lootitemcondition$builder2));
        this.dropSelf(ModBlocks.WINDMILL.get());
        this.dropSelf(ModBlocks.TURNIP_CRATE.get());
        this.dropSelf(ModBlocks.ONION_CRATE.get());
        this.dropSelf(ModBlocks.CRATE.get());
        this.dropSelf(ModBlocks.FISH_CRATE.get());


    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}