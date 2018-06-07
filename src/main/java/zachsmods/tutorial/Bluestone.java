package zachsmods.tutorial;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class Bluestone extends Block {
	
	public Bluestone(String unlocalizedName) {
		super(Material.GLASS);
		this.setUnlocalizedName("bluestone");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(2.0F);
		this.setHardness(1.0F);
		this.setLightLevel(1.0F);
		this.setSoundType(SoundType.GLASS);
	}
	
	public Item getItemDropped(IBlockState state, Random random, int i2){
		return ModItems.bluestoneDust;
	}

	public int quantityDropped(Random random){
		return random.nextInt(3) + 2;
	}
}
