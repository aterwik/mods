package threeDitems.render.item;

import net.minecraft.client.model.ModelBase;

import org.lwjgl.opengl.GL11;

import threeDitems.render.Render3DInterface;

public class RenderShears extends Render3DInterface{

	/**Used for quick rendering. Basic and general code that 
	 * should work on any proper modeled model*/
	public RenderShears(ModelBase model, String texture) {
		super(model, texture);
	}

	@Override
	public void renderEquippedFP() {
		GL11.glRotatef(55,0,1,0);
		GL11.glRotatef(-130,0,0,1);
		GL11.glRotatef(90,1,0,0);
			
		GL11.glTranslatef(-0.4f, 0.8f, 0.8f);		
	}

	@Override
	public void renderEntity() {
		GL11.glRotatef(0,0,1,0);
		GL11.glRotatef(180,0,0,1);
		GL11.glRotatef(0,1,0,0);
			
		GL11.glTranslatef(0f, 0f, 0f);		
	}

	@Override
	public void renderEquipped() {
		GL11.glRotatef(10,0,1,0);
		GL11.glRotatef(15-90,0,0,1);
		GL11.glRotatef(180,1,0,0);
			
		GL11.glTranslatef(-0.1f, -0.5f, -0.1f);	
		
		float f = 0.7f;
		GL11.glScalef(f, f, f);			
	}

	@Override
	public void renderScale() {
		float f = 3f;
		GL11.glScalef(f, f, f);		
	}

}
