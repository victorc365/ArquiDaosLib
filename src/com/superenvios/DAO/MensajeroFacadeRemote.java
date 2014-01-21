/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Mensajero;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ITACHI
 */
@Remote
public interface MensajeroFacadeRemote {

    void create(Mensajero mensajero);

    void edit(Mensajero mensajero);

    void remove(Mensajero mensajero);

    Mensajero find(Object id);

    List<Mensajero> findAll();

    List<Mensajero> findRange(int[] range);

    int count();

    public List<Mensajero> findActivos();
    
}
