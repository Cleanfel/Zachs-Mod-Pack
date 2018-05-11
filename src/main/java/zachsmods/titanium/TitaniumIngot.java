package zachsmods.titanium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

public class TitaniumIngot extends Item {
	public TitaniumIngot(String unlocalizedName) {
		super();
		this.setUnlocalizedName("titaniumIngot");
		this.setCreativeTab(Main.zachsSpecialMaterials);
	}
}