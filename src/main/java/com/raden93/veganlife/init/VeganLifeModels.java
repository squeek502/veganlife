package com.raden93.veganlife.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class VeganLifeModels {
	@SubscribeEvent
	public static void register(ModelRegistryEvent event) {
		//Jute
		register(VeganLifeItems.jute_stalk_item);
		register(VeganLifeItems.jute_fibre_item);
		register(VeganLifeItems.jute_seeds_item);
		register(VeganLifeItems.burlap_item);
		register(Item.getItemFromBlock(VeganLifeBlocks.bale_of_jute_block));
		
		//bioplastic
		register(VeganLifeItems.potato_starch_item);
	}
	
	private static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
