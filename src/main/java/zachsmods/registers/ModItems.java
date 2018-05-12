package zachsmods.registers;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
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

    public static Item bluestoneDust = new BluestoneDust("bluestoneDust");
    
    public static Item enderIngot = new EnderIngot("enderIngot");
    
    public static Item sushi = new Sushi("sushi");
    public static Item carrotSoup = new CarrotSoup("carrotSoup");
    public static Item chocolate = new Chocolate("chocolate");
    public static Item luckyCandy = new LuckyCandy("luckyCandy");
    
    public static Item tomato = new Tomatoes("tomato");
    public static Item tomatoSoup = new TomatoSoup("tomatoSoup");
    
    public static ItemSeeds tomatoSeeds = new TomatoSeed("tomatoSeeds");
    
	public static Item titaniumIngot = new TitaniumIngot("titaniumIngot");
	public static Item titaniumChunk = new TitaniumChunk("titaniumChunk");
	
	public static ArmorMaterial TitaniumArmorMaterial = EnumHelper.addArmorMaterial("TitaniumArmorMaterial", "zachsmods:titanium", 40, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	public static ItemArmor titaniumHelmet = new TitaniumArmor("titaniumHelmet", TitaniumArmorMaterial, 1, EntityEquipmentSlot.HEAD);
	public static ItemArmor titaniumChestplate = new TitaniumArmor("titaniumChestplate", TitaniumArmorMaterial, 1, EntityEquipmentSlot.CHEST);
	public static ItemArmor titaniumLeggings = new TitaniumArmor("titaniumLeggings", TitaniumArmorMaterial, 1, EntityEquipmentSlot.LEGS);
	public static ItemArmor titaniumBoots = new TitaniumArmor("titaniumBoots", TitaniumArmorMaterial, 1, EntityEquipmentSlot.FEET);

	public static ToolMaterial TitaniumToolMaterial = EnumHelper.addToolMaterial("TitaniumToolMaterial", 4, 2000, 13.0F, 4.0F, 30);
	public static Item titaniumSword = new TitaniumSword("titaniumSword", TitaniumToolMaterial);
	public static Item titaniumShovel = new TitaniumShovel("titaniumShovel", TitaniumToolMaterial);
	//public static Item titaniumAxe = new TitaniumAxe("titaniumAxe", TitaniumToolMaterial);
	public static Item titaniumPickaxe = new TitaniumPickaxe("titaniumPickaxe", TitaniumToolMaterial);
	public static Item titaniumHoe = new TitaniumHoe("titaniumHoe", TitaniumToolMaterial);

	public static ToolMaterial UltimateToolMaterial = EnumHelper.addToolMaterial("UltimateToolMaterial", 4, 3200, 20.0F, 5.0F, 40);
	public static Item theUltimatePickaxe = new UltimatePickaxe("theUltimatePickaxe", UltimateToolMaterial);
	
	public static ArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmorMaterial", "zachsmods:obsidian", 100, new int[] {3, 8, 6, 3}, 30, SoundEvents.BLOCK_ANVIL_FALL, 0);
	public static ItemArmor obsidianHelmet = new ObsidianArmor("obsidianHelmet", ObsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD);
	public static ItemArmor obsidianChestplate = new ObsidianArmor("obsidianChestplate", ObsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST);
	public static ItemArmor obsidianLeggings = new ObsidianArmor("obsidianLeggings", ObsidianArmorMaterial, 1, EntityEquipmentSlot.LEGS);
	public static ItemArmor obsidianBoots = new ObsidianArmor("obsidianBoots", ObsidianArmorMaterial, 1, EntityEquipmentSlot.FEET);
    
    public static void createItems() {
    	
    	GameRegistry.registerItem(bluestoneDust, "bluestoneDust");
    	GameRegistry.registerItem(enderIngot, "enderIngot");
    	
    	GameRegistry.registerItem(sushi, "sushi");
    	GameRegistry.registerItem(carrotSoup, "carrotSoup");
    	GameRegistry.registerItem(chocolate, "chocolate");
    	GameRegistry.registerItem(luckyCandy, "luckyCandy");
    	
    	GameRegistry.registerItem(tomato, "tomato");
    	GameRegistry.registerItem(tomatoSoup, "tomatoSoup");
		GameRegistry.registerItem(tomatoSeeds, "tomatoSeeds");
		MinecraftForge.addGrassSeed(new ItemStack(tomatoSeeds), 5);
    	
    	GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
    	GameRegistry.registerItem(titaniumChunk, "titaniumChunk");
    	
//------------- =+= REGISTERING TITANIUM ARMOR =+= -------------//
		
		GameRegistry.registerItem(titaniumHelmet, "titaniumHelmet");
		GameRegistry.registerItem(titaniumChestplate, "titaniumChestplate");
		GameRegistry.registerItem(titaniumLeggings, "titaniumLeggings");
		GameRegistry.registerItem(titaniumBoots, "titaniumBoots");
		
//------------- =+= REGISTERING TITANIUM TOOLS =+= -------------//

		GameRegistry.registerItem(titaniumSword, "titaniumSword");
		GameRegistry.registerItem(titaniumShovel, "titaniumShovel");
		//GameRegistry.registerItem(titaniumAxe, "titaniumAxe");
		GameRegistry.registerItem(titaniumPickaxe, "titaniumPickaxe");
		GameRegistry.registerItem(titaniumHoe, "titaniumHoe");
		
//------------- =+= REGISTERING OBSIDIAN ARMOR =+= -------------//
		
		GameRegistry.registerItem(obsidianHelmet, "obsidianHelmet");
		GameRegistry.registerItem(obsidianChestplate, "obsidianChestplate");
		GameRegistry.registerItem(obsidianLeggings, "obsidianLeggings");
		GameRegistry.registerItem(obsidianBoots, "obsidianBoots");
		
//------------- =+= REGISTERING OTHER TOOLS =+= -------------//
		
		GameRegistry.registerItem(theUltimatePickaxe, "theUltimatePickaxe");
					    	
    }
}