package zachsmods.entities;

import java.util.Random;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SkeletonCookies {
	
	@SubscribeEvent
	public void giveArmor(EntityJoinWorldEvent event){
		if(!(event.entity instanceof EntitySkeleton)) {
			return;
		}
		
		EntitySkeleton skeleton = (EntitySkeleton) event.entity;
		
		skeleton.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
		skeleton.setCurrentItemOrArmor(1, new ItemStack(Items.leather_chestplate));
		skeleton.setCurrentItemOrArmor(2, new ItemStack(Items.leather_leggings));
		skeleton.setCurrentItemOrArmor(3, new ItemStack(Items.leather_boots));
		skeleton.setCurrentItemOrArmor(4, new ItemStack(Items.leather_helmet));
	}
	
	@SubscribeEvent
	public void spawnReinforcements(LivingDeathEvent event){
		if(!(event.entity instanceof EntityZombie)) {
			return;
		}
		
		for (int i = 0 ; i < 1 ; i++) {
			EntitySkeleton skeleton = new EntitySkeleton(event.entity.worldObj);
			skeleton.setLocationAndAngles(event.entity.posX,
					event.entity.posY,
					event.entity.posZ,
					0,
					0);
			if (!event.entity.worldObj.isRemote) {
				event.entity.worldObj.spawnEntityInWorld(skeleton);
			}
		}
	}
	
	@SubscribeEvent
	public void dropCookies(LivingDeathEvent event) {
		if (!(event.entity instanceof EntitySkeleton)) {
			return;
		}
		
		Random random = new Random ();
		
		if (!event.entity.worldObj.isRemote) {
			event.entity.dropItem(Items.cookie, random.nextInt(8));
		}
	}
}