package zachsmods.goodiefoodies;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
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
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 600, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 600, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 600, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 600, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 300, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.POISON, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 200, 0));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 300, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 800, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 500, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 1200, 1));
			}
			if(randomValue() == 1) {
				player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, 1000, 1));
			}
	    }
	}
	
	public int randomValue() {
		return(int)(Math.random() * 4);
	}
}
