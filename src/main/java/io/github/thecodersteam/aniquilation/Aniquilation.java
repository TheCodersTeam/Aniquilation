package io.github.thecodersteam.aniquilation;

import com.sk89q.bukkit.util.CommandsManagerRegistration;
import com.sk89q.minecraft.util.commands.CommandsManager;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Aniquilation extends JavaPlugin {

    private static Aniquilation instance;
    private CommandsManager<CommandSender> commands;
    private CommandsManagerRegistration cmr;
    
    @Override
    public void onEnable() {
        instance = this;
        
        this.commands = new CommandsManager<CommandSender>() {
            @Override
            public boolean hasPermission(CommandSender sender, String perm) {
                return sender instanceof ConsoleCommandSender || sender.hasPermission(perm);
            }
        };
        this.cmr = new CommandsManagerRegistration(this, this.commands);
    }
    
    @Override
    public void onDisable() {
        instance = null;
    }
    
    public static Aniquilation get() {
        return instance;
    }
    
}
