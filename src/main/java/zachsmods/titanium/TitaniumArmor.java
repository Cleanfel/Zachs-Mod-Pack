package zachsmods.titanium;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import zachsmods.main.Main;

public class TitaniumArmor extends ItemArmor {

	public TitaniumArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.zachsTools);
    }
}
