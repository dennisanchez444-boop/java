package com.krakedev.entidades;

public class Random {
	public static int obtenerPosicion() {
		int posicion = (int) (Math.random() * 52);
		return posicion;
	}
}
