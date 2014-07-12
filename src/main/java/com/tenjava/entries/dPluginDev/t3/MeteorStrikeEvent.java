package com.tenjava.entries.dPluginDev.t3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class MeteorStrikeEvent {
	
	private static Random rand = new Random();

	public static void strikeMeteor(World world){
		int meteorX = rand.nextInt((Config.meteorSpawnRadius - world.getSpawnLocation().getBlockX()) + 1) + world.getSpawnLocation().getBlockX();
	    int meteorZ = rand.nextInt((Config.meteorSpawnRadius - world.getSpawnLocation().getBlockZ()) + 1) + world.getSpawnLocation().getBlockZ();
	    Location meteorCenter = new Location(Config.enabledWorld, (double) meteorX, (double) Config.meteorSpawnHeight, (double) meteorZ);
	    
	    for (Location loc : generateSphere(meteorCenter, Config.meteorSizeRadius, false)){
	    	loc.getBlock().setType(Material.GRAVEL);
	    }
	    
	    Location explodeLoc = new Location(Config.enabledWorld, meteorX, meteorCenter.getBlockY()-Config.meteorSizeRadius, meteorZ);
	    
	    while (!explodeLoc.getBlock().getType().isSolid()){
	    	explodeLoc.subtract(0, 1, 0);
	    }
	
	    if (explodeLoc.getBlock().getType().isSolid()){
	    	Config.enabledWorld.createExplosion(explodeLoc, Config.explosionPower);
	    }
	}
	
	public static List<Location> generateSphere(Location centerBlock, int radius, boolean hollow){
		List<Location> circleBlocks = new ArrayList<Location>();
		int bX = centerBlock.getBlockX();
		int bY = centerBlock.getBlockY();
		int bZ = centerBlock.getBlockZ();
		
		for (int x = bX - radius; x <= bX + radius; x++){
			for (int y = bY - radius; y <= bY + radius; y++){
				for (int z = bZ - radius; z <= bZ + radius; z++){
					double distance = ((bX - x)*(bX-x)) + ((bZ - z)*(bZ-z)) + ((bY - y)*(bY-y));
					
					if (distance < radius * radius && !(hollow && distance < ((radius - 1)*(radius-1)))){
						Location loc = new Location(centerBlock.getWorld(), x, y, z);
						circleBlocks.add(loc);
					}
				}
			}
		}
		
		return circleBlocks;
	}
}
