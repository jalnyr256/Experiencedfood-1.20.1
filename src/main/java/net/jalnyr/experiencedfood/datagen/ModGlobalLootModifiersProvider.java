package net.jalnyr.experiencedfood.datagen;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.item.ModItems;
import net.jalnyr.experiencedfood.loot.AddFishingItemModifier;
import net.jalnyr.experiencedfood.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ExperiencedFood.MOD_ID);
    }

    @Override
    protected void start() {
        add("turnip_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.TURNIP_SEEDS.get()));
        add("salad_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.SALAD.get()));
        add("onion_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.ONION_SEEDS.get()));
        add("kelp_from_cabbage", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.KELP).build(),
                LootItemRandomChanceCondition.randomChance(0.11f).build()}, ModItems.CABBAGE_SEEDS.get()));
        add("turnip_from_plains", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_weaponsmith")).build() }, ModItems.TURNIP.get()));


        add("pike_from_fishing", new AddFishingItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing")).build() }, ModItems.RAW_PIKE.get()));


        add("onion_from_plains", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_armorer")).build() }, ModItems.ONION.get()));
        add("turnip_from_taiga", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_toolsmith")).build() }, ModItems.TURNIP.get()));
        add("onion_from_taiga", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_taiga_house")).build() }, ModItems.ONION.get()));
        add("turnip_from_savanna", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_savanna_house")).build() }, ModItems.TURNIP.get()));
        add("onion_from_savanna", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_savanna_house")).build() }, ModItems.ONION.get()));
    }
}
