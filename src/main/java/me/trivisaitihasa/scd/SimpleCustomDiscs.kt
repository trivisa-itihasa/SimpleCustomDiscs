package me.trivisaitihasa.scd;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/*
 *  Minecraft plugin that adds custom music discs the users uploaded.
 */

internal class SimpleCustomDiscs : JavaPlugin() {

    override fun onEnable() {
        try {
            load();
        } catch (e: Exception) {
            e.printStackTrace();
            server.pluginManager.disablePlugin(this);
        }
    }

    override fun onDisable() {
        Bukkit.getConsoleSender().sendMessage("Plugin disabled.");
    }

    private fun load() {
        Bukkit.getConsoleSender().sendMessage("Plugin loaded.");
    }
}