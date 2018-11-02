/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomvc;

import com.proyectomcv.model.estudiantesModel;
import com.proyectomvc.dao.estudiantesDao;
import java.util.List;

/**
 *
 * @author Helder Castrillon
 */
public class ProyectoMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //insertando datos
        estudiantesModel estudiante= new estudiantesModel(4, "Andrea Espinosa", 5);
        estudiantesDao.setEstudiantes(estudiante);
        //Consultando datos
        List<estudiantesModel> lestudiante = estudiantesDao.getEstudiantes();
        for(int i=0; i<lestudiante.size();i++){
            System.out.println("-------");
            System.out.println("id:"+lestudiante.get(i).getIdestudiante());
            System.out.println("nombre:"+lestudiante.get(i).getNombre());
            System.out.println("nota:"+lestudiante.get(i).getNota());
        }
    }
    
}
