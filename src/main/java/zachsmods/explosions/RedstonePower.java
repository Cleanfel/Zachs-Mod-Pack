package zachsmods.explosions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RedstonePower {

	@SubscribeEvent
	public void explode(BreakEvent event) {
		if (event.getState().getBlock() != Blocks.LIT_REDSTONE_ORE) {
			return;
		}
		
		event.getWorld().createExplosion(null,
				event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), 2, true);
	}
}