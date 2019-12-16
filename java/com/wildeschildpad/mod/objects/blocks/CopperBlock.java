package com.wildeschildpad.mod.objects.blocks;

import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.init.BlockInit;
import com.wildeschildpad.mod.init.ItemInit;
import com.wildeschildpad.mod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CopperBlock extends Block implements IHasModel
{
	public CopperBlock(String name, Material material, CreativeTabs tab) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}
