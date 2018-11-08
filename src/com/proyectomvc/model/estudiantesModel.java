/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomvc.model;

/**
 *
 * @author Helder Castrillon
 */
public class estudiantesModel {
    private int idestudiante;
    private String nombre;
    private int nota;

    public estudiantesModel(int idestudiante, String nombre, int nota) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}
