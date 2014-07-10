package com.Diddysandz.DivineCraft.config;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)

    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try

        {

          //load the config

          configuration.load();

          //Read the config
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example").getBoolean(true);
        }

        catch (Exception e)

        {
         //log Exeptions
        }

        finally

        {
            //save the config
          configuration.save();
        }



        System.out.println(configValue);
    }
}


