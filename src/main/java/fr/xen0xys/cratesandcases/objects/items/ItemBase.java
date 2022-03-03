package fr.xen0xys.cratesandcases.objects.items;

import fr.xen0xys.cratesandcases.CratesAndCases;
import fr.xen0xys.cratesandcases.init.ItemInit;
import fr.xen0xys.cratesandcases.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        /*
        setRegistryName(new ResourceLocation(CratesAndCases.MODID, name));
        setUnlocalizedName(this.getRegistryName().toString());
         */
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        CratesAndCases.proxy.registerItemRenderer(this, 0);
    }
}
