package net.jalnyr.experiencedfood.datagen;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExperiencedFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.CARROT_GOLEM_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.PIKE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}