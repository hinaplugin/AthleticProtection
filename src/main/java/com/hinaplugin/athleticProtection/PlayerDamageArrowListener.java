package com.hinaplugin.athleticProtection;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.projectiles.ProjectileSource;

public class PlayerDamageArrowListener implements Listener {

    @EventHandler
    public void onPlayerDamageArrow(EntityDamageByEntityEvent event){
        if (event.getEntity() instanceof Player player && event.getDamager() instanceof Arrow arrow){
            final ProjectileSource projectileSource = arrow.getShooter();
            final Player sourcePlayer = (Player) projectileSource;
            if (!player.equals(sourcePlayer)){
                event.setDamage(0);
                event.setCancelled(true);
            }
        }
    }
}
