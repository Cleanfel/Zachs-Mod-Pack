package zachsmods.tutorial;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import zachsmods.main.Main;
import zachsmods.registers.ModItems;

public class EnderBlock extends Block {
	
	public EnderBlock(String unlocalizedName) {
		super(Material.iron);
		this.setUnlocalizedName("enderBlock");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(3.0F);
		this.setHardness(6.0F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
//	@Override
//	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
//		IBlockState block = world.getBlockState(pos.add(0, -1, 0));
//		world.setBlockState(pos, block);
//		EntityLightningBolt lightning = new EntityLightningBolt(world,
//				pos.getX(), pos.getY(), pos.getZ());
//		world.addWeatherEffect(lightning);
//	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			return false;
		}
		
		player.addChatMessage(new ChatComponentText(
				EnumChatFormatting.DARK_PURPLE
						+ "You have clicked on the majestic Enderium Block!!"));
		EntityEnderEye eye = new EntityEnderEye(world, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5);
		eye.motionY = 0.1;
		world.spawnEntityInWorld(eye);
		return true;
	}
	
	public Item getItemDropped(IBlockState state, Random random, int i2){
		return ModItems.enderIngot;
	}

	public int quantityDropped(Random random){
		return random.nextInt(2) + 2;
	}
}