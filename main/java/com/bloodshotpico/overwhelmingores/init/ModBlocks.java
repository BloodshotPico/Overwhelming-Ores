package com.bloodshotpico.overwhelmingores.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.overwhelmingores.blocks.EnrichedCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorCoalOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Poor Coal Ores
	public static final Block POOR_COAL_ORE = new PoorCoalOre("poor_coal_ore", Material.ROCK);
	//Rich Coal Ores
	public static final Block ENRICHED_COAL_ORE = new EnrichedCoalOre("enriched_coal_ore", Material.ROCK);
}
