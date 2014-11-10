package com.demo.tarea;

public class ProyectoNet extends Proyecto{
    
    protected double extrapolacionAnalisisDiseno = 0.30;
    
    public ProyectoNet(int codigo, String nombre, String tipo, int cantidadHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadDeHoras = cantidadHoras;
        this.costoHoraHombreAnalisisDiseno = 27.5;
        this.costoHoraHombreRequerimiento = 27.5;
        this.costoHoraHombreDesarrollo = 22.5;
        this.costoHoraHombrePruebas = 20.0;
        
    }
    
    @Override
    public double calcularCostoProyecto() {
        return this.extrapolacionDesarrollo*this.cantidadDeHoras*this.costoHoraHombreDesarrollo+
        this.cantidadDeHoras*this.extrapolacionPruebas*this.costoHoraHombrePruebas+
        this.cantidadDeHoras*this.extrapolacionAnalisisDiseno*this.costoHoraHombreAnalisisDiseno+
        this.cantidadDeHoras*this.extrapolacionRequerimientos*this.costoHoraHombreRequerimiento;
    }
    
}
