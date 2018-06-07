package zachsmods.registers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

	public static void registerBlockRenderer() {
	    
		reg(ModBlocks.bluestone);
		
		reg(ModBlocks.enderBlock);
	    
		reg(ModBlocks.titaniumOre);
	    reg(ModBlocks.titaniumBlock);
	    
	    reg(ModBlocks.diceBlock);
	    
	    reg(ModBlocks.rainbowOre);
	    
	    reg(ModBlocks.cloud);
	    
	    reg(ModBlocks.darkstone);
	    reg(ModBlocks.lightstone);
	    
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("zachsmods" + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}