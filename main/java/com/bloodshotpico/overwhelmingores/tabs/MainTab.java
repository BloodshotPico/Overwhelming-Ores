package com.bloodshotpico.overwhelmingores.tabs;

import com.bloodshotpico.overwhelmingores.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs
{
	public MainTab()
	{
		super("owoitems");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.DIAMOND_NUGGET);
	}
}
