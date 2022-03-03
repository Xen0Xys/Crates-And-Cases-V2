package fr.xen0xys.cratesandcases;
import fr.xen0xys.cratesandcases.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = CratesAndCases.MODID, name = CratesAndCases.NAME, version = CratesAndCases.VERSION)
public class CratesAndCases
{
    private static Logger logger;

    public static final String MODID = "cratesandcases";
    public static final String NAME = "Crates And Cases";
    public static final String VERSION = "1.0";
    public static final String CLIENT = "fr.xen0xys.cratesandcases.proxy.ClientProxy";
    public static final String COMMON = "fr.xen0xys.cratesandcases.proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENT, serverSide = COMMON, modId = MODID)
    public static CommonProxy proxy;
    @Mod.Instance
    public static CratesAndCases instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        logger = e.getModLog();
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent e){

    }

    @EventHandler
    public void init(FMLPostInitializationEvent e){

    }

    public static Logger getLogger() {
        return logger;
    }
}
