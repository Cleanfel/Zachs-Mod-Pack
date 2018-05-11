package zachsmods.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.registers.ModItems;

public class TabOfSpecialMaterials extends CreativeTabs {

	public TabOfSpecialMaterials(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.enderIngot;
	}
}