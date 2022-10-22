package org.deepincentive.randomizedmobs;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class MobListener implements Listener {
    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent e) {
        EntityEquipment equipment = e.getEntity().getEquipment();
        if (equipment == null) {
            return;
        }

        if (e.getEntity().getType().equals(EntityType.ZOMBIE)) {
            equipment.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        }
    }
}
