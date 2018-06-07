package zachsmods.custom;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zachsmods.main.Main;

public class Darkstone extends Block {

	public Darkstone(String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName("darkstone");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(2.0F);
		this.setHardness(1.0F);
		this.setLightLevel(0.0F);
		this.setSoundType(SoundType.STONE);
	}
}
