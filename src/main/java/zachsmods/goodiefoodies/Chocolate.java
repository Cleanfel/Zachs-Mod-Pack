package zachsmods.goodiefoodies;

import net.minecraft.item.ItemFood;
import zachsmods.main.Main;

public class Chocolate extends ItemFood {

	public Chocolate(String unlocalizedName) {
		super(3, 0.45F, false);
		this.setUnlocalizedName("chocolate");
		this.setCreativeTab(Main.zachsGoodieFoodies);
		this.setPotionEffect(1, 10, 1, 0.95F);
	}
}
