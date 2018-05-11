package zachsmods.titanium;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

import java.util.Random;
import net.minecraft.block.Block;

public class TitaniumBlock extends Block {

	public TitaniumBlock(String unlocalizedName) {
		super(Material.anvil);
		this.setUnlocalizedName("titaniumBlock");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(10.0F);
		this.setHardness(10.0F);
		this.setLightLevel(0.0F);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
	}
}