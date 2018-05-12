package zachsmods.entities;

import java.util.Random;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SkeletonCookies {
	
	@SubscribeEvent
	public void giveArmor(EntityJoinWorldEvent event){
		if(!(event.getEntity() instanceof EntitySkeleton)) {
			return;
		}
		
		EntitySkeleton skeleton = (EntitySkeleton) event.getEntity();
		skeleton.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
		skeleton.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
		skeleton.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(Items.LEATHER_LEGGINGS));
		skeleton.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(Items.LEATHER_BOOTS));
		skeleton.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET));
	}
	
	@SubscribeEvent
	public void spawnReinforcements(LivingDeathEvent event){
		if(!(event.getEntity() instanceof EntityZombie)) {
			return;
		}
		
		for (int i = 0 ; i < 1 ; i++) {
			EntitySkeleton skeleton = new EntitySkeleton(event.getEntity().worldObj);
			skeleton.setLocationAndAngles(event.getEntity().posX,
					event.getEntity().posY,
					event.getEntity().posZ,
					0,
					0);
			if (!event.getEntity().worldObj.isRemote) {
				event.getEntity().worldObj.spawnEntityInWorld(skeleton);
			}
		}
	}
	
	@SubscribeEvent
	public void dropCookies(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntitySkeleton)) {
			return;
		}
		
		Random random = new Random ();
		
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().dropItem(Items.COOKIE, random.nextInt(8));
		}
	}
}