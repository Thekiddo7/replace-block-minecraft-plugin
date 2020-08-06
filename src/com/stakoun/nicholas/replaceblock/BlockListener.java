package com.stakoun.nicholas.replaceblock;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public class BlockListener implements Listener {
    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {
        event.setCancelled(true);
    }
}