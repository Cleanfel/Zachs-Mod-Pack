package zachsmods.titanium;

import net.minecraft.item.ItemSword;
import zachsmods.main.Main;

public class TitaniumSword extends ItemSword {

	public TitaniumSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}