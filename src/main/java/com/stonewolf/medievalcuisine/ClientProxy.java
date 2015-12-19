package com.stonewolf.medievalcuisine;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.stonewolf.medievalcuisine.client.render.items.ItemRenderRegister;

public class ClientProxy extends CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		ItemRenderRegister.registerItemRenderer();
	}

	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
