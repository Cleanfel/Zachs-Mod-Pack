package zachsmods.custom;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zachsmods.main.Main;

public class UltimatePickaxe extends ItemPickaxe {

	public UltimatePickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		setCreativeTab(Main.zachsTools);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, net.minecraft.entity.Entity entity, int par4, boolean par5){
		super.onUpdate(stack, world, entity, par4, par5);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getHeldItemMainhand();
			if(equipped == stack) {
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 0));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1, 2));
			}
		}
	}
}