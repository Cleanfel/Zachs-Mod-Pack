package zachsmods.registers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zachsmods.main.Main;

public class ModCrafting {

	public static void initCrafting() {
		
//------------- =+= CUSTOM CRAFTING =+= -------------//
		
//		Craft dirt into cobblestone recipe
		GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE),
				"dd",
				"dd", 'd', Blocks.DIRT);
		
//		Craft bluestone dust into bluestone recipe
		GameRegistry.addRecipe(new ItemStack(ModBlocks.bluestone),
				"bb",
				"bb", 'b', ModItems.bluestoneDust);

//		Craft Ender Ingots into Ender Block recipe
		GameRegistry.addRecipe(new ItemStack(ModBlocks.enderBlock),
				"iii",
				"iii",
				"iii", 'i', ModItems.enderIngot);
	
//		Craft obsidian and eyes of ender into Ender Block recipe
		GameRegistry.addRecipe(new ItemStack(ModBlocks.enderBlock),
				"e e",
				" o ",
				"e e", 'o', Blocks.OBSIDIAN, 'e', Items.ENDER_EYE);
		
//		Craft Ender Block into Ender Ingots recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderIngot, 9),
				new ItemStack(ModBlocks.enderBlock));
		
//		Craft Ender Block, iron ingot, gold ingot into Ender Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderIngot, 12),
				new ItemStack(ModBlocks.enderBlock, 1), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.GOLD_INGOT));
		
//		Craft Titanium Ingots into the Titanium Armor set
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHelmet),
				"ttt",
				"t t", 't', ModItems.titaniumIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumChestplate),
				"t t",
				"ttt",
				"ttt", 't', ModItems.titaniumIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumLeggings),
				"ttt",
				"t t",
				"t t", 't', ModItems.titaniumIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumBoots),
				"t t",
				"t t", 't', ModItems.titaniumIngot);
		
//		Craft a bunch of ingredients into Sushi
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sushi, 2),
				new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.PAPER), new ItemStack(Items.SUGAR), new ItemStack(Items.REEDS), new ItemStack(Items.FISH));
		
//		Craft a bunch of ingredients into Carrot Soup
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.carrotSoup, 1),
				new ItemStack(Items.BOWL), new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.CARROT), new ItemStack(Items.REEDS), new ItemStack(Items.EGG), new ItemStack(Blocks.BROWN_MUSHROOM));
		
//		Craft a bunch of ingredients into Tomato Soup
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatoSoup, 1),
				new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.REEDS), new ItemStack(ModItems.tomato), new ItemStack(Items.BOWL));
		
//		Craft obsidian and dragon eggs into the Obsidian Armor set
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHelmet),
				"ooo",
				"oso", 'o', Blocks.OBSIDIAN, 's', Items.NETHER_STAR);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianChestplate),
				"oso",
				"ooo",
				"ooo", 'o', Blocks.OBSIDIAN, 's', Items.NETHER_STAR);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianLeggings),
				"ooo",
				"oso",
				"o o", 'o', Blocks.OBSIDIAN, 's', Items.NETHER_STAR);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianBoots),
				"o o",
				"oso", 'o', Blocks.OBSIDIAN, 's', Items.NETHER_STAR);
		
//		Craft Titanium Ingots and blaze rods into the Titanium Tools set
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumSword),
				"t",
				"t",
				"b", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumShovel),
				"t",
				"b",
				"b", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumPickaxe),
				"ttt",
				" b ",
				" b ", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.titaniumAxe),
				"tt",
				"tb",
				" b", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD)*/
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.titaniumAxe),
				"tt",
				"bt",
				"b ", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHoe),
				"tt",
				"b ",
				"b ", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHoe),
				"tt",
				" b",
				" b", 't', ModItems.titaniumIngot, 'b', Items.BLAZE_ROD);
		
//		Craft Titanium Blocks and obsidian into The Ultimate Pickaxe
		GameRegistry.addRecipe(new ItemStack(ModItems.theUltimatePickaxe),
				"ooo",
				" t ",
				" t ", 'o', Blocks.OBSIDIAN, 't', ModBlocks.titaniumBlock);
		
//		Craft Titanium ingots into Titanium Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumBlock),
				"ttt",
				"ttt",
				"ttt", 't', ModItems.titaniumIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 9),
				new ItemStack(ModBlocks.titaniumBlock));
		
//		Craft some items into a name tag
		GameRegistry.addRecipe(new ItemStack(Items.NAME_TAG),
				" il",
				"igi",
				"ii ", 'i', Items.IRON_INGOT, 'g', Blocks.GOLD_BLOCK, 'l', Items.LEAD);
		
//		Craft some items into a saddle
		GameRegistry.addRecipe(new ItemStack(Items.SADDLE),
				"l l",
				"ili",
				"rir", 'l', Items.LEATHER, 'i', Items.IRON_INGOT, 'r', Items.LEAD);
		
//		Craft some materials into a Dice block
		GameRegistry.addRecipe(
				new ItemStack(ModBlocks.diceBlock),
				"qqq",
				"qiq",
				"qqq", 'q', Items.QUARTZ, 'i', Items.DYE);
		
//------------- =+= CUSTOM SMELTING =+= -------------//	
		
//		Smelting ender pearls into Ender Ingot
		GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.enderIngot, 1), 1.0F);
		
//		Smelting Titanium Ore into Titanium Ingots
		GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 3), 1.0F);
		
//		Smelting Titanium Chunks into Titanium Ingots
		GameRegistry.addSmelting(ModItems.titaniumChunk, new ItemStack(ModItems.titaniumIngot), 1.0F);
		
//		Smelting Titanium Chunks into Titanium Ingots
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 3), new ItemStack(ModItems.chocolate), 0.4F);
		
//------------- =+= CUSTOM BREWING =+= -------------//		
		
//		Brew cake to make potions of strength
		//Items.CAKE.setPotionEffect(PotionHelper.blazePowderEffect + "+6" + "+14");
				
	}	
}
