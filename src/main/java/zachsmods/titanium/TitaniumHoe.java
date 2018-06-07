package zachsmods.titanium;

import net.minecraft.item.ItemHoe;
import zachsmods.main.Main;

public class TitaniumHoe extends ItemHoe {

	public TitaniumHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}
