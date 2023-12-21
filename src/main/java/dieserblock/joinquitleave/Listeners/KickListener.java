package dieserblock.joinquitleave.Listeners;

import dieserblock.joinquitleave.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.plugin.Plugin;

public class KickListener implements Listener {
    static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public static void onKick(PlayerKickEvent e) {
        Player p = e.getPlayer();
        String leave = plugin.getConfig().getString("KickFormat");
        e.setLeaveMessage(leave + e.getPlayer().getName());
    }
}
