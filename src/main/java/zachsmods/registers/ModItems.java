package zachsmods.registers;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zachsmods.custom.ObsidianArmor;
import zachsmods.custom.UltimatePickaxe;
import zachsmods.goodiefoodies.CarrotSoup;
import zachsmods.goodiefoodies.Chocolate;
import zachsmods.goodiefoodies.LuckyCandy;
import zachsmods.goodiefoodies.Sushi;
import zachsmods.goodiefoodies.TomatoSeed;
import zachsmods.goodiefoodies.TomatoSoup;
import zachsmods.goodiefoodies.Tomatoes;
import zachsmods.titanium.TitaniumArmor;
import zachsmods.titanium.TitaniumAxe;
import zachsmods.titanium.TitaniumChunk;
import zachsmods.titanium.TitaniumHoe;
import zachsmods.titanium.TitaniumIngot;
import zachsmods.titanium.TitaniumPickaxe;
import zachsmods.titanium.TitaniumShovel;
import zachsmods.titanium.TitaniumSword;
import zachsmods.tutorial.BluestoneDust;
import zachsmods.tutorial.EnderIngot;

public final class ModItems {

    public static Item bluestoneDust;
    
    public static Item enderIngot;
    
    public static Item sushi;
    public static Item carrotSoup;
    public static Item chocolate;
    public static Item luckyCandy;
    
    public static Item tomato;
    public static Item tomatoSoup;
    
    public static ItemSeeds tomatoSeeds;
    
	public static Item titaniumIngot;
	public static Item titaniumChunk;
	
	public static ItemArmor titaniumHelmet;
	public static ItemArmor titaniumChestplate;
	public static ItemArmor titaniumLeggings;
	public static ItemArmor titaniumBoots;
	public static ArmorMaterial TitaniumArmorMaterial = EnumHelper.addArmorMaterial("TitaniumArmorMaterial", "zachsmods:titanium", 40, new int[] {3, 8, 6, 3}, 30);
	
	public static Item titaniumSword;
	public static Item titaniumShovel;
	public static Item titaniumPickaxe;
	public static Item titaniumAxe;
	public static Item titaniumHoe;
	public static ToolMaterial TitaniumToolMaterial = EnumHelper.addToolMaterial("TitaniumToolMaterial", 4, 2000, 13.0F, 4.0F, 30);
	
	public static Item theUltimatePickaxe;
	public static ToolMaterial UltimateToolMaterial = EnumHelper.addToolMaterial("UltimateToolMaterial", 4, 3200, 20.0F, 5.0F, 40);
	
	public static ItemArmor obsidianHelmet;
	public static ItemArmor obsidianChestplate;
	public static ItemArmor obsidianLeggings;
	public static ItemArmor obsidianBoots;
	public static ArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmorMaterial", "zachsmods:obsidian", 100, new int[] {3, 8, 6, 3}, 30);
    
    public static void createItems() {
    	
    	GameRegistry.registerItem(bluestoneDust = new BluestoneDust("bluestoneDust"), "bluestoneDust");
    	
    	GameRegistry.registerItem(enderIngot = new EnderIngot("enderIngot"), "enderIngot");
    	
    	GameRegistry.registerItem(sushi = new Sushi("sushi"), "sushi");
    	
    	GameRegistry.registerItem(carrotSoup = new CarrotSoup("carrotSoup"), "carrotSoup");
    	
    	GameRegistry.registerItem(chocolate = new Chocolate("chocolte"), "chocolate");
    	
    	GameRegistry.registerItem(luckyCandy = new LuckyCandy("luckyCandy"), "luckyCandy");
    	
    	GameRegistry.registerItem(tomato = new Tomatoes("tomato"), "tomato");
    	
    	GameRegistry.registerItem(tomatoSoup = new TomatoSoup("tomatoSoup"), "tomatoSoup");
    	
		GameRegistry.registerItem(tomatoSeeds = new TomatoSeed("tomatoSeeds"), "tomatoSeeds");
		MinecraftForge.addGrassSeed(new ItemStack(tomatoSeeds), 5);
    	
    	GameRegistry.registerItem(titaniumIngot = new TitaniumIngot("titaniumIngot"), "titaniumIngot");
    	
    	GameRegistry.registerItem(titaniumChunk = new TitaniumChunk("titaniumChunk"), "titaniumChunk");
    	
//------------- =+= REGISTERING TITANIUM ARMOR =+= -------------//
		
//		Register the custom armor set, "Titanium Armor"
		GameRegistry.registerItem(titaniumHelmet = new TitaniumArmor("titaniumHelmet", ModItems.TitaniumArmorMaterial, 1, 0), "titaniumHelmet");

		GameRegistry.registerItem(titaniumChestplate = new TitaniumArmor("titaniumChestplate", ModItems.TitaniumArmorMaterial, 1, 1), "titaniumChestplate");

		GameRegistry.registerItem(titaniumLeggings = new TitaniumArmor("titaniumLeggings", ModItems.TitaniumArmorMaterial, 2, 2), "titaniumLeggings");

		GameRegistry.registerItem(titaniumBoots = new TitaniumArmor("titaniumBoots", ModItems.TitaniumArmorMaterial, 1, 3), "titaniumBoots");
		
//------------- =+= REGISTERING TITANIUM TOOLS =+= -------------//

//		Register the custom tool set, "Titanium Tools"
		GameRegistry.registerItem(titaniumSword = new TitaniumSword("titaniumSword", TitaniumToolMaterial), "titaniumSword");
		
		GameRegistry.registerItem(titaniumShovel = new TitaniumShovel("titaniumShovel", TitaniumToolMaterial), "titaniumShovel");
		
		GameRegistry.registerItem(titaniumAxe = new TitaniumAxe("titaniumAxe", TitaniumToolMaterial), "titaniumAxe");
		
		GameRegistry.registerItem(titaniumPickaxe = new TitaniumPickaxe("titaniumPickaxe", TitaniumToolMaterial), "titaniumPickaxe");
		
		GameRegistry.registerItem(titaniumHoe = new TitaniumHoe("titaniumHoe", TitaniumToolMaterial), "titaniumHoe");
		
//------------- =+= REGISTERING OBSIDIAN ARMOR =+= -------------//
		
//		Register the custom armor set, "Obsidian Armor"
		GameRegistry.registerItem(obsidianHelmet = new ObsidianArmor("obsidianHelmet", ObsidianArmorMaterial, 1, 0), "obsidianHelmet");
		
		GameRegistry.registerItem(obsidianChestplate = new ObsidianArmor("obsidianChestplate", ObsidianArmorMaterial, 1, 1), "obsidianChestplate");
		
		GameRegistry.registerItem(obsidianLeggings = new ObsidianArmor("obsidianLeggings", ObsidianArmorMaterial, 2, 2), "obsidianLeggings");
		
		GameRegistry.registerItem(obsidianBoots = new ObsidianArmor("obsidianBoots", ObsidianArmorMaterial, 1, 3), "obsidianBoots");
		
//------------- =+= REGISTERING OTHER TOOLS =+= -------------//
		
//		Register the custom tool, "The Ultimate Pickaxe"
		GameRegistry.registerItem(theUltimatePickaxe = new UltimatePickaxe("theUltimatePickaxe", UltimateToolMaterial), "theUltimatePickaxe");
					    	
    }
}