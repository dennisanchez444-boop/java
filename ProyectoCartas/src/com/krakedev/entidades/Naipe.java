package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		cartas = new ArrayList<>();
		numerosPosibles = new ArrayList<>();

		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		for (int i = 0; i < numerosPosibles.size(); i++) {
		    for (int j = 0; j < Palos.PALOS.length; j++) {
		        cartas.add(new Carta(numerosPosibles.get(i), Palos.PALOS[j]));
		    }
		}
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();

		for (int i = 0; i < 100; i++) {

			int pos = Random.obtenerPosicion();
			Carta carta = cartas.get(pos);

			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);

			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		return auxiliar;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
}
