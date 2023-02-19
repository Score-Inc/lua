package emu.grasscutter.command.commands;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import java.util.List;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;

@Command(label = "windy", usage = "", aliases = { "w" }, permission = "player.windy", permissionTargeted = "player.windy.others")
public class WindyCommand implements CommandHandler
{
    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
		
		String path = "lua/src/out/" + args.get(0) + ".luac";
		targetPlayer.sendPacket(new PacketWindSeedClientNotify(path));
        CommandHandler.sendMessage(sender, "Windy!");
    }
}   