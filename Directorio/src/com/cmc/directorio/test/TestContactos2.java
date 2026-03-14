package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono(15, "Claro", "09934734");
		Telefono tel2 = new Telefono(10, "Claro", "09368313");
		Contacto c1 = new Contacto("Dennis", "Sanchez", tel1, 60);
		Contacto c2 = new Contacto("Marco", "Lopez", tel2, 50);

		AdminContactos admin = new AdminContactos();
		Contacto masPesado = admin.buscarMasPesado(c1, c2);

		boolean co = admin.compararOperadoras(c1, c2);

		System.out.println("El mas pesado es " + masPesado.getNombre() + " con " + masPesado.getPeso());
		System.out.println(co);
		
	}
}
