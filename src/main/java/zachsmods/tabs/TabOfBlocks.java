package zachsmods.tabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import zachsmods.registers.ModBlocks;
import zachsmods.registers.ModItems;

public class TabOfBlocks extends CreativeTabs {

	public TabOfBlocks(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.enderBlock);
	}
}