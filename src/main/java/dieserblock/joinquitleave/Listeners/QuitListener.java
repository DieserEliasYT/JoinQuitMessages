package dieserblock.joinquitleave.Listeners;

import dieserblock.joinquitleave.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class QuitListener implements Listener {
    static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public static void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String quit = plugin.getConfig().getString("QuitFormat");
        e.setQuitMessage(quit + e.getPlayer().getName());
    }
}
