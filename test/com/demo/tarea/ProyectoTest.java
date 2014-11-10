package com.demo.tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoTest {

    public static void main(String[] args) {

        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Aplicación Proyectos ----");
        System.out.println("***** Menu *****");
        System.out.println("1). Agregar Proyecto [1]");
        System.out.println("2). Eliminar Proyecto [2]");
        System.out.println("3). Costo total de todos Proyectos [3]");
        System.out.println("4). Salir [exit]");

        int codigo = 0;
        int cantidadHoras = 0;
        String nombre = null;
        String tipo = null;

        boolean isCodigo, isNombre, isTipo, isCantidadHoras;

        String menu;
        menu = scanner.next();

        while (!"exit".equals(menu)) {
            System.out.println("---- Aplicación Proyectos ----");
            System.out.println("***** Menu *****");
            System.out.println("1). Agregar Proyecto [1]");
            System.out.println("2). Eliminar Proyecto [2]");
            System.out.println("3). Costo total de todos Proyectos [3]");
            System.out.println("4). Salir [exit]");
            menu = null;
            menu = scanner.next();

            if ("1".equals(menu)) {
                System.out.println(" ++++ Agregar Proyecto ++++");

                boolean isDuplicado;
                do {
                    do {
                        System.out.println("Ingrese codigo: ");
                        if (scanner.hasNextInt()) {
                            codigo = scanner.nextInt();
                            isCodigo = true;
                        } else {
                            scanner.next();
                            isCodigo = false;
                        }
                    } while (!isCodigo);

                    do {
                        System.out.println("Ingrese nombre: ");
                        if (scanner.hasNext()) {
                            nombre = scanner.next();
                            isNombre = true;
                        } else {
                            scanner.next();
                            isNombre = false;
                        }
                    } while (!isNombre);

                    do {
                        System.out.println("Ingrese tipo: ");
                        if (scanner.hasNext()) {
                            tipo = scanner.next();
                            isTipo = true;
                        } else {
                            scanner.next();
                            isTipo = false;
                        }
                    } while (!isTipo);

                    do {
                        System.out.println("Ingrese cantidad horas: ");
                        if (scanner.hasNextInt()) {
                            cantidadHoras = scanner.nextInt();
                            isCantidadHoras = true;
                        } else {
                            scanner.next();
                            isCantidadHoras = false;
                        }
                    } while (!isCantidadHoras);

                    Proyecto proyecto1 = new ProyectoJava(codigo, nombre, tipo, cantidadHoras);
                    if (!proyectos.contains(proyecto1)) {
                        proyectos.add(proyecto1);
                        System.out.println("valor costo proyecto: " + proyecto1.calcularCostoProyecto());
                        isDuplicado = true;
                    } else {
                        System.out.println("Ya existe ese proyecto");
                        isDuplicado = false;
                    }

                } while (!isDuplicado);

                menu = null;
            }
            if ("2".equals(menu)) {
                System.out.println("Eliminar Proyecto");
                boolean isCodigoEliminado;
                do {
                    System.out.println("Ingrese codigo a eliminar: ");
                    if (scanner.hasNextInt()) {
                        codigo = scanner.nextInt();
                        Proyecto proyectoRemoved = null;
                        for (Proyecto proyecto : proyectos) {
                            if (proyecto.getCodigo() == codigo) {
                                proyectoRemoved = proyecto;
                            }
                        }
                        proyectos.remove(proyectoRemoved);
                        isCodigoEliminado = true;
                    } else {
                        scanner.next();
                        isCodigoEliminado = false;
                    }
                } while (!isCodigoEliminado);
                menu = null;
            }
            if ("3".equals(menu)) {
                System.out.println("Costo total de todos Proyectos");
                double costoTotal = 0.0;
                for (Proyecto proyecto : proyectos) {
                    costoTotal += proyecto.calcularCostoProyecto();
                }
                System.out.println("Costo total proyectos: " + costoTotal);
                menu = null;
            }
        }

        scanner.close();

        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.getCodigo());
        }
    }

}
