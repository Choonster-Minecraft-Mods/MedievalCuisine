package com.stonewolf.medievalcuisine.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Porridge extends ItemFood {
	
	public Porridge(String unlocalizedName, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);		//sets the amount of hunger filled when eaten, how long it is filled and whether wolves can eat it or not
		this.setUnlocalizedName(unlocalizedName);	//sets the name of the food
		this.setCreativeTab(CreativeTabs.tabFood);  //Puts it in the food creative tab
		this.setMaxStackSize(1); 					//You can only have one of this food in each stack
	}
	
	/**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        return new ItemStack(Items.bowl);      //returns the bowl item when eaten
    }
}
