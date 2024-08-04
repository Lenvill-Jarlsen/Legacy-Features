package com.Lenvill;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class Config {
    public static Configuration config;
    public static boolean aConfigOption;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            load();
        }
    }

    //Define your options here, in this block
    public static void load() {
        config.addCustomCategoryComment("Main", "General config options.");
        aConfigOption = config.getBoolean("aConfigOption","Main",true,"A true/false config option. If you are reading this, chances are it currently does absolutely nothing");

        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(Base.MODID))
        {
            load();
        }
    }
}
