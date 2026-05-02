package net.jalnyr.experiencedfood.item;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;
import java.util.function.Supplier;

public class ModToolTiers {
    public static final Tier SQUIRREL_LEATHER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 400, 5f, 2f, 40,
                    ModTags.Blocks.NEEDS_SQUIRREL_TOOL, () ->Ingredient.of(ModItems.SQUIRREL_LEATHER.get())),
            new ResourceLocation(ExperiencedFood.MOD_ID, "squirrel_leather"), List.of(Tiers.STONE), List.of()
    );
}
