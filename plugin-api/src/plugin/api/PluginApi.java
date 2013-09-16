/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin.api;


//import com.pluggableapp.plugins.api.ApplicationPlugin;
import com.pluggableapp.PluginServiceFactory;
import com.pluggableapp.PluginService;
//import java.util.Iterator;
import java.util.logging.Logger;

/**
 *
 * @author rafael.dias
 */
public class PluginApi 
{
    private static Logger logger = Logger.getLogger(PluginApi.class.getName());
 
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args)
    {
        loadPlugins();
    }
 
    private static void loadPlugins()
    {
        PluginService pluginService = PluginServiceFactory.createPluginService();
        pluginService.initPlugins();
        
        pluginService.doSomethingPlugins();
        
    }
}
