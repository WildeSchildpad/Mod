package com.wildeschildpad.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.init.ItemInit;
import com.wildeschildpad.mod.util.IHasModel;

import akka.actor.FSM.State;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
	public ToolAxe(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) 
	{
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerModel(this, 0);
	}
}
