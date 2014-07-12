package com.tenjava.entries.dPluginDev.t3;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	static PluginManager pm = Bukkit.getServer().getPluginManager();
	public static TenJava plugin;
	
	public void onEnable(){
		plugin = this;
		pm.registerEvents(new PlayerWarning(), this);
		System.out.println("Plugin has been successfully enabled!");
	}
	
	public void onDisable(){
		System.out.println("Plugin has been successfully disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		if (cmd.getName().equalsIgnoreCase("meteor")){
			MeteorStrikeEvent.strikeMeteor(Config.enabledWorld);
		}
		return true;
	}
}
