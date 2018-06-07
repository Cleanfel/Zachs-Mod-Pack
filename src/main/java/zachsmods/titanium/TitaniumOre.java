package zachsmods.titanium;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class TitaniumOre extends Block {
	public TitaniumOre(String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName("titaniumOre");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(5.0F);
		this.setHardness(5.0F);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 3);
	}

	public Item getItemDropped(IBlockState state, Random random, int i2){
		return ModItems.titaniumChunk;
	}

	public int quantityDropped(Random random){
		return random.nextInt(2) + 1;
	}
}
