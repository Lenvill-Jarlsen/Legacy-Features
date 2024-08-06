package com.Lenvill.blocks;

import com.Lenvill.LegacyFeaturesMain;
import com.Lenvill.proxy.IClientRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LegacyBlockBase extends Block implements IClientRegister {

    public LegacyBlockBase (String name, Material material){
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
    }

    @Override
    public void registerClientModels(){
        LegacyFeaturesMain.PROXY.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
