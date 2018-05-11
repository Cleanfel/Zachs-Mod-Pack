package zachsmods.worldgen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import zachsmods.registers.ModBlocks;

public class CloudWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    
		switch (world.provider.getDimensionId()) {
	    case 0: //Overworld
	    	
	    	this.runGenerator(this.cloud, world, random, chunkX, chunkZ, 1, 150, 235);

	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;

	    }
	}
	
	private WorldGenerator cloud; //Generates the cloud blocks

	public CloudWorldGen() {
		int size = (int)(Math.random() * 70);
	    this.cloud = new WorldGenMinable(ModBlocks.cloud.getDefaultState(), 55, BlockHelper.forBlock(Blocks.air));
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(12);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(12);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}