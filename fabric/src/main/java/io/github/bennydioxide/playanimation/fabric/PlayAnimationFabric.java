package io.github.bennydioxide.playanimation.fabric;

import io.github.bennydioxide.playanimation.PlayAnimation;
import net.fabricmc.api.ModInitializer;

public class PlayAnimationFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PlayAnimation.init();
    }
}