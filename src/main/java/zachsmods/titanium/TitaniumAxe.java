package zachsmods.titanium;

import net.minecraft.item.ItemAxe;
import zachsmods.main.Main;

public class TitaniumAxe extends ItemAxe {
	
	public TitaniumAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}