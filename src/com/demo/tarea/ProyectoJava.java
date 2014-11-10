package com.demo.tarea;

public class ProyectoJava extends Proyecto{
    
    protected double extrapolacionAnalisisDiseno = 0.45;
    
    public ProyectoJava(int codigo, String nombre, String tipo, int cantidadHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadDeHoras = cantidadHoras;
        this.costoHoraHombreAnalisisDiseno = 30.0;
        this.costoHoraHombreRequerimiento = 30.0;
        this.costoHoraHombreDesarrollo = 25.0;
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
