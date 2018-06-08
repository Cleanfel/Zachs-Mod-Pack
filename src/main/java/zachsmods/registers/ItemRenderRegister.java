package zachsmods.registers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static void registerItemRenderer() {
	   
		reg(ModItems.bluestoneDust);
		
		reg(ModItems.enderIngot);
	    
		reg(ModItems.titaniumIngot);
	    reg(ModItems.titaniumChunk);
	    
	    reg(ModItems.titaniumHelmet);
	    reg(ModItems.titaniumChestplate);
	    reg(ModItems.titaniumLeggings);
	    reg(ModItems.titaniumBoots);
	    
	    reg(ModItems.titaniumSword);
	    reg(ModItems.titaniumPickaxe);
	    reg(ModItems.titaniumAxe);
	    reg(ModItems.titaniumShovel);
	    reg(ModItems.titaniumHoe);
	    
	    reg(ModItems.theUltimatePickaxe);
	    
	    reg(ModItems.sushi);
	    reg(ModItems.carrotSoup);
	    reg(ModItems.chocolate);
	    reg(ModItems.luckyCandy);
	    
	    reg(ModItems.tomato);
	    reg(ModItems.tomatoSoup);
	    reg(ModItems.tomatoSeeds);
	    
	    reg(ModItems.obsidianHelmet);
	    reg(ModItems.obsidianChestplate);
	    reg(ModItems.obsidianLeggings);
	    reg(ModItems.obsidianBoots);
	    
	    reg(ModItems.emeraldHelmet);
	    reg(ModItems.emeraldChestplate);
	    reg(ModItems.emeraldLeggings);
	    reg(ModItems.emeraldBoots);
	    
	}

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation("zachsmods" + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
