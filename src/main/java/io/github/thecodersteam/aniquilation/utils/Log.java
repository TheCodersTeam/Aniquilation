package io.github.thecodersteam.aniquilation.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.Plugin;

public class Log {

    private static Logger log;
    private static boolean debugging = false;
    
    public static void log(Level level, String... msgs) {
        for(String m : msgs) {
            log.log(level, m);
        }
    }
    
    public static void info(String... msgs) {
        log(Level.INFO, msgs);
    }
    
    public static void debug(String... msgs) {
        if (debugging) {
            info("[DEBUG] " + msgs);
        }
    }
    
    public static void warning(String... msgs) {
        log(Level.WARNING, msgs);
    }
    
    public static void severe(String... msgs) {
        log(Level.SEVERE, msgs);
    }
    
    public static void log(String... msgs) {
        info(msgs);
    }
    
    public static boolean isDebugging() {
        return debugging;
    }
    
    public static void setDebugging(boolean debugging) {
        Log.debugging = debugging;
    }
    
    public static void init(Plugin plugin, boolean debug) {
        Log.log = plugin.getLogger();
        if (debug) setDebugging(true);
    }
    
    private Log() {}
    
}