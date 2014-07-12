package com.tenjava.entries.dPluginDev.t3;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	static PluginManager pm = Bukkit.getServer().getPluginManager();
	
	public void onEnable(){
		System.out.println("Plugin has been successfully enabled!");
		pm.registerEvents(new RandomEvents(), this);
	}
	
	public void onDisable(){
		System.out.println("Plugin has been successfully disabled!");
	}
}
