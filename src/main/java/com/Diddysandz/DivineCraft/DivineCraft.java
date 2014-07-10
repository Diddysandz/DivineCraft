package com.Diddysandz.DivineCraft;

import com.Diddysandz.DivineCraft.config.ConfigHandler;
import com.Diddysandz.DivineCraft.proxy.IProxy;
import com.Diddysandz.DivineCraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sun.security.jca.GetInstance;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class DivineCraft
{
       @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
       public static IProxy proxy;

       @Mod.Instance(Reference.MOD_NAME)
    public static DivineCraft Instance;


       @Mod.EventHandler
    public void PreInit (FMLPreInitializationEvent event)
       {
           ConfigHandler.init(event.getSuggestedConfigurationFile());
       }

       @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
       {

       }

    @Mod.EventHandler
    public void PostInit (FMLPostInitializationEvent event)
       {

       }
}