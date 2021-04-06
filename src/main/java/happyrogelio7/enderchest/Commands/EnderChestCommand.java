package happyrogelio7.enderchest.Commands;

import happyrogelio7.enderchest.EnderChest;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.function.IntFunction;

public class EnderChestCommand implements CommandExecutor {

    private EnderChest plugin;

    public EnderChestCommand(EnderChest plugin){
        this.plugin = plugin;
    }

    private String msgcolor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    String prefix = msgcolor("&5[&dEnderChest&5]&r ");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&cThis Command does not work on console players only."));
            return false;
        } else {

            if (args.length == 0 ){

                Player p = (Player) sender;

                if (!p.hasPermission("enderchest.open")) {

                    p.sendMessage(msgcolor(prefix + "&cNo Permission."));
                    return true;

                } else {

                    p.openInventory(p.getEnderChest());
                    p.sendMessage(msgcolor(prefix + "&fOpen EnderChest"));

                }

            }

            if (args.length > 0) {

                Player p = (Player) sender;

                if (!p.hasPermission("enderchest.opentargert")) {

                    p.sendMessage(msgcolor(prefix + "&cNo Permission."));
                    return true;

                } else {

                    String name = args[0];

                    if (Bukkit.getPlayer(name) == null) {

                        p.sendMessage(msgcolor(prefix + "&cPlayer Offline. :("));
                        return true;

                    }

                    Player target = Bukkit.getPlayer(name);

                    if (p == target) {

                        p.openInventory(p.getEnderChest());
                        p.sendMessage(msgcolor(prefix + "&fOpen You EnderChest."));

                    }

                    p.openInventory(target.getEnderChest());
                }
            }

        }

        return true;
    }
}
