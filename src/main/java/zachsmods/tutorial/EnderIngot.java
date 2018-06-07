package zachsmods.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zachsmods.main.Main;

public class EnderIngot extends ItemFood {
	
	public EnderIngot(String unlocalizedName) {
		super(5, 1.0F, false);
		this.setUnlocalizedName("enderIngot");
		this.setCreativeTab(Main.zachsSpecialMaterials);
//		this.setPotionEffect(1, 60, 2, 0.5F);
//		this.setAlwaysEdible();
	}
	
	public ItemStack onItemRightClick(ItemStack stack,
		World world, EntityPlayer player) {
		
		EntityEnderman enderman = new EntityEnderman(world);
		enderman.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
				
	if(!enderman.worldObj.isRemote){
		world.spawnEntityInWorld(enderman);
	}

		if(!player.capabilities.isCreativeMode) {
			stack.stackSize--;

		}
		return stack;
	}	
}
