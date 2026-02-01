package net.jalnyr.experiencedfood.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BAGUETTE = new FoodProperties.Builder().nutrition( 8).saturationMod(0.8f).build();
    public static final FoodProperties PIECEOFCARROT = new FoodProperties.Builder().nutrition( 2).saturationMod(0.1f).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition( 4).saturationMod(0.2f).build();
    public static final FoodProperties MEAT_SUPREME = new FoodProperties.Builder().nutrition( 16).saturationMod(2f).build();
}
