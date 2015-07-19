package com.peabody505;

import org.bukkit.plugin.java.JavaPlugin;

import com.peabody505.Threads.StartCountdown;

public class DD extends JavaPlugin{
	
	public void onEnable() {
		new Thread(new StartCountdown()).start();
	}
	
	public static void start() {
		
	}

	public static void stop() {
		
	}
}
