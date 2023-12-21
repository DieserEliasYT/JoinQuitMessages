package dieserblock.joinquitleave.Listeners;

import dieserblock.joinquitleave.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class JoinListener implements Listener {

    static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public static void onJoin(PlayerJoinEvent e) {
        // jo
        Player p = e.getPlayer();
        String join = plugin.getConfig().getString("JoinFormat");
        e.setJoinMessage(join + e.getPlayer().getName());
    }

}
