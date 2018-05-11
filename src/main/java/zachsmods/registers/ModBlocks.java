package zachsmods.registers;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zachsmods.custom.CloudBlock;
import zachsmods.custom.DiceBlock;
import zachsmods.titanium.TitaniumBlock;
import zachsmods.titanium.TitaniumOre;
import zachsmods.tutorial.Bluestone;
import zachsmods.tutorial.EnderBlock;
import zachsmods.tutorial.RainbowOre;

public class ModBlocks {

	public static Block bluestone;
    
    public static Block enderBlock;

	public static Block titaniumOre;
	public static Block titaniumBlock;
	
	public static Block diceBlock;
	
	public static Block rainbowOre;
	
	public static Block cloud;

	public static Block whiteCobblestone;
	public static Block blackCobblestone;

    public static void createBlocks() {
    	
        GameRegistry.registerBlock(bluestone = new Bluestone("bluestone"), "bluestone");
        
        GameRegistry.registerBlock(enderBlock = new EnderBlock("enderBlock"), "enderBlock");
        
        GameRegistry.registerBlock(titaniumOre = new TitaniumOre("titaniumOre"), "titaniumOre");
        
        GameRegistry.registerBlock(titaniumBlock = new TitaniumBlock("titaniumBlock"), "titaniumBlock");
        
        GameRegistry.registerBlock(diceBlock = new DiceBlock("diceBlock"), "diceBlock");
        
        GameRegistry.registerBlock(rainbowOre = new RainbowOre("rainbowOre"), "rainbowOre");
        
        GameRegistry.registerBlock(cloud = new CloudBlock("cloud"), "cloud");
    }
}
