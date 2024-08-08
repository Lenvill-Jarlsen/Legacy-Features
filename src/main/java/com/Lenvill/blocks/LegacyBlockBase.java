package com.Lenvill.blocks;

import com.Lenvill.LegacyFeaturesMain;
import com.Lenvill.init.LegacyBlocks;
import com.Lenvill.init.LegacyItems;
import com.Lenvill.proxy.IClientRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LegacyBlockBase extends Block implements IClientRegister {

    public LegacyBlockBase (String name, Material material){
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(LegacyFeaturesMain.creativeTab);

        LegacyBlocks.BLOCKS.add(this);
        LegacyItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void registerClientModels() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "normal"));
    }
}
