package com.wildeschildpad.mod.objects.tools;

import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.init.ItemInit;
import com.wildeschildpad.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	public ToolPickaxe(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
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
