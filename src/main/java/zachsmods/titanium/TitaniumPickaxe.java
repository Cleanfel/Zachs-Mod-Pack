package zachsmods.titanium;

import net.minecraft.item.ItemPickaxe;
import zachsmods.main.Main;

public class TitaniumPickaxe extends ItemPickaxe {

	public TitaniumPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(Main.zachsTools);
		this.setUnlocalizedName(unlocalizedName);
	}
}
