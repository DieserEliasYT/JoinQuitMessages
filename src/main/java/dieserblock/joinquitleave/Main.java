package dieserblock.joinquitleave;

import dieserblock.joinquitleave.Listeners.JoinListener;
import dieserblock.joinquitleave.Listeners.KickListener;
import dieserblock.joinquitleave.Listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {

        // Listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(), this);
        pm.registerEvents(new QuitListener(), this);
        pm.registerEvents(new KickListener(), this);



        // Start Nachricht
        System.out.println("§a----------------------------------");
        System.out.println("§9Custom-Join/Leave Messages §aenabled!");
        System.out.println("§a----------------------------------");


        // Config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        plugin = this;


    }

    @Override
    public void onDisable() {
        // Stop Nachricht
        System.out.println("§a----------------------------------");
        System.out.println("§9Custom-Join/Leave Messages §cdisabled!");
        System.out.println("§a----------------------------------");
    }
}
