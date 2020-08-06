package com.stakoun.nicholas.replaceblock;

import org.bukkit.plugin.java.JavaPlugin;

public class ReplaceBlock extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockListener(),this);
    }

    @Override
    public void onDisable() {

    }
}
