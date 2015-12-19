package com.stonewolf.medievalcuisine.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.stonewolf.medievalcuisine.items.ModItems;

public class ModCrafting {
	
	public static void initCrafting() {
			
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.porridge), Items.wheat, Items.bowl);
	
	}
}
