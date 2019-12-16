package com.wildeschildpad.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.wildeschildpad.mod.Main;
import com.wildeschildpad.mod.objects.armor.ArmorBase;
import com.wildeschildpad.mod.objects.items.CopperIngot;
import com.wildeschildpad.mod.objects.items.CopperNugget;
import com.wildeschildpad.mod.objects.items.SilverIngot;
import com.wildeschildpad.mod.objects.items.SilverNugget;
import com.wildeschildpad.mod.objects.tools.ToolAxe;
import com.wildeschildpad.mod.objects.tools.ToolHoe;
import com.wildeschildpad.mod.objects.tools.ToolPickaxe;
import com.wildeschildpad.mod.objects.tools.ToolShovel;
import com.wildeschildpad.mod.objects.tools.ToolSword;
import com.wildeschildpad.mod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 3, 750, 7.0F, 2.5F, 20);
	public static final ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper_armor", Reference.MODID + ":copper", 25, new int[]{2, 6, 8, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ToolMaterial SILVER_TOOL = EnumHelper.addToolMaterial("silver_tool",3, 1561, 12.0F, 2.0F, 20);
	public static final ArmorMaterial SILVER_ARMOR = EnumHelper.addArmorMaterial("silver_armor", Reference.MODID + ":silver", 30, new int[]{3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);
	
	//Items
	public static final Item COPPER_INGOT = new CopperIngot("copper_ingot", Main.wildeschildpad);
	public static final Item SILVER_INGOT = new SilverIngot("silver_ingot", Main.wildeschildpad);
	public static final Item COPPER_NUGGET = new CopperNugget("copper_nugget", Main.wildeschildpad);
	public static final Item SILVER_NUGGET = new SilverNugget("silver_nugget", Main.wildeschildpad);
	
	//Tools
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", COPPER_TOOL, Main.wildeschildpad);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", COPPER_TOOL, Main.wildeschildpad);
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", COPPER_TOOL, Main.wildeschildpad);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", COPPER_TOOL, Main.wildeschildpad);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", COPPER_TOOL, Main.wildeschildpad);
	
	public static final Item SILVER_SWORD = new ToolSword("silver_sword", SILVER_TOOL, Main.wildeschildpad);
	public static final Item SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", SILVER_TOOL, Main.wildeschildpad);
	public static final Item SILVER_AXE = new ToolAxe("silver_axe", SILVER_TOOL, Main.wildeschildpad);
	public static final Item SILVER_SHOVEL = new ToolShovel("silver_shovel", SILVER_TOOL, Main.wildeschildpad);
	public static final Item SILVER_HOE = new ToolHoe("silver_hoe", SILVER_TOOL, Main.wildeschildpad);
	
	//Armor
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", COPPER_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", COPPER_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", COPPER_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", COPPER_ARMOR, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SILVER_HELMET = new ArmorBase("silver_helmet", SILVER_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new ArmorBase("silver_chestplate", SILVER_ARMOR, 2, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new ArmorBase("silver_leggings", SILVER_ARMOR, 1, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new ArmorBase("silver_boots", SILVER_ARMOR, 1, EntityEquipmentSlot.FEET);
}
