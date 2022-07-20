package io.github.bennydioxide.playanimation;

import dev.architectury.event.events.common.CommandRegistrationEvent;
import io.github.bennydioxide.playanimation.commands.PlayAnimationCommand;

public class PlayAnimation {
    public static final String MOD_ID = "playanimation";

    public static void init() {
        CommandRegistrationEvent.EVENT.register((dispatcher, selection) -> PlayAnimationCommand.register(dispatcher));
    }
}