/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestione_sensori_satelliti;

import com.mycompany.gestione_sensori_satelliti.DAO.implementDao;
import com.mycompany.gestione_sensori_satelliti.DTO.SensoreDTO;
import com.mycompany.gestione_sensori_satelliti.service.Service;

/**
 *
 * @author david
 */
public class Gestione_Sensori_Satelliti {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Creazione tre oggetti di istanza SensoreDTO per test
        SensoreDTO senDTO = new SensoreDTO();
        SensoreDTO senDTO1 = new SensoreDTO();
        SensoreDTO senDTO2 = new SensoreDTO();

        //Creazione oggetto della rispettiva istanza per la logica
        Service service = new Service();
        
        senDTO.setId(1);
        senDTO.setNome("Sensore termico A1");
        senDTO.setSatelliteId(100);
        senDTO.setTipo("Termico");
        senDTO.setAttivo(true);
        
        senDTO1.setId(2);
        senDTO1.setNome("Sensore Ottico B2");
        senDTO1.setSatelliteId(101);
        senDTO1.setTipo("OTTICO");
        senDTO1.setAttivo(true);
        
        senDTO2.setId(3);
        senDTO2.setNome("Sensore radar C3");
        senDTO2.setSatelliteId(100);
        senDTO2.setTipo("RADAR");
        senDTO2.setAttivo(false);
        
        //Creo oggetti se già non esistono
        service.createSensore(senDTO);
        service.createSensore(senDTO1);
        service.createSensore(senDTO2);
        
        service.trovaTutti();
        
        service.cercaSensore(3);

        service.elimina(2);
        service.cercaSensore(2);
        
        System.out.println("x----------");
        service.trovaTutti();
        
        
        
        
    }
}
