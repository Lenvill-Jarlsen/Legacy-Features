package com.Lenvill.init;

import com.Lenvill.blocks.ZyrridiumBlock;
import com.Lenvill.blocks.ZyrridiumOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class LegacyBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block zyrridium_ore = new ZyrridiumOre("zyrridium_ore", Material.ROCK);
    public static final Block zyrridium_block = new ZyrridiumBlock("zyrridium_block", Material.ROCK);
}
