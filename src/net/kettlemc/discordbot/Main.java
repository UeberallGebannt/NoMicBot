package net.kettlemc.discordbot;

import net.kettlemc.discordbot.bot.DiscordBot;

public class Main {
	
	public static void main(String[] args) {
		for (String arg : args) {
			if (arg.startsWith("-token:")) {
				System.out.println("Token: " + arg.split(":")[1]);
			}
		}
		System.out.println("Hier könnte ihr Discordbot stehen!");
		DiscordBot bot = new DiscordBot();
		bot.start();
	}
	
}