package zachsmods.explosions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RedstonePower {

	@SubscribeEvent
	public void explode(BreakEvent event) {
		if (event.state.getBlock() != Blocks.lit_redstone_ore) {
			return;
		}
		
		event.world.createExplosion(null,
				event.pos.getX(), event.pos.getY(),
				event.pos.getZ(), 2, true);
	}
}