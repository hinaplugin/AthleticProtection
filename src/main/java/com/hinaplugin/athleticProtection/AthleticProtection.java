package com.hinaplugin.athleticProtection;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class AthleticProtection extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new PlayerDamageArrowListener(), this);
        this.getLogger().info("AthleticProtection is Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll(this);
        this.getLogger().info("AthleticProtection is Disabled!");
    }
}
