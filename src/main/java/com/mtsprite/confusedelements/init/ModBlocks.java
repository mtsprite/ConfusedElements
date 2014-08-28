package com.mtsprite.confusedelements.init;

import com.mtsprite.confusedelements.block.BlockCE;
import com.mtsprite.confusedelements.block.BlockMagichallum;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final BlockCE MagichallumBlock = new BlockMagichallum();
	
	public static void init(){
		GameRegistry.registerBlock(MagichallumBlock, "magichallumBlock");
	}
}
