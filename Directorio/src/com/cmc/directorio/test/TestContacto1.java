package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono(10,"Claro","094123453");
		Contacto c = new Contacto("Dennis","Sanchez",telf,60);
		
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Apellido: "+c.getApellido());
        System.out.println("Numero: "+telf.getNumero());
        System.out.println("Operadora: "+telf.getOperadora());
        System.out.println("Peso: "+c.getPeso());
	}

}
