/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Persona;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ITACHI
 */
@Remote
public interface PersonaFacadeRemote {

    void create(Persona persona);

    void edit(Persona persona);

    void remove(Persona persona);

    Persona find(Object id);

    List<Persona> findAll();

    List<Persona> findRange(int[] range);

    int count();

    public Persona login(String userName, String password);
    
}
