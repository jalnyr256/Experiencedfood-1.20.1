package net.jalnyr.experiencedfood.item;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExperiencedFood.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXPERIENCEDFOOD = CREATIVE_MODE_TABS.register("experiencedfood",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PEACEOFCARROT.get()))
                    .title(Component.translatable("creativetab.experiencedfood"))
                    .displayItems((pParametres, pOutput) -> {
                        pOutput.accept(ModItems.BAGUETTE.get());
                        pOutput.accept(ModItems.PEACEOFCARROT.get());
                        pOutput.accept(ModItems.ONION.get());
                        pOutput.accept(ModItems.MEAT_SUPREME.get());
                        pOutput.accept(ModItems.SALAD.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.MAYONAISE.get());
                        pOutput.accept(ModItems.HAMBURGER.get());
                        pOutput.accept(ModItems.CARROT_SOUP.get());
                        pOutput.accept(ModItems.TURNIP.get());
                        pOutput.accept(ModItems.CABBAGE.get());
                        pOutput.accept(ModItems.BAKED_CABBAGE.get());

                        pOutput.accept(ModBlocks.TURNIP_CRATE.get());
                        pOutput.accept(ModBlocks.CRATE.get());
                        pOutput.accept(ModBlocks.ONION_CRATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
