/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_sensori_satelliti.DTO;

import com.mycompany.gestione_sensori_satelliti.model.Sensore;

/**
 *
 * @author david
 */
public class Transformer {
    
    //Trasformazione oggetto MODEL in DTO
    public SensoreDTO fromModelToDto(Sensore sDao) {
        SensoreDTO sensoreDTO = new SensoreDTO();
        
        sensoreDTO.setId(sDao.getId());
        sensoreDTO.setNome(sDao.getNome());
        sensoreDTO.setSatelliteId(sDao.getSatelliteId());
        sensoreDTO.setTipo(sDao.getTipo());
        sensoreDTO.setAttivo(sDao.isAttivo());
        
        return sensoreDTO;
    }
    
    
    //Trasformazione di oggetti DTO in Model
    public Sensore fromDtoToModel(SensoreDTO senDTO) {
        
        Sensore sens = new Sensore();
        
        sens.setId(senDTO.getId());
        sens.setNome(senDTO.getNome());
        sens.setSatelliteId(senDTO.getSatelliteId());
        sens.setTipo(senDTO.getTipo());
        sens.setAttivo(senDTO.isAttivo());
   
        return sens;
    }
}
