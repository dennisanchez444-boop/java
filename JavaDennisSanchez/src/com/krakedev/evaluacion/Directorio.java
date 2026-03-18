package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<>();
		fechaModificacion = new Date();
		correctos = new ArrayList<>();
		incorrectos = new ArrayList<>();

	}

	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) != null) {
			return false;
		}
		contactos.add(contacto);
		fechaModificacion = new Date();
		return true;
	}

	public Contacto buscarPorCedula(String cedula) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c = contactos.get(i);
			if (c.getCedula().equals(cedula)) {
				return c;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		if (fechaModificacion == null) {
			return "No se ha realizado ninguna modificación";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int contador = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c = contactos.get(i);
			if (c.getDireccion() == null) {
				contador++;
			}
		}
		return contador;

	}

	public int contarFijos() {
		int contador = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c = contactos.get(i);
			ArrayList<Telefono> telefonos = c.getTelefonos();
			for (int j = 0; j < telefonos.size(); j++) {
				Telefono tel = telefonos.get(j);
				if ("Convencional".equals(tel.getTipo()) && "C".equals(tel.getEstado())) {
					contador++;
				}
			}
		}
		return contador;
	}

	public void depurar() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c = contactos.get(i);
			if (c.getDireccion() != null) {
				correctos.add(c);
			} else {
				incorrectos.add(c);
			}
		}
		contactos.clear();
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
}