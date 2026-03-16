package com.clearminds.test;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenor {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

        Celda c1 = new Celda("A");
        Celda c2 = new Celda("B");
        Celda c3 = new Celda("C");
        Celda c4 = new Celda("D");
        Celda c5 = new Celda("E");
        Celda c6 = new Celda("F");

        maquina.agregarCelda(c1);
        maquina.agregarCelda(c2);
        maquina.agregarCelda(c3);
        maquina.agregarCelda(c4);
        maquina.agregarCelda(c5);
        maquina.agregarCelda(c6);

        c1.ingresarProducto(new Producto("P01", "Papitas", 0.85), 10);
        c2.ingresarProducto(new Producto("P02", "Doritos", 0.50), 8);
        c3.ingresarProducto(new Producto("P03", "Jet", 0.25), 15);
        c4.ingresarProducto(new Producto("P04", "DeTodito", 0.60), 12);
        c5.ingresarProducto(new Producto("P05", "Chicles", 1.20), 20);
        c6.ingresarProducto(new Producto("P06", "Galletas", 1.50), 5);

        ArrayList<Producto> menores = maquina.buscarMenores(1.0);

        System.out.println("Productos Menores: " + menores.size());
        for (Producto p : menores) {
            System.out.println("Nombre: " + p.getNombre() + " Precio: " + p.getPrecio());
        }
    }
}