package petBuddy.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import petBuddy.entity.model.ModelSkellington;
import petBuddy.root.BuddyBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkeletonWBuddy extends BuddyBase
{
	public SkeletonWBuddy(World par1World)
	{
		super(par1World);		
		this.setMountedYOffset(2.8f);

	}
	public SkeletonWBuddy(World par1World, EntityPlayer player)
	{
		super(par1World, player);		
		this.setMountedYOffset(2.8f);

	}
	
	@SideOnly(Side.CLIENT)
	public ModelBase getModel(){
		return new ModelSkellington();
	}

	@Override
	public String getTexture() {
		return "/mob/skeleton_wither.png";
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	/**
	 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	 */
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		return super.interact(par1EntityPlayer);
	}

	/**
	 * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	 */
	public SkeletonWBuddy spawnBabyAnimal(EntityAgeable par1EntityAgeable)
	{
		return null;
	}

	public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
	{
		return this.spawnBabyAnimal(par1EntityAgeable);
	}
}