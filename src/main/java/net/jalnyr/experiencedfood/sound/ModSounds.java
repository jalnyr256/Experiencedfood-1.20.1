package net.jalnyr.experiencedfood.sound;

import com.google.common.eventbus.EventBus;
import net.jalnyr.experiencedfood.ExperiencedFood;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExperiencedFood.MOD_ID);

    public static final RegistryObject<SoundEvent> SAUROSUCHUS_ROAR = registerSoundEvents("saurosuchus_roar");
    public static final RegistryObject<SoundEvent> SAUROSUCHUS_HIT = registerSoundEvents("saurosuchus_hit");
    public static final RegistryObject<SoundEvent> SAUROSUCHUS_AMBIENT = registerSoundEvents("saurosuchus_ambient");
    public static final RegistryObject<SoundEvent> SAUROSUCHUS_STEP = registerSoundEvents("saurosuchus_step");
    public static final RegistryObject<SoundEvent> SAUROSUCHUS_DEATH = registerSoundEvents("saurosuchus_death");

    public static final ForgeSoundType SAUROSUCHUS_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SAUROSUCHUS_ROAR, ModSounds.SAUROSUCHUS_HIT, ModSounds.SAUROSUCHUS_AMBIENT, ModSounds.SAUROSUCHUS_STEP, ModSounds.SAUROSUCHUS_DEATH);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, ()-> SoundEvent.createVariableRangeEvent(new ResourceLocation(ExperiencedFood.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
