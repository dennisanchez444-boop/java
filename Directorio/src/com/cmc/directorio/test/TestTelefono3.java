package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono(20,"Movi","098234234");
		Telefono tel2 = new Telefono(10,"Claro","098826358");
		Telefono tel3 = new Telefono(15,"Movi","098953286");
		AdminTelefono at = new AdminTelefono();

		int totalMovil=at.contarMovi(tel1, tel2, tel3);
		
		System.out.println("TOTAL OPERADORA MOVIL: "+totalMovil);
	}

}
