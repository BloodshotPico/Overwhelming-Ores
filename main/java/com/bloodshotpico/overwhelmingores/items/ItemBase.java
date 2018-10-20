package com.bloodshotpico.overwhelmingores.items;

import com.bloodshotpico.overwhelmingores.Main;
import com.bloodshotpico.overwhelmingores.init.ModItems;
import com.bloodshotpico.overwhelmingores.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ItemsTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this,  0, "inventory");
	}
}
