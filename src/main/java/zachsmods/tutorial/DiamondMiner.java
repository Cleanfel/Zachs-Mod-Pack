package zachsmods.tutorial;

import net.minecraft.init.Blocks;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DiamondMiner {

@SubscribeEvent
	public void sendMessage(BreakEvent event){
	if (event.getState().getBlock() != Blocks.DIAMOND_ORE) {
		return;
	}
		event.getPlayer().addChatComponentMessage(new TextComponentString(TextFormatting.AQUA +"There's diamonds in them hills!"));
	}
}
