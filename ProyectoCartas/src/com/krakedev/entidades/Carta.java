package com.krakedev.entidades;

public class Carta {
	private Numero numeroCarta;
	private String palo;
	private String estado;

	public Carta(Numero numeroCarta, String palo) {
		this.numeroCarta = numeroCarta;
		this.palo = palo;
		this.estado = "N";
	}

	public void mostrarLaInformacion() {
		System.out.println(numeroCarta.getNumeroCarta() + "-" + palo);
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Numero getNumero() {
		return numeroCarta;
	}

	public void setNumero(Numero numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
}
