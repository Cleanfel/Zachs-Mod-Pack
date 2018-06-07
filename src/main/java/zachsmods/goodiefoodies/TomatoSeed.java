package zachsmods.goodiefoodies;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import zachsmods.main.Main;
import zachsmods.registers.ModCrops;

public class TomatoSeed extends ItemSeeds {
	
	public TomatoSeed(String unlocalizedName) {
		super(ModCrops.tomatoCrop, Blocks.FARMLAND);
		setUnlocalizedName("tomatoSeeds");
		setCreativeTab(Main.zachsGoodieFoodies);
	}
}
