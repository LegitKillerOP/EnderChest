package com.github.happyrogelio7.enderchest.Commands;

import com.github.happyrogelio7.enderchest.EnderChest;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderChestHelpCommand implements CommandExecutor {

    private EnderChest plugin;

    public EnderChestHelpCommand(EnderChest plugin){
        this.plugin = plugin;
    }

    private String msgcolor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    String prefix = msgcolor("&5[&dEnderChest&5]&r ");


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(msgcolor("&5---------- "+prefix+"&5----------"));
        sender.sendMessage(msgcolor("&d EnderChest"));
        sender.sendMessage(msgcolor("&9 Version: &f1.0.1"));
        sender.sendMessage(msgcolor("&a Author: &fHappyRogelio7"));
        sender.sendMessage(msgcolor("&d GitHub: &fhttps://github.com/HappyRogelio7/"));
        sender.sendMessage(msgcolor("&e Repositories: &fhttps://github.com/HappyRogelio7/EnderChest-Plugin-Command-MC"));
        sender.sendMessage(msgcolor("&r "));
        sender.sendMessage(msgcolor("&5/enderchest: &denderchest.open &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&5/enderchest <player>: &denderchest.opentargert &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&r "));
        sender.sendMessage(msgcolor("&5Usage: &d/enderchesthelp &7(Help Command Plugin)."));
        sender.sendMessage(msgcolor("&5Usage: &d/echelp &7(Help Command Plugin)."));
        sender.sendMessage(msgcolor("&5Usage: &d/enderchest &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&5Usage: &d/ec &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&5Usage: &d/enderchest <player> &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&5Usage: &d/ec <player> &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&5---------- "+prefix+"&5----------"));

        return true;
    }
}
