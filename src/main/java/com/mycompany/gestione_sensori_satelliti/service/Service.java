/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_sensori_satelliti.service;

import com.mycompany.gestione_sensori_satelliti.DAO.SensoreDAO;
import com.mycompany.gestione_sensori_satelliti.DAO.implementDao;
import com.mycompany.gestione_sensori_satelliti.DTO.SensoreDTO;
import com.mycompany.gestione_sensori_satelliti.DTO.Transformer;
import com.mycompany.gestione_sensori_satelliti.model.Sensore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */

/*
SensoreDTO cercaSensore
List<SensoreDTO> trovaTutti
void aggiornaSensore
void eliminaSensore
 */
public class Service {

    private Transformer transformer = new Transformer();
    private SensoreDAO implDatabas = new implementDao();

    public void createSensore(SensoreDTO sensDTO) {
        implDatabas.save(transformer.fromDtoToModel(sensDTO));
    }

    //Cerco un sensore in base al suo id
    public SensoreDTO cercaSensore(int id) {
        Sensore sen = implDatabas.findById(id);

        if (sen == null) {
            System.out.println("Oggetto non trovato nella persistenza");
            return null;
        }
        return transformer.fromModelToDto(sen);
    }

    //Vedo tutti gli elementi della persistenza
    public List<SensoreDTO> trovaTutti() {
        List<Sensore> sen = implDatabas.findAll();
        List<SensoreDTO> senDto = new ArrayList<>();
        //Scorro i valori del model --> ogni valore lo converto in DTO e lo aggiungo alla lista DTO
        for (Sensore sensoreModel : sen) {
            senDto.add(transformer.fromModelToDto(sensoreModel));
        }
        System.out.println(senDto + "\n");
        return senDto;
    }
    
    public void aggiornaSensore(SensoreDTO senDTO) {
        implDatabas.update(transformer.fromDtoToModel(senDTO));
    }
    
    public void elimina(int id) {
        implDatabas.delete(id);
    }

}
