package com.mtsprite.confusedelements;

import com.mtsprite.confusedelements.handlers.ConfigurationHandler;
import com.mtsprite.confusedelements.init.ModBlocks;
import com.mtsprite.confusedelements.init.ModItems;
import com.mtsprite.confusedelements.proxy.IProxy;
import com.mtsprite.confusedelements.refrence.Refrence;
import com.mtsprite.confusedelements.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.MOD_VERSION, guiFactory = Refrence.GUI_FACTORY_CLASS)
public class ConfusedElements {
	
	@Instance(Refrence.MOD_ID)
	public static ConfusedElements instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	private void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre-Initialization Complete!");
		
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	private void init(FMLInitializationEvent event){
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("Post-Initialization Complete!");
	}
}
