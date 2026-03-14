package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono(10,"Movi","09941234123");
		
		System.out.println("OPERADORA: "+telf.getOperadora());
		System.out.println("NUMERO: "+telf.getNumero());
		System.out.println("CODIGO: "+telf.getCodigo());
	}

}
