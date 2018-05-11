package zachsmods.titanium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

public class TitaniumChunk extends Item {
	public TitaniumChunk (String unlocalizedName) {
		super();
		this.setUnlocalizedName("titaniumChunk");
		this.setCreativeTab(Main.zachsSpecialMaterials);
	}
}