package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

    public static void main(String[] args) {
        Validacion v = new Validacion();
        boolean resultado1 = v.validarMonto(50);
        boolean resultado2 = v.validarMonto(-10);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }
}