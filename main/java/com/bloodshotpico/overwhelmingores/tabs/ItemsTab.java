package com.bloodshotpico.overwhelmingores.tabs;

import com.bloodshotpico.overwhelmingores.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemsTab extends CreativeTabs
{
	public ItemsTab()
	{
		super("owoitems");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.DIAMOND_NUGGET);
	}
}
