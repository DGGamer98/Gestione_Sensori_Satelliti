/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestione_sensori_satelliti.DAO;

import com.mycompany.gestione_sensori_satelliti.model.Sensore;
import java.util.List;

/**
 *
 * @author david
 */
public interface SensoreDAO {

    void save(Sensore s);
    Sensore findById(int id);
    List<Sensore> findAll();
    void update(Sensore s);
    void delete(int id);
}
