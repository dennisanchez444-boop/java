package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensaje(Telefono telefono) {
		if ("Movi".equals(telefono.getOperadora())) {
			telefono.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contador = 0;
		if ("Movi".equals(t1.getOperadora())) {
			contador++;
		}
		if ("Movi".equals(t2.getOperadora())) {
			contador++;
		}
		if ("Movi".equals(t3.getOperadora())) {
			contador++;
		}
		return contador;
	}

	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contador = 0;
		if ("Claro".equals(t1.getOperadora())) {
			contador++;
		}
		if ("Claro".equals(t2.getOperadora())) {
			contador++;
		}
		if ("Claro".equals(t3.getOperadora())) {
			contador++;
		}
		if ("Claro".equals(t4.getOperadora())) {
			contador++;
		}
		return contador;
	}
}