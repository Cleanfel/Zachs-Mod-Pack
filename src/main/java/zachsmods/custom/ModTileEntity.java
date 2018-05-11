package zachsmods.custom;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.tileentity.TileEntity;

public class ModTileEntity extends TileEntity implements ITickable {

	@Override
	public void tick() {
		if (!this.worldObj.isRemote)
		System.out.println("Hello, I'm a TileEntity!");
	}
}
