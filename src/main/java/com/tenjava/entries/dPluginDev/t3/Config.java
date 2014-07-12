package com.tenjava.entries.dPluginDev.t3;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class Config {
	
static TenJava plugin;
	
	//Create instance of our plugin
	public Config(TenJava instance){
		plugin = instance;
	}
	
	public static int eventChance = plugin.getConfig().getInt("eventChance");
	public static int eventRepeatDelay = plugin.getConfig().getInt("eventRepeatDelay");
	public static int meteorSpawnRadius = plugin.getConfig().getInt("meteorSpawnRadius");
	public static int meteorSpawnHeight = plugin.getConfig().getInt("meteorSpawnHeight");
	public static int meteorSizeRadius = plugin.getConfig().getInt("meteorSizeRadius");
	public static float explosionPower = plugin.getConfig().getInt("explosionPower");
	public static World enabledWorld = Bukkit.getServer().getWorld(plugin.getConfig().getString("enabledWorld"));
}
