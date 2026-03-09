package com.krakedev;

public class Cuadrado {
  public double lado;
  
  public double calcularArea() {
	double areaCuadrado = Math.pow(lado, 2);
	return areaCuadrado;
  }
  
  public double calcularPerimetro() {
		double perimetroCuadrado = lado*4;
		return perimetroCuadrado;
	  }
}
