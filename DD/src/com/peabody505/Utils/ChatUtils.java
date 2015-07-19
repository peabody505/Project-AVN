package com.peabody505.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChatUtils {
	
	public static void broadcast(String msg, String color) {
		for (Player players : Bukkit.getOnlinePlayers()) {
			players.sendMessage(starter(color) + msg);
		}
	}
	
	private static String starter(String color) {
		if (color.equalsIgnoreCase("blue")) {
			return "�3�l >> �b";
		} else 
		if (color.equalsIgnoreCase("red")) {
			return "�4�l >> �c";
		} else
		if (color.equalsIgnoreCase("green")) {
			return "�2�l >> �a";
		} else
		if (color.equalsIgnoreCase("yellow")) {
			return "�6�l >> �e";
		} else
		if (color.equalsIgnoreCase("pink")) {
			return "�5�l >> �d";
		} else
		if (color.equalsIgnoreCase("white")) {
			return "�7�l >> �f";
		} else {
			return ("�f");
		}
	}
}
