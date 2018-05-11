package zachsmods.custom;

import net.minecraft.entity.player.EntityPlayer;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ObsidianArmor extends ItemArmor {

    public ObsidianArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.zachsTools);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    	
    	if (itemStack.getItem() == ModItems.obsidianHelmet) {effectPlayer(player, Potion.moveSlowdown, 0);}

    	if (itemStack.getItem() == ModItems.obsidianChestplate) {effectPlayer(player, Potion.moveSlowdown, 0);}
    	
    	if (itemStack.getItem() == ModItems.obsidianLeggings) {effectPlayer(player, Potion.moveSlowdown, 0);}
    	
    	if (itemStack.getItem() == ModItems.obsidianBoots) {effectPlayer(player, Potion.moveSlowdown, 0);}
    	
    	if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.obsidianHelmet
    	        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.obsidianChestplate
    	        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.obsidianLeggings
    	        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.obsidianBoots) {
    			this.effectPlayer(player, Potion.moveSlowdown, 2);
    			this.effectPlayer(player, Potion.resistance, 2);
    			this.effectPlayer(player, Potion.fireResistance, 0);
    	}
    }

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id, 1, amplifier, true, true));
	}
}