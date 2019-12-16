package com.wildeschildpad.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.objects.blocks.CopperBlock;
import com.wildeschildpad.mod.objects.blocks.CrackedBricks;
import com.wildeschildpad.mod.objects.blocks.MossyBricks;
import com.wildeschildpad.mod.objects.blocks.SilverBlock;
import com.wildeschildpad.mod.objects.blocks.slab.BlockDoubleSlabBase;
import com.wildeschildpad.mod.objects.blocks.slab.BlockHalfSlabBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON, Main.wildeschildpad);
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON, Main.wildeschildpad);
	public static final Block CRACKED_BRICKS = new CrackedBricks("cracked_bricks", Material.ROCK, Main.wildeschildpad);
	public static final Block MOSSY_BRICKS = new MossyBricks("mossy_bricks", Material.ROCK, Main.wildeschildpad);
	public static final BlockSlab CRACKED_BRICK_SLAB_DOUBLE = new BlockDoubleSlabBase("double_cracked_bricks_slab", Material.ROCK, Main.wildeschildpad, BlockInit.CRACKED_BRICK_SLAB_HALF);
	public static final BlockSlab CRACKED_BRICK_SLAB_HALF = new BlockHalfSlabBase("cracked_bricks_slab", Material.ROCK, Main.wildeschildpad, BlockInit.CRACKED_BRICK_SLAB_HALF, BlockInit.CRACKED_BRICK_SLAB_DOUBLE);
}
