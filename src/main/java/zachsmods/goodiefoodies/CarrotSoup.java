package zachsmods.goodiefoodies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zachsmods.main.Main;

public class CarrotSoup extends ItemSoup {
	
	public CarrotSoup(String unlocalizedName) {
		super(12);
		this.setUnlocalizedName("carrotSoup");
		this.setCreativeTab(Main.zachsGoodieFoodies);
		this.setMaxStackSize(1);
	}
}