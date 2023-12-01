package fr.me.FrenchGuys.Fly.Command;

import fr.me.FrenchGuys.Fly.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

  private Main main;

  public Fly(Main main) {
    this.main = main;
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

    Player player = (Player) sender;

    if (cmd.getName().equalsIgnoreCase("fly")) {
      if (!player.hasPermission("fly.cmd")) {
        player.sendMessage(main.getConfig().getString("messages.nopermission").replace("&", "§"));
        return true;
      } else {

        if (args.length == 0) {
          player.sendMessage(main.getConfig().getString("messages.usage").replace("&", "§"));
        } else {

          if (args.length == 1) {
            if (args[0].equalsIgnoreCase("on")) {
              player.sendMessage(main.getConfig().getString("messages.flyenable").replace("&", "§"));
              player.setAllowFlight(true);
              player.setFlying(true);


            } else {

              if (args.length == 1) {
                if (args[0].equalsIgnoreCase("off")) {
                  player.setAllowFlight(false);
                  player.setFlying(false);
                  player.sendMessage(main.getConfig().getString("messages.flydisable").replace("&", "§"));

                  }
                }
              }
            }
          }
        }
      }
      return false;
    }
  }


