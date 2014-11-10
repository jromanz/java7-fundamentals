/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.tarea;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Proyecto2Test {

    public static void main(String[] args) {

        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
        Proyecto proyecto1 = new ProyectoJava(1001, "Julio", "Java", 320);
        Proyecto proyecto2 = new ProyectoJava(1002, "Julio", "Java", 320);

        proyectos.add(proyecto1);
        proyectos.add(proyecto2);
        
        
        int codigo = 1002;
        Proyecto proyectoRemoved = null;
        for (Proyecto proyecto : proyectos) {
            if(proyecto.getCodigo() == codigo){
                proyectoRemoved = proyecto;
            }
        }
        
        proyectos.remove(proyectoRemoved);
        
        System.out.println(proyectos.contains(proyecto1));
        System.out.println(proyectos.contains(proyecto2));
        
        
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.getCodigo());
        }
    }
}
