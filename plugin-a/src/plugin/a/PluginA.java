/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package plugin.a;
package com.pluggableapp.plugins;
 
import com.pluggableapp.plugins.api.ApplicationPlugin;
import java.util.logging.Logger;
 
public class PluginA implements ApplicationPlugin
{
    private static Logger logger = Logger.getLogger(PluginA.class.getName());
 
    public String getName()
    {
        return "Plugin A";
    }
 
    @Override
    public void init()
    {
        logger.info(getName() + " initialized!");
    }
    
    @Override
    public void doStuff( )
    {
        System.out.println("teste de " + getName());
    }
}