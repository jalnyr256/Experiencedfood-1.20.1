package net.jalnyr.experiencedfood.recipe;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ExperiencedFood.MOD_ID);

    public static final RegistryObject<RecipeSerializer<WindmillRecipe>> WINDMILL_SERIALIZER =
            SERIALIZERS.register("windmill", () -> WindmillRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}
