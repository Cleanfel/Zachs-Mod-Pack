package zachsmods.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zachsmods.registers.ModBlocks;
import zachsmods.registers.ModCrafting;
import zachsmods.registers.ModCrops;
import zachsmods.registers.ModItems;
import zachsmods.worldgen.BluestoneWorldGen;
import zachsmods.worldgen.CloudWorldGen;
import zachsmods.worldgen.EnderBlockWorldGen;
import zachsmods.worldgen.RainbowOreWorldGen;
import zachsmods.worldgen.TitaniumOreWorldGen;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		
    	ModItems.createItems();
		ModBlocks.createBlocks();
		
		ModCrops.createCrops();
		
		ModCrafting.initCrafting();
		
	}
	
	public void init(FMLInitializationEvent e) {
		
//		Register the Titanium Ore to spawn in the overworld
		GameRegistry.registerWorldGenerator(new TitaniumOreWorldGen(), 0);
		
//		Register the Ender Block to spawn in the overworld
		GameRegistry.registerWorldGenerator(new EnderBlockWorldGen(), 0);
		
//		Register bluestone to spawn in the oceans
		GameRegistry.registerWorldGenerator(new BluestoneWorldGen(), 0);
		
//		Register bluestone to spawn in the overworld
		GameRegistry.registerWorldGenerator(new RainbowOreWorldGen(), 0);
		
//		Register cloud to spawn in the air
		GameRegistry.registerWorldGenerator(new CloudWorldGen(), 0);
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
