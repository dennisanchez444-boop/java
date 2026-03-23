package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.servicios.CalculadoraAmortizacion;

public class TestCalculadora {

    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();

        calc.generarTabla(prestamo);

        System.out.println("Numero | Cuota  | Inicio | Interés | Abono Capital | Saldo");

        Cuota[] cuotas = prestamo.getCuotas();

        for (int i = 0; i < cuotas.length; i++) {
            System.out.println(cuotas[i].mostrarPrestamo());
        }
    }
}