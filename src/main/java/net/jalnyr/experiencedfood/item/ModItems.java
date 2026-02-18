package net.jalnyr.experiencedfood.item;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.block.ModBlocks;
import net.jalnyr.experiencedfood.entity.ModEntities;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExperiencedFood.MOD_ID);
    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            ()-> new Item(new Item.Properties().food(ModFoods.BAGUETTE)));
    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
            ()-> new ItemNameBlockItem(ModBlocks.SALAD_CROP.get(), new  Item.Properties()));
    public static final RegistryObject<Item> MAYONAISE = ITEMS.register("mayonaise",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARROT_SWORD = ITEMS.register("carrot_sword",
            ()-> new SwordItem(Tiers.WOOD, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> PEACEOFCARROT = ITEMS.register("peaceofcarrot",
            ()-> new Item(new Item.Properties().food(ModFoods.PIECEOFCARROT)));
    public static final RegistryObject<Item> MEAT_SUPREME = ITEMS.register("meat_supreme",
            ()-> new Item(new Item.Properties().food(ModFoods.MEAT_SUPREME)));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            ()-> new Item(new Item.Properties().food(ModFoods.HAMBURGER)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            ()-> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            ()-> new Item(new Item.Properties().food(ModFoods.CARROT_SOUP)));
    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup",
            ()-> new Item(new Item.Properties().food(ModFoods.VEGETABLE_SOUP)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            ()-> new Item( new  Item.Properties().food(ModFoods.ONION)));
    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            ()-> new Item( new  Item.Properties().food(ModFoods.TURNIP)));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            ()-> new Item( new  Item.Properties().food(ModFoods.CABBAGE)));
    public static final RegistryObject<Item> BAKED_CABBAGE = ITEMS.register("baked_cabbage",
            ()-> new Item( new  Item.Properties().food(ModFoods.BAKED_CABBAGE)));
    public static final RegistryObject<Item> CABBAGE_ROLL = ITEMS.register("cabbage_roll",
            ()-> new Item( new  Item.Properties().food(ModFoods.CABBAGE_ROLL)));
    public static final RegistryObject<Item> RAW_PIKE = ITEMS.register("raw_pike",
            ()-> new Item( new  Item.Properties().food(ModFoods.RAW_PIKE)));
    public static final RegistryObject<Item> COOKED_PIKE = ITEMS.register("cooked_pike",
            ()-> new Item( new  Item.Properties().food(ModFoods.COOKED_PIKE)));
    public static final RegistryObject<Item> RAW_PERCH = ITEMS.register("raw_perch",
            ()-> new Item( new  Item.Properties().food(ModFoods.RAW_PERCH)));
    public static final RegistryObject<Item> COOKED_PERCH = ITEMS.register("cooked_perch",
            ()-> new Item( new  Item.Properties().food(ModFoods.COOKED_PERCH)));
    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(), new  Item.Properties()));
    public static final RegistryObject<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.TURNIP_CROP.get(), new  Item.Properties()));
    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.CABBAGE_CROP.get(), new  Item.Properties()));

    public static final RegistryObject<Item> CARROT_GOLEM_SPAWN_EGG = ITEMS.register("carrot_golem_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.CARROT_GOLEM, 0x1e9630, 0xc1d1c5, new Item.Properties()));
    public static final RegistryObject<Item> PIKE_SPAWN_EGG = ITEMS.register("pike_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.PIKE, 0x1e3630, 0xc6d1c5, new Item.Properties()));
    public static final RegistryObject<Item> PERCH_SPAWN_EGG = ITEMS.register("perch_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.PERCH, 0x2e3639, 0xc1d1c1, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
