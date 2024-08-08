package com.Lenvill;

import com.Lenvill.init.LegacyItems;
import com.Lenvill.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = LegacyFeaturesMain.MODID, name = LegacyFeaturesMain.NAME, dependencies = LegacyFeaturesMain.DEPENDENCIES, version = LegacyFeaturesMain.VERSION)
public class LegacyFeaturesMain {
    public static final String MODID = "legacy_features";
    public static final String NAME = "Legacy Features";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:minefantasyreforged;";

    @SidedProxy(clientSide = "com.Lenvill.proxy.ClientProxy", serverSide = "com.Lenvill.proxy.CommonProxy")
    public static CommonProxy PROXY;

    public static CreativeTabs creativeTab = new CreativeTabs("legacy") {

        @Override
        public String getTabLabel(){
            return "legacy";
        }

        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon(){
            return new ItemStack(LegacyItems.zyrridium_dust);
        }
    };

    public static final Logger LOG = LogManager.getLogger(MODID);

    /// THE INITS! ///

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Config());
        Config.init(event.getSuggestedConfigurationFile());
        //LegacyItems.initItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        PROXY.postInit();
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