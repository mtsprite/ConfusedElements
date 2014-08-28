package com.mtsprite.confusedelements.init;

import com.mtsprite.confusedelements.item.ItemCE;
import com.mtsprite.confusedelements.item.ItemMagichallum;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static final ItemCE magichallum = new ItemMagichallum();
	
	public static void init(){
		
		GameRegistry.registerItem(magichallum, "magichallum");
	}
}
