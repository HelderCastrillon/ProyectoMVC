/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomvc;

import com.proyectomvc.dao.estudiantesDao;
import com.proyectomvc.model.estudiantesModel;
import com.proyectomvc.view.jPrincipal;
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
      
        //Cargar ventana principal
      jPrincipal frameinicial = new jPrincipal(); 
      frameinicial.setVisible(true);
      frameinicial.showEstudiantes();
     //   estudiantesModel estudiante= new estudiantesModel(14, "Pedronel Ospina", 5);
     //   estudiantesDao.setEstudiantes(estudiante);
        //Consultando datos
     //   List<estudiantesModel> lestudiante = estudiantesDao.getEstudiantes();
     //   for(int i=0; i<lestudiante.size();i++){
     //       System.out.println("-------");
     //       System.out.println("id:"+lestudiante.get(i).getIdestudiante());
     //       System.out.println("nombre:"+lestudiante.get(i).getNombre());
     //}       System.out.println("nota:"+lestudiante.get(i).getNota());
      //  }
        
        ///lo del profesor
    }
    
}
