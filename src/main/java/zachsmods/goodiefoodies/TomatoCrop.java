package zachsmods.goodiefoodies;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class TomatoCrop extends BlockCrops {
	
	public TomatoCrop(String unlocalizedName) {
		super();
		this.setUnlocalizedName("tomatoCrop");
	}

	@Override
	protected Item getSeed() {
		return ModItems.tomatoSeeds;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.tomato;
	}
}
