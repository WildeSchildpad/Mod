package com.wildeschildpad.mod.tabs;

import com.wildeschildpad.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WildeSchildpadTab extends CreativeTabs 
{
	public WildeSchildpadTab(String label) 
	{
		super("wildeschildpad");
		this.setBackgroundImageName("wildeschildpad.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.COPPER_INGOT);
	}
}
