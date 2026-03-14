package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono(20,"Movi","098234234");
        AdminTelefono at = new AdminTelefono();
        
        at.activarMensaje(telf);
        
        System.out.println("OPERADORA: "+telf.getOperadora());
		System.out.println("NUMERO: "+telf.getNumero());
		System.out.println("CODIGO: "+telf.getCodigo());
		System.out.println("TIENE WHATSAPP: " + telf.isTieneWhatsapp());
	}

}
