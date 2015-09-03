package com.kanomiya.mcmod.kmagic.magic.spell.instant;

import com.kanomiya.mcmod.kmagic.magic.status.MagicStatus;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

/**
 * @author Kanomiya
 *
 */
public abstract class BaseMagic {

	public abstract void execute(World worldIn, Entity speller, double x, double y, double z, MagicStatus status, int power);

	public abstract String getId();

}
