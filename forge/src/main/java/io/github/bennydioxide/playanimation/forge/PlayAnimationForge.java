package io.github.bennydioxide.playanimation.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.bennydioxide.playanimation.PlayAnimation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PlayAnimation.MOD_ID)
public class PlayAnimationForge {
    public PlayAnimationForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PlayAnimation.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PlayAnimation.init();
    }
}