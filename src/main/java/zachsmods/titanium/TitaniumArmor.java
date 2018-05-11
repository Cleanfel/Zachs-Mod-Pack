package zachsmods.titanium;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import zachsmods.main.Main;

public class TitaniumArmor extends ItemArmor {

	public TitaniumArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.zachsTools);
    }
}
