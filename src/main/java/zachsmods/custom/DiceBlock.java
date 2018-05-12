package zachsmods.custom;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zachsmods.main.Main;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

public class DiceBlock extends Block {

	public DiceBlock(String unlocalizedName) {
		super(Material.SPONGE);
		this.setUnlocalizedName("diceBlock");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(2.0F);
		this.setHardness(1.0F);
		this.setLightLevel(0.0F);
		this.setSoundType(SoundType.CLOTH);
	}
}