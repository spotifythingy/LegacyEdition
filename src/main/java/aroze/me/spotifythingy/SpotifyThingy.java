package aroze.me.spotifythingy;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpotifyThingy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        saveDefaultConfig();

        getCommand("testauth").setExecutor(new TestAuth());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SpotifyThingy getInstance() {
        return getPlugin(SpotifyThingy.class);
    }
}
