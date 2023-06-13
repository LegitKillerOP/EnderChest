package com.legit.enderchest;

import com.legit.enderchest.Commands.EnderChestCommand;
import com.legit.enderchest.Commands.EnderChestHelpCommand;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderChest extends JavaPlugin {

    private String msgcolor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    String prefix = msgcolor("&e[&6EnderChest&e]&r ");

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eEnderChest Plugin Started !!"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&ePlugin Version: &c1.0"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&ePlugin Made By: &cLegit Killer"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));

        this.getCommand("enderchest").setExecutor(new EnderChestCommand(this));
        this.getCommand("enderchesthelp").setExecutor(new EnderChestHelpCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eEnderChest Plugin Stopped !!"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
    }
}
