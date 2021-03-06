package betterbreeds.handelers;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelPig;
import net.minecraftforge.common.MinecraftForge;
import betterbreeds.entity.EntityChicken2;
import betterbreeds.entity.EntityChicken3;
import betterbreeds.entity.EntityChicken4;
import betterbreeds.entity.EntityChicken5;
import betterbreeds.entity.EntityCow2;
import betterbreeds.entity.EntityCow3;
import betterbreeds.entity.EntityCow4;
import betterbreeds.entity.EntityJelly;
import betterbreeds.entity.EntityPig2;
import betterbreeds.entity.EntityPig3;
import betterbreeds.entity.EntityPig4;
import betterbreeds.entity.EntityPig5;
import betterbreeds.entity.EntityPig6;
import betterbreeds.entity.EntitySheep2;
import betterbreeds.entity.EntitySheep3;
import betterbreeds.entity.EntitySheep4;
import betterbreeds.entity.EntitySheep5;
import betterbreeds.entity.EntityWolf2;
import betterbreeds.entity.EntityWolf3;
import betterbreeds.entity.EntityWolf4;
import betterbreeds.entity.EntityWolf5;
import betterbreeds.entity.EntityWolf6;
import betterbreeds.entity.model.ModelChicken2;
import betterbreeds.entity.model.ModelJelly;
import betterbreeds.entity.model.ModelSheep10;
import betterbreeds.entity.model.ModelSheep3;
import betterbreeds.entity.model.ModelSheep4;
import betterbreeds.entity.model.ModelSheep5;
import betterbreeds.entity.model.ModelSheep6;
import betterbreeds.entity.model.ModelSheep7;
import betterbreeds.entity.model.ModelSheep8;
import betterbreeds.entity.model.ModelSheep9;
import betterbreeds.entity.model.Wolf2;
import betterbreeds.entity.model.Wolf3;
import betterbreeds.entity.model.Wolf4;
import betterbreeds.entity.model.Wolf5;
import betterbreeds.entity.model.Wolf6;
import betterbreeds.entity.render.RenderChicken2;
import betterbreeds.entity.render.RenderChicken3;
import betterbreeds.entity.render.RenderChicken4;
import betterbreeds.entity.render.RenderChicken5;
import betterbreeds.entity.render.RenderCow2;
import betterbreeds.entity.render.RenderCow3;
import betterbreeds.entity.render.RenderCow4;
import betterbreeds.entity.render.RenderJelly;
import betterbreeds.entity.render.RenderPig2;
import betterbreeds.entity.render.RenderPig3;
import betterbreeds.entity.render.RenderPig4;
import betterbreeds.entity.render.RenderPig5;
import betterbreeds.entity.render.RenderPig6;
import betterbreeds.entity.render.RenderSheep2;
import betterbreeds.entity.render.RenderSheep3;
import betterbreeds.entity.render.RenderSheep4;
import betterbreeds.entity.render.RenderSheep5;
import betterbreeds.entity.render.RenderWolf2;
import betterbreeds.entity.render.RenderWolf3;
import betterbreeds.entity.render.RenderWolf4;
import betterbreeds.entity.render.RenderWolf5;
import betterbreeds.entity.render.RenderWolf6;
import cpw.mods.fml.client.registry.RenderingRegistry;



public class ClientProxy extends CommonProxy
{
	public void registerRenderInformation()
	{

		RenderingRegistry.registerEntityRenderingHandler(EntityPig2.class, new RenderPig2(new ModelPig(), null, 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPig3.class, new RenderPig3(new ModelPig(), null, 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPig4.class, new RenderPig4(new ModelPig(), null, 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPig5.class, new RenderPig5(new ModelPig(), null, 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPig6.class, new RenderPig6(new ModelPig(), null, 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityCow2.class, new RenderCow2(new ModelCow(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCow3.class, new RenderCow3(new ModelCow(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCow4.class, new RenderCow4(new ModelCow(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityWolf2.class, new RenderWolf2(new Wolf2(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWolf3.class, new RenderWolf3(new Wolf3(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWolf4.class, new RenderWolf4(new Wolf4(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWolf5.class, new RenderWolf5(new Wolf5(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWolf6.class, new RenderWolf6(new Wolf6(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntitySheep2.class, new RenderSheep2(new ModelSheep4(), new ModelSheep3(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySheep3.class, new RenderSheep3(new ModelSheep6(), new ModelSheep5(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySheep4.class, new RenderSheep4(new ModelSheep8(), new ModelSheep7(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySheep5.class, new RenderSheep5(new ModelSheep9(), new ModelSheep10(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityChicken2.class, new RenderChicken2 (new ModelChicken2(),0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken3.class, new RenderChicken3 (new ModelChicken(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken4.class, new RenderChicken4 (new ModelChicken(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken5.class, new RenderChicken5 (new ModelChicken(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityJelly.class, new RenderJelly(new ModelJelly(), 0.2F));

	}

	@Override
	public void registerSound(){
		
		MinecraftForge.EVENT_BUS.register(new sndmngr());
	}
}