package com.stonewolf.medievalcuisine.client.render.items;

import com.stonewolf.medievalcuisine.Main;
import com.stonewolf.medievalcuisine.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modid = Main.MODID;
	
	public static void registerItemRenderer() {
		
		reg(ModItems.porridge);
		reg(ModItems.flour);
	}
	
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
