package com.legit.enderchest.Commands;

import com.legit.enderchest.EnderChest;
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

    String prefix = msgcolor("&e[&6EnderChest&e]&r ");


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(msgcolor("&c---------- "+prefix+"&c----------"));
        sender.sendMessage(msgcolor("&e EnderChest"));
        sender.sendMessage(msgcolor("&a Author: &cLegit Killer"));
        sender.sendMessage(msgcolor("&r "));
        sender.sendMessage(msgcolor("&b/enderchest: &denderchest.open &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&b/enderchest <player>: &denderchest.opentargert &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&r "));
        sender.sendMessage(msgcolor("&bUsage: &d/enderchesthelp &7(Help Command Plugin)."));
        sender.sendMessage(msgcolor("&bUsage: &d/echelp &7(Help Command Plugin)."));
        sender.sendMessage(msgcolor("&bUsage: &d/enderchest &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&bUsage: &d/ec &7(Open EnderChest)."));
        sender.sendMessage(msgcolor("&bUsage: &d/enderchest <player> &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&bUsage: &d/ec <player> &7(Open EnderChest Other Player)."));
        sender.sendMessage(msgcolor("&c---------- "+prefix+"&c----------"));

        return true;
    }
}
