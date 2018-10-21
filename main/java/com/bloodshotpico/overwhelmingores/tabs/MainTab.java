package com.bloodshotpico.overwhelmingores.tabs;

import com.bloodshotpico.overwhelmingores.init.ModBlocks;
import com.bloodshotpico.overwhelmingores.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs
{
	public MainTab()
	{
		super("owoblocks");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModBlocks.SCANTY_COAL_ORE);
	}
}
