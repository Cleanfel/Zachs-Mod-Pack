package zachsmods.tutorial;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {

	@SubscribeEvent
	public void sendMessage(BreakEvent event){
		event.getPlayer().addChatComponentMessage(new TextComponentString(TextFormatting.GOLD +"You broke a block!"));
	}
}
