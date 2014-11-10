package com.demo.tarea;

public abstract class Proyecto {
    
    protected int codigo;
    protected String nombre;
    protected String tipo;
    protected int cantidadDeHoras;
    
    protected double costoHoraHombreRequerimiento = 0.0;
    protected double costoHoraHombreAnalisisDiseno = 0.0;
    protected double costoHoraHombreDesarrollo = 0.0;
    protected double costoHoraHombrePruebas = 0.0;
    
    protected double extrapolacionDesarrollo = 1.0;
    protected double extrapolacionPruebas = 0.3;
    protected double extrapolacionRequerimientos = 0.2;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }
    
    
    public boolean equals(Object o){
        boolean result = false;
        if (o!= null && o instanceof Proyecto){
            result = this.codigo == ((Proyecto)o).codigo;
        }
           return result;
    }
    
    
    public abstract double calcularCostoProyecto();
}
