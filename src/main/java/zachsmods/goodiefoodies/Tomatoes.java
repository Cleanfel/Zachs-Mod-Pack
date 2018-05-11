package zachsmods.goodiefoodies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import zachsmods.main.Main;

public class Tomatoes extends ItemFood {
	
	public Tomatoes(String unlocalizedName) {
		super(4, 0.6F, false);
		this.setUnlocalizedName("tomato");
		this.setCreativeTab(Main.zachsGoodieFoodies);
	}
}