package net.jalnyr.experiencedfood.item;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExperiencedFood.MOD_ID);
    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            ()-> new Item(new Item.Properties().food(ModFoods.BAGUETTE)));
    public static final RegistryObject<Item> PEACEOFCARROT = ITEMS.register("peaceofcarrot",
            ()-> new Item(new Item.Properties().food(ModFoods.PIECEOFCARROT)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
