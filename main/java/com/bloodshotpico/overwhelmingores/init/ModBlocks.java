package com.bloodshotpico.overwhelmingores.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.overwhelmingores.blocks.EnrichedCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedIronOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.EnrichedRedstoneOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorIronOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.PoorRedstoneOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineIronOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.PristineRedstoneOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedIronOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.ReducedRedstoneOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyIronOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.ScantyRedstoneOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyCoalOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyDiamondOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyEmeraldOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyGoldOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyIronOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyLapisOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyNetherQuartzOre;
import com.bloodshotpico.overwhelmingores.blocks.WealthyRedstoneOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Pristine Ores
	public static final Block PRISTINE_COAL_ORE = new PristineCoalOre("pristine_coal_ore", Material.ROCK);
	public static final Block PRISTINE_IRON_ORE = new PristineIronOre("pristine_iron_ore", Material.ROCK);
	public static final Block PRISTINE_GOLD_ORE = new PristineGoldOre("pristine_gold_ore", Material.ROCK);
	public static final Block PRISTINE_LAPIS_ORE = new PristineLapisOre("pristine_lapis_ore", Material.ROCK);
	public static final Block PRISTINE_REDSTONE_ORE = new PristineRedstoneOre("pristine_redstone_ore", Material.ROCK);
	public static final Block PRISTINE_DIAMOND_ORE = new PristineDiamondOre("pristine_diamond_ore", Material.ROCK);
	public static final Block PRISTINE_EMERALD_ORE = new PristineEmeraldOre("pristine_emerald_ore", Material.ROCK);
	public static final Block PRISTINE_NETHER_QUARTZ_ORE = new PristineNetherQuartzOre("pristine_nether_quartz_ore", Material.ROCK);
	
	//Wealthy Ores
	public static final Block WEALTHY_COAL_ORE = new WealthyCoalOre("wealthy_coal_ore", Material.ROCK);
	public static final Block WEALTHY_IRON_ORE = new WealthyIronOre("wealthy_iron_ore", Material.ROCK);
	public static final Block WEALTHY_GOLD_ORE = new WealthyGoldOre("wealthy_gold_ore", Material.ROCK);
	public static final Block WEALTHY_LAPIS_ORE = new WealthyLapisOre("wealthy_lapis_ore", Material.ROCK);
	public static final Block WEALTHY_REDSTONE_ORE = new WealthyRedstoneOre("wealthy_redstone_ore", Material.ROCK);
	public static final Block WEALTHY_DIAMOND_ORE = new WealthyDiamondOre("wealthy_diamond_ore", Material.ROCK);
	public static final Block WEALTHY_EMERALD_ORE = new WealthyEmeraldOre("wealthy_emerald_ore", Material.ROCK);
	public static final Block WEALTHY_NETHER_QUARTZ_ORE = new WealthyNetherQuartzOre("wealthy_nether_quartz_ore", Material.ROCK);
	
	//Enriched Ores
	public static final Block ENRICHED_COAL_ORE = new EnrichedCoalOre("enriched_coal_ore", Material.ROCK);
	public static final Block ENRICHED_IRON_ORE = new EnrichedIronOre("enriched_iron_ore", Material.ROCK);
	public static final Block ENRICHED_GOLD_ORE = new EnrichedGoldOre("enriched_gold_ore", Material.ROCK);
	public static final Block ENRICHED_LAPIS_ORE = new EnrichedLapisOre("enriched_lapis_ore", Material.ROCK);
	public static final Block ENRICHED_REDSTONE_ORE = new EnrichedRedstoneOre("enriched_redstone_ore", Material.ROCK);
	public static final Block ENRICHED_DIAMOND_ORE = new EnrichedDiamondOre("enriched_diamond_ore", Material.ROCK);
	public static final Block ENRICHED_EMERALD_ORE = new EnrichedEmeraldOre("enriched_emerald_ore", Material.ROCK);
	public static final Block ENRICHED_NETHER_QUARTZ_ORE = new EnrichedNetherQuartzOre("enriched_nether_quartz_ore", Material.ROCK);
	
	//Poor Ores
	public static final Block POOR_COAL_ORE = new PoorCoalOre("poor_coal_ore", Material.ROCK);
	public static final Block POOR_IRON_ORE = new PoorIronOre("poor_iron_ore", Material.ROCK);
	public static final Block POOR_GOLD_ORE = new PoorGoldOre("poor_gold_ore", Material.ROCK);
	public static final Block POOR_LAPIS_ORE = new PoorLapisOre("poor_lapis_ore", Material.ROCK);
	public static final Block POOR_REDSTONE_ORE = new PoorRedstoneOre("poor_redstone_ore", Material.ROCK);
	public static final Block POOR_DIAMOND_ORE = new PoorDiamondOre("poor_diamond_ore", Material.ROCK);
	public static final Block POOR_EMERALD_ORE = new PoorEmeraldOre("poor_emerald_ore", Material.ROCK);
	public static final Block POOR_NETHER_QUARTZ_ORE = new PoorNetherQuartzOre("poor_nether_quartz_ore", Material.ROCK);

	//Reduced Ores
	public static final Block REDUCED_COAL_ORE = new ReducedCoalOre("reduced_coal_ore", Material.ROCK);
	public static final Block REDUCED_IRON_ORE = new ReducedIronOre("reduced_iron_ore", Material.ROCK);
	public static final Block REDUCED_GOLD_ORE = new ReducedGoldOre("reduced_gold_ore", Material.ROCK);
	public static final Block REDUCED_LAPIS_ORE = new ReducedLapisOre("reduced_lapis_ore", Material.ROCK);
	public static final Block REDUCED_REDSTONE_ORE = new ReducedRedstoneOre("reduced_redstone_ore", Material.ROCK);
	public static final Block REDUCED_DIAMOND_ORE = new ReducedDiamondOre("reduced_diamond_ore", Material.ROCK);
	public static final Block REDUCED_EMERALD_ORE = new ReducedEmeraldOre("reduced_emerald_ore", Material.ROCK);
	public static final Block REDUCED_NETHER_QUARTZ_ORE = new ReducedNetherQuartzOre("reduced_nether_quartz_ore", Material.ROCK);
	
	//Scanty Ores
	public static final Block SCANTY_COAL_ORE = new ScantyCoalOre("scanty_coal_ore", Material.ROCK);
	public static final Block SCANTY_IRON_ORE = new ScantyIronOre("scanty_iron_ore", Material.ROCK);
	public static final Block SCANTY_GOLD_ORE = new ScantyGoldOre("scanty_gold_ore", Material.ROCK);
	public static final Block SCANTY_LAPIS_ORE = new ScantyLapisOre("scanty_lapis_ore", Material.ROCK);
	public static final Block SCANTY_REDSTONE_ORE = new ScantyRedstoneOre("scanty_redstone_ore", Material.ROCK);
	public static final Block SCANTY_DIAMOND_ORE = new ScantyDiamondOre("scanty_diamond_ore", Material.ROCK);
	public static final Block SCANTY_EMERALD_ORE = new ScantyEmeraldOre("scanty_emerald_ore", Material.ROCK);
	public static final Block SCANTY_NETHER_QUARTZ_ORE = new ScantyNetherQuartzOre("scanty_nether_quartz_ore", Material.ROCK);
}
