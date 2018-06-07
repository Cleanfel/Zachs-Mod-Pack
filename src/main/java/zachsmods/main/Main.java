package zachsmods.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import zachsmods.commands.BlockFillCommand;
import zachsmods.commands.BlockFillerPositionSelector;
import zachsmods.commands.FlamingPigs;
import zachsmods.entities.CreeperReinforcements;
import zachsmods.entities.PigsDroppingDiamonds;
import zachsmods.entities.SkeletonCookies;
import zachsmods.entities.ZombieKnights;
import zachsmods.explosions.BiggerTNTExplosions;
import zachsmods.explosions.BiggerTNTExplosionsv2;
import zachsmods.explosions.DiamondOreTrap;
import zachsmods.explosions.ExplodingAnvils;
import zachsmods.explosions.ExplodingMinecarts;
import zachsmods.explosions.RedstonePower;
import zachsmods.movement.BouncySponges;
import zachsmods.movement.GolemWallClimb;
import zachsmods.movement.GravityExpert;
import zachsmods.movement.Parachute;
import zachsmods.movement.SuperJump;
import zachsmods.tabs.TabOfBlocks;
import zachsmods.tabs.TabOfFoods;
import zachsmods.tabs.TabOfSpecialMaterials;
import zachsmods.tabs.TabOfTools;
import zachsmods.tutorial.BlockBreakMessage;
import zachsmods.tutorial.DiamondMiner;

@Mod(modid = Main.MOD_ID, name = Main.MOD_NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.ACCEPTED_VERSIONS)
public class Main {

	public static final String MOD_ID = "zachsmods";
	public static final String MOD_NAME = "Zach's Mod Pack";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide="zachsmods.main.ClientProxy", serverSide="zachsmods.main.ServerProxy")
	public static CommonProxy proxy;

// --- TABS --- //

	public static final TabOfBlocks zachsBlocks = new TabOfBlocks("zachsBlocks");
	
	public static final TabOfSpecialMaterials zachsSpecialMaterials = new TabOfSpecialMaterials("zachsSpecialMaterials");
	
	public static final TabOfFoods zachsGoodieFoodies = new TabOfFoods("zachsGoodieFoodies");
	
	public static final TabOfTools zachsTools = new TabOfTools("zachsTools");
	
// --- EVENT BUS --- //
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
		
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	this.proxy.init(e);

		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
		MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
		MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
		MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
//		MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosionsv2());
		MinecraftForge.EVENT_BUS.register(new PigsDroppingDiamonds());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
//		MinecraftForge.EVENT_BUS.register(new CreeperReinforcements());
//		MinecraftForge.EVENT_BUS.register(new SuperJump());
		MinecraftForge.EVENT_BUS.register(new BouncySponges());
		FMLCommonHandler.instance().bus().register(new Parachute());
		MinecraftForge.EVENT_BUS.register(new Parachute());
		MinecraftForge.EVENT_BUS.register(new GolemWallClimb());
//		MinecraftForge.EVENT_BUS.register(new BlockFillerPositionSelector());
		MinecraftForge.EVENT_BUS.register(new SkeletonCookies());
		MinecraftForge.EVENT_BUS.register(new RedstonePower());
		MinecraftForge.EVENT_BUS.register(new DiamondMiner());
		MinecraftForge.EVENT_BUS.register(new GravityExpert());
			
		}

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	this.proxy.postInit(e);
    	
    }
    
// --- COMMANDS --- // 
    
	@EventHandler
	public void registerCommands(FMLServerStartingEvent event) {
		event.registerServerCommand(new FlamingPigs());
		//event.registerServerCommand(new BlockFillCommand());
		
	}
}
