package com.tenjava.entries.dPluginDev.t3;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class MeteorStrikeEvent {
	
	private static Random rand = new Random();

	@SuppressWarnings("deprecation")
	public static void strikeMeteor(World world){
		int meteorX = rand.nextInt((Config.meteorSpawnRadius - world.getSpawnLocation().getBlockX()) + 1) + world.getSpawnLocation().getBlockX();
	    int meteorZ = rand.nextInt((Config.meteorSpawnRadius - world.getSpawnLocation().getBlockZ()) + 1) + world.getSpawnLocation().getBlockZ();
	    
	    world.spawnFallingBlock(new Location(world, (double) meteorX, (double) Config.meteorSpawnHeight, (double) meteorZ), Material.STONE, (byte) 0);
	}
}
