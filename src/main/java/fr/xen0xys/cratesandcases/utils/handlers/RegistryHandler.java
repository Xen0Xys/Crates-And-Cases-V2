package fr.xen0xys.cratesandcases.utils.handlers;

import fr.xen0xys.cratesandcases.CratesAndCases;
import fr.xen0xys.cratesandcases.init.ItemInit;
import fr.xen0xys.cratesandcases.utils.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = CratesAndCases.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> e){
        e.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent e){
        for(Item item : ItemInit.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel) item).registerModels();
            }
        }
    }

    public static void preInitRegistries(){

    }
    public static void InitRegistries(){

    }

}
