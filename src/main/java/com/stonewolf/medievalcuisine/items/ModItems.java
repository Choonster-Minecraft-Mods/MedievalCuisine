package com.stonewolf.medievalcuisine.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item flour;
	public static Item porridge;
	
	
	public static final void createItems() {
		
		GameRegistry.registerItem(flour = new Flour("flour"), "flour");
		GameRegistry.registerItem(porridge = new Porridge("porridge", 4, 0.3f, false), "porridge");
	}

}
