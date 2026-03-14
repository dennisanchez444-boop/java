package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono(20,"Movi","098234234");
		Telefono tel2 = new Telefono(10,"Claro","098826358");
		Telefono tel3 = new Telefono(15,"Movi","098953286");
		Telefono tel4 = new Telefono(5,"Claro","097294224");
		AdminTelefono at = new AdminTelefono();

		int totalClaro=at.contarClaro(tel1, tel2, tel3, tel4);
		
		System.out.println("TOTAL OPERADORA CLARO: "+totalClaro);
	}

}
