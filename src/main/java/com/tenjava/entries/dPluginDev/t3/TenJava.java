package com.tenjava.entries.dPluginDev.t3;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	public static TenJava plugin;
	
	public void onEnable(){
		plugin = this;
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerWarning(), this);
		System.out.println("Plugin has been successfully enabled!");
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}
	
	public void onDisable(){
		System.out.println("Plugin has been successfully disabled!");
	}
}
