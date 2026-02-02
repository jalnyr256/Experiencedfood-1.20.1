package net.jalnyr.experiencedfood.item;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.block.ModBlocks;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
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
            ()-> new Item(new Item.Properties()));
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
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            ()-> new Item( new  Item.Properties().food(ModFoods.ONION)));
    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            ()-> new Item( new  Item.Properties().food(ModFoods.TURNIP)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
