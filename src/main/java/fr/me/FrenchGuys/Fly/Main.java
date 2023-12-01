package fr.me.FrenchGuys.Fly;

import fr.me.FrenchGuys.Fly.Command.Fly;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {

    saveDefaultConfig();

    System.out.println("---------------");
    System.out.println("[Fly] Enable");
    System.out.println("[Fly] Join the discord");
    System.out.println("[Fly] https://discord.com/invite/ZjwruYffD4");
    System.out.println("---------------");

    getCommand("fly").setExecutor(new Fly(this));


  }

  @Override
  public void onDisable() {
    System.out.println("---------------");
    System.out.println("[Fly] Disable");
    System.out.println("[Fly] Join the discord");
    System.out.println("[Fly] https://discord.com/invite/ZjwruYffD4");
    System.out.println("---------------");
  }
}
