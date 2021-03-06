package betterbreeds.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import betterbreeds.entity.EntityPig4;

public class RenderPig4 extends RenderLiving
{
	
	private static final ResourceLocation texture = new ResourceLocation("subaraki:BB/pig4.png");

	protected ResourceLocation func_110919_a(EntityPig4 par1EntityChicken)
	{
		return texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.func_110919_a((EntityPig4)par1Entity);
	}
	
	
    public RenderPig4(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(par2ModelBase);
    }

    protected int renderSaddledPig(EntityPig4 par1EntityPig, int par2, float par3)
    {
		this.bindTexture(new ResourceLocation("textures/entity/pig/pig_saddle.png"));
        return par2 == 0 && par1EntityPig.getSaddled() ? 1 : -1;
    }

    public void func_77098_a(EntityPig4 par1EntityPig, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityPig, par2, par4, par6, par8, par9);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        return this.renderSaddledPig((EntityPig4)par1EntityLiving, par2, par3);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.func_77098_a((EntityPig4)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.func_77098_a((EntityPig4)par1Entity, par2, par4, par6, par8, par9);
    }
}
