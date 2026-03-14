package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono tel = new Telefono(10, "Claro", "09368313");
		Contacto c1 = new Contacto("Dennis", "Sanchez", tel, 60);
		AdminTelefono at = new AdminTelefono();
		AdminContactos admin = new AdminContactos();
		at.activarMensaje(tel);
		admin.activarUsuario(c1);
		System.out.println("TIENE WHATSAPP: " + tel.isTieneWhatsapp());
		System.out.println("OPERADORA: "+tel.getOperadora());
		System.out.println("NUMERO: "+tel.getNumero());
		System.out.println("CODIGO: "+tel.getCodigo());
	}
}
