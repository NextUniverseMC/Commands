package org.nextuniverse.commands;

import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by TheDiamondPicks on 3/10/2017.
 */
public class Main extends Plugin {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new Store());
        getProxy().getPluginManager().registerCommand(this, new Forums());
        getProxy().getPluginManager().registerCommand(this, new Discord());
        getProxy().getPluginManager().registerCommand(this, new Twitter());
    }
}
