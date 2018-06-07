package zachsmods.goodiefoodies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zachsmods.main.Main;

public class TomatoSoup extends ItemSoup {
	
	public TomatoSoup(String unlocalizedName) {
		super(10);
		this.setUnlocalizedName("tomatoSoup");
		this.setCreativeTab(Main.zachsGoodieFoodies);
		this.setMaxStackSize(1);
	}
}
