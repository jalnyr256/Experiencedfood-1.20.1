package net.jalnyr.experiencedfood.entity;

import net.jalnyr.experiencedfood.ExperiencedFood;
import net.jalnyr.experiencedfood.entity.custom.CarrotGolemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExperiencedFood.MOD_ID);

    public static final RegistryObject<EntityType<CarrotGolemEntity>> CARROT_GOLEM =
            ENTITY_TYPES.register("carrot_golem", ()-> EntityType.Builder.of(CarrotGolemEntity::new, MobCategory.CREATURE)
                    .sized(1.2f, 1.7f).build("carrot_golem"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
