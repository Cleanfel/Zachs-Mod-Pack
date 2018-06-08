package zachsmods.custom;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zachsmods.main.Main;

public class Lightstone extends Block {

	public Lightstone(String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName("lightstone");
		this.setCreativeTab(Main.zachsBlocks);
		this.setResistance(2.0F);
		this.setHardness(1.0F);
		this.setLightLevel(0.1F);
		this.setSoundType(SoundType.STONE);
	}
}
