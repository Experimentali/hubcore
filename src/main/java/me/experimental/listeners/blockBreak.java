package me.experimental.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class blockBreak implements Listener {
    @EventHandler
    public void blockBreakEvent(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPermission("fts.lobby.block.break")) {
            e.setCancelled(true);
        }
    }
}
