package zachsmods.goodiefoodies;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import zachsmods.main.Main;

public class Chocolate extends ItemFood {

	public Chocolate(String unlocalizedName) {
		super(3, 0.45F, false);
		this.setUnlocalizedName("chocolate");
		this.setCreativeTab(Main.zachsGoodieFoodies);
		this.setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 1), 0.95F);
	}
}
