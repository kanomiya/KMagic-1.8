
package com.kanomiya.mcmod.kmagic;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kanomiya.mcmod.core.util.GameRegistryUtils;
import com.kanomiya.mcmod.kmagic.block.BlockKMSignalPortal;
import com.kanomiya.mcmod.kmagic.block.BlockKMSignalRepeater;
import com.kanomiya.mcmod.kmagic.block.BlockMagicFurnace;
import com.kanomiya.mcmod.kmagic.block.BlockMagicKMSignalSender;
import com.kanomiya.mcmod.kmagic.block.BlockMagicStoneOre;
import com.kanomiya.mcmod.kmagic.item.ItemBlockMagicStoneOre;
import com.kanomiya.mcmod.kmagic.tileentity.TileEntityMagicFurnace;
import com.kanomiya.mcmod.kmagic.tileentity.signal.TileEntityKMSignalPortal;
import com.kanomiya.mcmod.kmagic.tileentity.signal.TileEntityKMSignalRepeater;
import com.kanomiya.mcmod.kmagic.tileentity.signal.TileEntityMagicKMSignalSender;
import com.kanomiya.mcmod.kmagic.util.ModelUtils;

/**
 * @author Kanomiya
 *
 */
public class KMBlocks {

	public static BlockMagicStoneOre blockMagicStoneOre;
	public static BlockMagicFurnace blockMagicFurnace;
	public static BlockKMSignalRepeater blockKMSignalRepeater;
	public static BlockKMSignalPortal blockKMSignalPortal;
	public static BlockMagicKMSignalSender blockMagicKMSignalSender;
	// public static Block block;


	public static void preInit(FMLPreInitializationEvent event) {
		final boolean client = event.getSide().isClient();

		GameRegistryUtils.registerBlock(blockMagicStoneOre = new BlockMagicStoneOre(), ItemBlockMagicStoneOre.class, "blockMagicStoneOre", ModelUtils.getModelNameSuffixes(blockMagicStoneOre), client);
		GameRegistryUtils.registerBlock(blockMagicFurnace = new BlockMagicFurnace(), "blockMagicFurnace", client);

		GameRegistryUtils.registerBlock(blockKMSignalRepeater = new BlockKMSignalRepeater(), "blockKMSignalRepeater", client);
		GameRegistryUtils.registerBlock(blockKMSignalPortal = new BlockKMSignalPortal(), "blockKMSignalPortal", client);
		GameRegistryUtils.registerBlock(blockMagicKMSignalSender = new BlockMagicKMSignalSender(), "blockMagicKMSignalSender", client);


		// TileEntity

		GameRegistry.registerTileEntity(TileEntityMagicFurnace.class, "kmagic:blockMagicFurnace");
		GameRegistry.registerTileEntity(TileEntityKMSignalRepeater.class, "kmagic:blockKMSignalRepeater");
		GameRegistry.registerTileEntity(TileEntityKMSignalPortal.class, "kmagic:blockKMSignalPortal");
		GameRegistry.registerTileEntity(TileEntityMagicKMSignalSender.class, "kmagic:blockMagicKMSignalSender");

	}

	public static void init(FMLInitializationEvent event) {  }
	public static void postInit(FMLPostInitializationEvent event) {  }





}
