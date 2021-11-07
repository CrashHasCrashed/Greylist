package com.crashhascrashed.greylist;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityInteractEvent;

public class PlayerListener implements Listener {
    private static final String authorizedMemberPermission = "com.crashhascrashed.greylist.authorized";

    //Make sure player can't be damaged
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event){
        if(event.getEntityType().equals(EntityType.PLAYER)){
            if(!event.getEntity().hasPermission(authorizedMemberPermission)){
                event.setCancelled(true);
            }
        }
    }

    //Make sure player can't damage others
    //Make sure players can't break blocks
    //Make sure players can't place blocks
    //Make sure players can't interact
    @EventHandler
    public void onPlayerInteract(EntityInteractEvent event){
        if(event.getEntityType().equals(EntityType.PLAYER)){
            if(!event.getEntity().hasPermission(authorizedMemberPermission)){
                event.setCancelled(true);
            }
        }
    }
}
