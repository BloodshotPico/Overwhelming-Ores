package com.bloodshotpico.overwhelmingores;

import com.bloodshotpico.overwhelmingores.init.ModRecipes;
import com.bloodshotpico.overwhelmingores.proxy.CommonProxy;
import com.bloodshotpico.overwhelmingores.util.Reference;
import com.bloodshotpico.overwhelmingores.world.ModWorldGen;
import com.bloodshotpico.overwhelmingores.tabs.MainTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs MainTab = new MainTab();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
	//	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
	//	ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
