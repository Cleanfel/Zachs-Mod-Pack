package zachsmods.tutorial;

import net.minecraft.item.Item;
import zachsmods.main.Main;

public class BluestoneDust extends Item {
	
	public BluestoneDust(String unlocalizedName) {
		super();
		this.setUnlocalizedName("bluestoneDust");
		this.setCreativeTab(Main.zachsSpecialMaterials);
	}
}
