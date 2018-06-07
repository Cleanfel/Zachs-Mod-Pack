package zachsmods.registers;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zachsmods.custom.CloudBlock;
import zachsmods.custom.Darkstone;
import zachsmods.custom.DiceBlock;
import zachsmods.custom.Lightstone;
import zachsmods.titanium.TitaniumBlock;
import zachsmods.titanium.TitaniumOre;
import zachsmods.tutorial.Bluestone;
import zachsmods.tutorial.EnderBlock;
import zachsmods.tutorial.RainbowOre;

public class ModBlocks {

	public static Block bluestone = new Bluestone("bluestone");
    
    public static Block enderBlock = new EnderBlock("enderBlock");

	public static Block titaniumOre = new TitaniumOre("titaniumOre");
	public static Block titaniumBlock = new TitaniumBlock("titaniumBlock");
	
	public static Block diceBlock = new DiceBlock("diceBlock");
	
	public static Block rainbowOre = new RainbowOre("rainbowOre");
	
	public static Block cloud = new CloudBlock("cloud");

	public static Block darkstone = new Darkstone("darkstone");
	public static Block lightstone = new Lightstone("lightstone");

    public static void createBlocks() {
    	
    	GameRegistry.registerBlock(bluestone, "bluestone");
        GameRegistry.registerBlock(enderBlock, "enderBlock");
        GameRegistry.registerBlock(titaniumOre, "titaniumOre");
        GameRegistry.registerBlock(titaniumBlock, "titaniumBlock");
        GameRegistry.registerBlock(diceBlock, "diceBlock");
        GameRegistry.registerBlock(rainbowOre, "rainbowOre");
        GameRegistry.registerBlock(cloud, "cloud");
        GameRegistry.registerBlock(darkstone, "darkstone");
        GameRegistry.registerBlock(lightstone, "lightstone");
    }
}
