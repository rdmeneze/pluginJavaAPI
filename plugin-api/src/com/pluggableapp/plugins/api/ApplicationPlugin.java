/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluggableapp.plugins.api;

/**
 *
 * @author rafael.dias
 */
public interface ApplicationPlugin 
{
    String getName();
    void init();    
    
    void doStuff();
}

