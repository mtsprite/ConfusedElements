package com.mtsprite.confusedelements.client.gui;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.mtsprite.confusedelements.handlers.ConfigurationHandler;
import com.mtsprite.confusedelements.refrence.Refrence;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ModGuiConfig extends GuiConfig{

	public ModGuiConfig(GuiScreen guiScreen){
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
		        Refrence.MOD_ID,
		        false,
		        false,
		        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}