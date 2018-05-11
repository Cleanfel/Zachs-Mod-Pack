package zachsmods.tutorial;

import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DiamondMiner {

@SubscribeEvent
	public void sendMessage(BreakEvent event){
	if (event.state.getBlock() != Blocks.diamond_ore) {
		return;
	}
		event.getPlayer().addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA +"There's diamonds in them hills!"));
	}
}