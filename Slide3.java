package slide3.slide3;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Slide3 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Slide is Enabled");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent event){
        Player player = event.getPlayer();
        Location funnyblock = player.getLocation();1
        funnyblock.setY(funnyblock.getY() + 1);
        Block block = funnyblock.getBlock();
        block.setType(Material.BARRIER);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Slide is Disabled");
    }
