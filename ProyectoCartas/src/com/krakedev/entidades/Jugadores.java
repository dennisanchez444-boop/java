package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;

	public Jugadores() {
		jugadores = new ArrayList<>();
	}

	public void jugar() {
		ArrayList<String> jugadores = new ArrayList<>();

		Juego juego = new Juego(jugadores);
		juego.inicializarJugadores(jugadores.size());

		juego.entregarCartas(5);

	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
}