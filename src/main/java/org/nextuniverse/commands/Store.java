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
public class Store extends Command {
    public Store() {
        super("store");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        HoverEvent hover = new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to open the store in your browser").color(ChatColor.DARK_GREEN).create());
        ClickEvent click = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://store.nextuniverse.org");
        commandSender.sendMessage(new ComponentBuilder("Server Store » ").color(ChatColor.DARK_GREEN).bold(true).append("Click here").color(ChatColor.WHITE).bold(false).event(click).event(hover).create());
    }
}
