package zachsmods.custom;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

import java.util.Random;
import net.minecraft.block.Block;

public class CloudBlock extends Block {

	public CloudBlock(String unlocalizedName) {
		super(Material.craftedSnow);
		this.setUnlocalizedName("cloud");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(0.0F);
		this.setHardness(0.0F);
		this.setStepSound(soundTypeCloth);
		this.setHarvestLevel("pickaxe", 0);
	}
}