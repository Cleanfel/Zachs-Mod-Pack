package zachsmods.titanium;

import net.minecraft.item.ItemSpade;
import zachsmods.main.Main;

public class TitaniumShovel extends ItemSpade {

	public TitaniumShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}
