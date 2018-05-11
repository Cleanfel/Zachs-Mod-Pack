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
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone),
				"dd",
				"dd", 'd', Blocks.dirt);
		
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
				"e e", 'o', Blocks.obsidian, 'e', Items.ender_eye);
		
//		Craft Ender Block into Ender Ingots recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderIngot, 9),
				new ItemStack(ModBlocks.enderBlock));
		
//		Craft Ender Block, iron ingot, gold ingot into Ender Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderIngot, 12),
				new ItemStack(ModBlocks.enderBlock, 1), new ItemStack(Items.iron_ingot), new ItemStack(Items.gold_ingot));
		
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
				new ItemStack(Items.water_bucket), new ItemStack(Items.paper), new ItemStack(Items.sugar), new ItemStack(Items.reeds), new ItemStack(Items.fish));
		
//		Craft a bunch of ingredients into Carrot Soup
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.carrotSoup, 1),
				new ItemStack(Items.bowl), new ItemStack(Items.milk_bucket), new ItemStack(Items.carrot), new ItemStack(Items.reeds), new ItemStack(Items.egg), new ItemStack(Blocks.brown_mushroom));
		
//		Craft a bunch of ingredients into Tomato Soup
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatoSoup, 1),
				new ItemStack(Items.milk_bucket), new ItemStack(Items.water_bucket), new ItemStack(Items.reeds), new ItemStack(ModItems.tomato), new ItemStack(Items.bowl));
		
//		Craft obsidian and dragon eggs into the Obsidian Armor set
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHelmet),
				"ooo",
				"oso", 'o', Blocks.obsidian, 's', Items.nether_star);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianChestplate),
				"oso",
				"ooo",
				"ooo", 'o', Blocks.obsidian, 's', Items.nether_star);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianLeggings),
				"ooo",
				"oso",
				"o o", 'o', Blocks.obsidian, 's', Items.nether_star);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianBoots),
				"o o",
				"oso", 'o', Blocks.obsidian, 's', Items.nether_star);
		
//		Craft Titanium Ingots and blaze rods into the Titanium Tools set
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumSword),
				"t",
				"t",
				"b", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumShovel),
				"t",
				"b",
				"b", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumPickaxe),
				"ttt",
				" b ",
				" b ", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumAxe),
				"tt",
				"tb",
				" b", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumAxe),
				"tt",
				"bt",
				"b ", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHoe),
				"tt",
				"b ",
				"b ", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHoe),
				"tt",
				" b",
				" b", 't', ModItems.titaniumIngot, 'b', Items.blaze_rod);
		
//		Craft Titanium Blocks and obsidian into The Ultimate Pickaxe
		GameRegistry.addRecipe(new ItemStack(ModItems.theUltimatePickaxe),
				"ooo",
				" t ",
				" t ", 'o', Blocks.obsidian, 't', ModBlocks.titaniumBlock);
		
//		Craft Titanium ingots into Titanium Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumBlock),
				"ttt",
				"ttt",
				"ttt", 't', ModItems.titaniumIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 9),
				new ItemStack(ModBlocks.titaniumBlock));
		
//		Craft some items into a name tag
		GameRegistry.addRecipe(new ItemStack(Items.name_tag),
				" il",
				"igi",
				"ii ", 'i', Items.iron_ingot, 'g', Blocks.gold_block, 'l', Items.lead);
		
//		Craft some items into a saddle
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"l l",
				"ili",
				"rir", 'l', Items.leather, 'i', Items.iron_ingot, 'r', Items.lead);
		
//		Craft some materials into a Dice block
		GameRegistry.addRecipe(
				new ItemStack(ModBlocks.diceBlock),
				"qqq",
				"qiq",
				"qqq", 'q', Items.quartz, 'i', Items.dye);
		
//------------- =+= CUSTOM SMELTING =+= -------------//	
		
//		Smelting ender pearls into Ender Ingot
		GameRegistry.addSmelting(Items.ender_pearl, new ItemStack(ModItems.enderIngot, 1), 1.0F);
		
//		Smelting Titanium Ore into Titanium Ingots
		GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 3), 1.0F);
		
//		Smelting Titanium Chunks into Titanium Ingots
		GameRegistry.addSmelting(ModItems.titaniumChunk, new ItemStack(ModItems.titaniumIngot), 1.0F);
		
//		Smelting Titanium Chunks into Titanium Ingots
		GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(ModItems.chocolate), 0.4F);
		
//------------- =+= CUSTOM BREWING =+= -------------//		
		
//		Brew cake to make potions of strength
		Items.cake.setPotionEffect(PotionHelper.blazePowderEffect + "+6" + "+14");
				
	}	
}
