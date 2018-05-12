package zachsmods.tutorial;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class RainbowOre extends Block {
	
	private Item drops;
	
	public RainbowOre(String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName("rainbowOre");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(2.0F);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
	    ArrayList drops = new ArrayList();
	    drops.add(new ItemStack(Items.COAL, RANDOM.nextInt(3) + 1));
	    drops.add(new ItemStack(Items.IRON_INGOT, RANDOM.nextInt(2) + 1));
	    drops.add(new ItemStack(Items.GOLD_INGOT, RANDOM.nextInt(2) + 1));
	    drops.add(new ItemStack(Items.DYE, RANDOM.nextInt(3) + 2, 4));
	    drops.add(new ItemStack(Items.REDSTONE, RANDOM.nextInt(2) + 2));
	    if (RANDOM.nextFloat() < 0.25F) {
	    	drops.add(new ItemStack(ModItems.titaniumChunk));
	    }
	    if (RANDOM.nextFloat() < 0.75F) {
	        drops.add(new ItemStack(Items.DIAMOND));
	    }
	    return drops;
	}
}