package io.github.bennydioxide.playanimation.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.*;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.util.FormattedCharSequence;

import java.util.List;

public class PlayAnimationCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("playanimation")
                .requires(commandSourceStack -> commandSourceStack.hasPermission(1)) // Matching bedrock
                .then(Commands.argument("target", EntityArgument.entity())
                        .then(Commands.argument("animation", StringArgumentType.string())) // Placeholder
                        .executes(ctx -> {
                            ctx.getSource().sendSuccess(Component.translatable(
                                    "playanimation.sucess",
                                    StringArgumentType.getString(ctx, "animation"),
                                    EntityArgument.getEntity(ctx, "target")), false);
                            return Command.SINGLE_SUCCESS;
                        })));
    }
}
