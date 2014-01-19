/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.model;

/**
 *
 * @author ITACHI
 */
public enum STATE {
    RECIBIDO ("Completado"),
    PENDIENTE ("Pendiente"),
    ASIGNADO ("En Transito");
    
    private STATE(String name){
        this.name=name;
    }
    
    private String name;
    
    public String getName(){
        return name;
    }
}
