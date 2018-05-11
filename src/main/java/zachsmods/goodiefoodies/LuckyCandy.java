package zachsmods.goodiefoodies;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zachsmods.main.Main;

public class LuckyCandy extends ItemFood {

	public LuckyCandy(String unlocalizedName) {
	    super(2, 0.4F, false);
	    this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.zachsGoodieFoodies);
	    this.setAlwaysEdible();
	}
	
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 600, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.harm.id, 600, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 600, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.blindness.id, 300, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.hunger.id, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.healthBoost.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.absorption.id, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(Potion.saturation.id, 300, 1));
			}
	    }
	}
	
	public int randomValue() {
		return(int)(Math.random() * 4);
	}
}
