package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono tel = telefonos.get(i);
			if ("C".equals(tel.getEstado())) {
				System.out.println("Número: " + tel.getNumero() + ", Tipo: " + tel.getTipo());
			}
		}
	}

	public void imprimir() {
		/*System.out.println("Informacion del contacto:");
		System.out.println("***" + nombre + " " + apellido + "****");
		if (direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}*/
		System.out.println("Información del Contacto:");
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre + " " + apellido);
		System.out.println("Dirección:");
		System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
		System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<>();
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono tel = telefonos.get(i);
			if ("E".equals(tel.getEstado())) {
				incorrectos.add(tel);
			}
		}
		return incorrectos;
	}

	public void agregarTelefono() {

	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
}
