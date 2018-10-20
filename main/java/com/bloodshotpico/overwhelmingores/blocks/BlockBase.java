package com.bloodshotpico.overwhelmingores.blocks;

import com.bloodshotpico.overwhelmingores.Main;
import com.bloodshotpico.overwhelmingores.init.ModBlocks;
import com.bloodshotpico.overwhelmingores.init.ModItems;
import com.bloodshotpico.overwhelmingores.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));	
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
