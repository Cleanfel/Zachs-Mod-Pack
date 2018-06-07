package zachsmods.movement;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GravityExpert {
	
	@SubscribeEvent
	public void negateFallDamage(LivingFallEvent event) {
		if (!(event.getEntity() instanceof EntityPlayer)) {
			return;
		}
		
		event.setCanceled(true);
	}
}
