package zachsmods.custom;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class AbandonedCabin extends WorldGenerator {

	private boolean canRplace(World world, BlockPos pos) {
		Block at = world.getBlockState(pos).getBlock();
		Material material = at.getMaterial();
		//Air, liquid, snow, plants, leaves are replaceable
		return material.isReplaceable() || material == Material.plants || material == Material.leaves;
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}

}
