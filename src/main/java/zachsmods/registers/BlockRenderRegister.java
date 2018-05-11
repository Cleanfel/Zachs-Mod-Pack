package zachsmods.registers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import zachsmods.main.Main;

public class BlockRenderRegister {

	public static String modid = Main.MODID;

	public static void registerBlockRenderer() {
	    
		reg(ModBlocks.bluestone);
		
		reg(ModBlocks.enderBlock);
	    
		reg(ModBlocks.titaniumOre);
	    reg(ModBlocks.titaniumBlock);
	    
	    reg(ModBlocks.diceBlock);
	    
	    reg(ModBlocks.rainbowOre);
	    
	    reg(ModBlocks.cloud);
	    
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}