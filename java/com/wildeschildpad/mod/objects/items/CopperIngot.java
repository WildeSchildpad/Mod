package com.wildeschildpad.mod.objects.items;

import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.init.ItemInit;
import com.wildeschildpad.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperIngot extends Item implements IHasModel
{
	public CopperIngot(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
