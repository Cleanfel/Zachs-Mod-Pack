package zachsmods.custom;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class AbandonedCabin extends WorldGenerator {

	private boolean canRplace(World world, BlockPos pos) {
		Block at = world.getBlockState(pos).getBlock();
		Material material = at.getMaterial(null);
		//Air, liquid, snow, plants, leaves are replaceable
		return material.isReplaceable() || material == Material.PLANTS || material == Material.LEAVES;
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}
}
