package com.Lenvill.item;

import com.Lenvill.LegacyFeaturesMain;
import com.Lenvill.init.LegacyItems;
import com.Lenvill.proxy.IClientRegister;
import net.minecraft.item.Item;

public class LegacyItemBase extends Item implements IClientRegister {

    public LegacyItemBase(String name) {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(LegacyFeaturesMain.tab);

        LegacyItems.ITEMS.add(this);
    }

    @Override
    public void registerClientModels() {
        LegacyFeaturesMain.PROXY.registerItemRenderer(this, 0, "inventory");
    }
}
