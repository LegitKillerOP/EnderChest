package com.github.happyrogelio7.enderchest;

import com.github.happyrogelio7.enderchest.Commands.EnderChestCommand;
import com.github.happyrogelio7.enderchest.Commands.EnderChestHelpCommand;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderChest extends JavaPlugin {

    private String msgcolor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    String prefix = msgcolor("&5[&dEnderChest&5]&r ");

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&5------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&aON &dEnderChest &9Version 1.0.1"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&dGitHub: &fhttps://github.com/HappyRogelio7/"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eRepositories: &fhttps://github.com/HappyRogelio7/EnderChest-Plugin-Command-MC"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&5------------------------------"));

        this.getCommand("enderchest").setExecutor(new EnderChestCommand (this));
        this.getCommand("enderchesthelp").setExecutor(new EnderChestHelpCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&5------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&4OFF &dEnderChest &9Version 1.0.1"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&dGitHub: &fhttps://github.com/HappyRogelio7/"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eRepositories: &fhttps://github.com/HappyRogelio7/EnderChest-Plugin-Command-MC"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&5------------------------------"));
    }
}
