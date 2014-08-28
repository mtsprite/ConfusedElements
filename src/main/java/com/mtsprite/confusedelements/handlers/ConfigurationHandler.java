package com.mtsprite.confusedelements.handlers;

import java.io.File;

import com.mtsprite.confusedelements.refrence.Refrence;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile){
		
		
		//create configuration object based on the suggested configuration file
		if (configuration == null){
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
		
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent event){
		
		if(event.modID.equals(Refrence.MOD_ID)){
			
			loadConfiguration();
			
		}
	}
	
	private static void loadConfiguration(){
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This sis an example config value");
		
		if (configuration.hasChanged()){
			configuration.save();
		}
	}
}
