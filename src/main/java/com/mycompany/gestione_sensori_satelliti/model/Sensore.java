/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_sensori_satelliti.model;

/**
 *
 * @author david
 */
public class Sensore {
    private int id;
    private String nome;
    private String tipo;
    private int satelliteId;
    private boolean attivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(int satelliteId) {
        this.satelliteId = satelliteId;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    @Override
    public String toString() {
        return "Sensore{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", satelliteId=" + satelliteId + ", attivo=" + attivo + '}';
    }
    
    
}
