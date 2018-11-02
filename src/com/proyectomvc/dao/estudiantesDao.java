/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectomvc.dao;

import com.proyectomcv.model.estudiantesModel;
import com.proyectomvc.connect.pgConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helder Castrillon
 */
public class estudiantesDao {
    
    public static List<estudiantesModel> getEstudiantes(){
      List<estudiantesModel> listaEstudiantes = new ArrayList();
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
  
                  String sql ="SELECT idestudiante, nombre, nota FROM estudiantes";
                  ResultSet result = st.executeQuery(sql);
                  
                  while(result.next()) {
                      int idEstudiante = result.getInt("idestudiante");
                      String nombre = result.getString("nombre");
                      int nota = result.getInt("nota");                      
                      
                       estudiantesModel estudiante = new estudiantesModel(idEstudiante,nombre,nota);
                       listaEstudiantes.add(estudiante);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
                  estudiantesModel estudiante = new estudiantesModel(0,"Error no se pudo hacer la consulta SQL",0);
                   listaEstudiantes.add(estudiante);
              }

        return listaEstudiantes;
}
     public static void setEstudiantes(estudiantesModel estudiante){
                // TODO code application logic here

              try {
                  pgConnect connectPG = new pgConnect();
                  Connection conex=connectPG.settingConnect();
                  java.sql.Statement st = conex.createStatement();  
  
                  String sql ="INSERT INTO public.estudiantes( idestudiante, nombre, nota)	VALUES ("+estudiante.getIdestudiante()+", '"+estudiante.getNombre()+"', "+estudiante.getNota()+")";
                  System.out.println(sql);
                  ResultSet result = st.executeQuery(sql);
                  result.close();
                  st.close();
                  conex.close();
              } catch(ClassNotFoundException | SQLException exc) {
                  System.out.println("Error: "+exc.getMessage());
              }

}
}
