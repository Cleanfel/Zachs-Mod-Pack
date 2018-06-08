package zachsmods.custom;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class EmeraldArmor extends ItemArmor {

	public EmeraldArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.zachsTools);
    }
	
	@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    	
    	if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.emeraldHelmet
    	        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.emeraldChestplate
    	        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.emeraldLeggings
    	        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.emeraldBoots) {
    	}
    }
}
