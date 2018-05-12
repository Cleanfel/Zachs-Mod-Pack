package zachsmods.titanium;

import net.minecraft.item.ItemAxe;
import zachsmods.main.Main;

public class TitaniumAxe extends ItemAxe {
	
	public TitaniumAxe(String unlocalizedName, ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}