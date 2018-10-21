package com.bloodshotpico.overwhelmingores.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.overwhelmingores.blocks.EnrichedCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyCoalOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Pristine Ores
	public static final Block PRISTINE_COAL_ORE = new PristineCoalOre("pristine_coal_ore", Material.ROCK);
	
	//Wealthy Ores
	public static final Block WEALTHY_COAL_ORE = new WealthyCoalOre("wealthy_coal_ore", Material.ROCK);
	
	//Enriched Ores
	public static final Block ENRICHED_COAL_ORE = new EnrichedCoalOre("enriched_coal_ore", Material.ROCK);
	
	
	//Poor Ores
	public static final Block POOR_COAL_ORE = new PoorCoalOre("poor_coal_ore", Material.ROCK);

	//Reduced Ores
	public static final Block REDUCED_COAL_ORE = new ReducedCoalOre("reduced_coal_ore", Material.ROCK);
	
	//Scanty Ores
	public static final Block SCANTY_COAL_ORE = new ScantyCoalOre("scanty_coal_ore", Material.ROCK);
	
}
