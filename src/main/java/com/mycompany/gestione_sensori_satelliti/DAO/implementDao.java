/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_sensori_satelliti.DAO;

import com.mycompany.gestione_sensori_satelliti.model.Sensore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class implementDao implements SensoreDAO {

    private Map<Integer, Sensore> database = new HashMap<>();
    
    
    @Override
    public void save(Sensore s) {
        if(database.containsKey(s.getId())) {
            System.out.println("il Sensore con la stessa chiave già esiste");
        }
        
        database.put(s.getId(), s);
        System.out.println("Sensoere aggiunto con successo");
    }

    @Override
    public Sensore findById(int id) {
        System.out.println(database.get(id));
        return database.get(id);
    }

    @Override
    public List<Sensore> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void update(Sensore s) {
        if(!database.containsKey(s.getId())) {
            System.out.println("Impossibile aggiornare il sensore");
        } else {
            database.put(s.getId(), s);
            System.out.println("Oggetto nel database aggiornato");
        }
    }
    
    @Override
    public void delete(int id) {
        database.remove(id);
    }
    
}
