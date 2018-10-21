package com.bloodshotpico.overwhelmingores.items;

import net.minecraft.item.ItemStack;

public class ItemNugget extends ItemBase
{

	public ItemNugget(String name) 
	{
		super(name);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemstack)
	{
		return 200;
	}
	
}