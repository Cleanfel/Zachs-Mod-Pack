package zachsmods.titanium;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

public class TitaniumBlock extends Block {

	public TitaniumBlock(String unlocalizedName) {
		super(Material.ANVIL);
		this.setUnlocalizedName("titaniumBlock");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(10.0F);
		this.setHardness(10.0F);
		this.setLightLevel(0.0F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
	}
}
