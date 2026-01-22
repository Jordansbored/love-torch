package com.jordansbored.lovetorch;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

/**
 * Love Torch Plugin
 */
public class LoveTorchPlugin extends JavaPlugin {
    
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public LoveTorchPlugin(@Nonnull JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Love Torch plugin loaded - version " + this.getManifest().getVersion().toString());
    }

    @Override
    protected void setup() {
        LOGGER.atInfo().log("Love Torch plugin enabled!");
    }
}
