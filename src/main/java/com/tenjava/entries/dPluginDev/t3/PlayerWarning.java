package com.tenjava.entries.dPluginDev.t3;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerWarning implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "!" + ChatColor.RED + "" + ChatColor.BOLD + "] " + ChatColor.GRAY + "" + ChatColor.BOLD + "Be carefule, citizen, we have recieved warnings of a meteor strike in our future!");
	}
}
