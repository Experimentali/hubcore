package me.experimental;

import me.experimental.listeners.blockBreak;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Logger log = getLogger();
        log.info("Hey there :P");

        log.info("Registering Listeners");
        getServer().getPluginManager().registerEvents(new blockBreak(), this);
    }
}