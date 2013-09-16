package com.pluggableapp;
 
import com.pluggableapp.plugins.api.ApplicationPlugin;
import java.util.Iterator;
 
public interface PluginService
{
    Iterator<ApplicationPlugin> getPlugins();
    void initPlugins();
    void doSomethingPlugins();
}
