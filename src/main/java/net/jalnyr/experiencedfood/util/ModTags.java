package net.jalnyr.experiencedfood.util;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SQUIRREL_TOOL = tag("needs_squirrel_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ExperiencedFood.MOD_ID, name));
        }
    }
    public static class Items {

    }
}
