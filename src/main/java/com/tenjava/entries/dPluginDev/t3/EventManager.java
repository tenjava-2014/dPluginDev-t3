package com.tenjava.entries.dPluginDev.t3;

import java.util.Random;

import org.bukkit.scheduler.BukkitRunnable;

public class EventManager{
	
	private static BukkitRunnable eventCaller;
	
	public EventManager(){
		eventCaller = new BukkitRunnable(){
			public void run() {
				Random r = new Random();
				if (r.nextInt(100) < Config.eventChance){
					MeteorStrikeEvent.strikeMeteor(Config.enabledWorld);
				}
			}
		};
		eventCaller.runTaskTimer(new TenJava(), Config.eventRepeatDelay * 20L, Config.eventRepeatDelay * 20L);
	}
}
