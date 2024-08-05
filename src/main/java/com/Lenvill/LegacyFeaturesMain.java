package com.Lenvill;

import com.Lenvill.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LegacyFeaturesMain.MODID, name = LegacyFeaturesMain.NAME, dependencies = LegacyFeaturesMain.DEPENDENCIES, version = LegacyFeaturesMain.VERSION)
public class LegacyFeaturesMain {
    public static final String MODID = "legacy_features";
    public static final String NAME = "Legacy Features";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:minefantasyreforged;";

    @SidedProxy(clientSide = "com.Lenvill.proxy.ClientProxy", serverSide = "com.Lenvill.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Config());
        Config.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
    /*
    TO-DO LIST
    MF2:
        Bedroll!
        Dirt-textured roads?
    MF2 Alpha:
        Pestle
        Curds
        Tea Leaf
        Mild Spice
        Salad
        Scaled Armor
        Research Scrolls
    MF1:
        Herbs!
        Zyrridium
     */
}