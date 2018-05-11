package zachsmods.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.registers.ModItems;

public class TabOfTitanium extends CreativeTabs {

	public TabOfTitanium(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.titaniumChunk;
	}
}