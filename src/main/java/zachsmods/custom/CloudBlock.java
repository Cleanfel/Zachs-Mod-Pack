package zachsmods.custom;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

public class CloudBlock extends Block {

	public CloudBlock(String unlocalizedName) {
		super(Material.CRAFTED_SNOW);
		this.setUnlocalizedName("cloud");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(0.0F);
		this.setHardness(0.0F);
		this.setSoundType(SoundType.CLOTH);
		this.setHarvestLevel("pickaxe", 0);
	}
}