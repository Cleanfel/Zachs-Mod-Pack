package zachsmods.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSingleMinable extends WorldGenerator {

    private IBlockState block;
    private Predicate<IBlockState> target;

    public WorldGenSingleMinable(IBlockState block, Predicate<IBlockState> target) {
        this.block = block;
        this.target = target;
    }

    public WorldGenSingleMinable(IBlockState block) {
        this(block, BlockStateMatcher.forBlock(Blocks.STONE));
    }


    @Override
    public boolean generate(World world, Random random, BlockPos pos) {
        if(world.getBlockState(pos).getBlock().isReplaceableOreGen(block, world, pos, this.target))
            world.setBlockState(pos, this.block);
        return true;
    }
}
