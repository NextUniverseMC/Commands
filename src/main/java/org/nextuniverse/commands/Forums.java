package org.nextuniverse.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.plugin.Command;

/**
 * Created by TheDiamondPicks on 3/10/2017.
 */
public class Forums extends Command {
    public Forums() {
        super("forums");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        HoverEvent hover = new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to open the forums in your browser").color(ChatColor.DARK_PURPLE).create());
        ClickEvent click = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://forums.nextuniverse.org");
        commandSender.sendMessage(new ComponentBuilder("Our Forums » ").color(ChatColor.DARK_PURPLE).bold(true).append("Click here").color(ChatColor.WHITE).bold(false).event(click).event(hover).create());
    }
}
