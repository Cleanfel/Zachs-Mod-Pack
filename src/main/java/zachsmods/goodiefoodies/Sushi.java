package zachsmods.goodiefoodies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import zachsmods.main.Main;

public class Sushi extends ItemFood {
	
	public Sushi(String unlocalizedName) {
		super(6, 0.8F, false);
		this.setUnlocalizedName("sushi");
		this.setCreativeTab(Main.zachsGoodieFoodies);
	}
}
