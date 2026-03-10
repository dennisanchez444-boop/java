package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(6);
		Cuadrado c2 = new Cuadrado(8);
		Cuadrado c3 = new Cuadrado(10);
		double area1;
		double perimetro1;
		double area2;
		double perimetro2;
		double area3;
		double perimetro3;
		
		c1.setLado(4);
		c2.setLado(3);
		c3.setLado(8);;
		
		area1=c1.calcularArea();
		perimetro1=c1.calcularPerimetro();
		area2=c2.calcularArea();
		perimetro2=c2.calcularPerimetro();
		area3=c3.calcularArea();
		perimetro3=c3.calcularPerimetro();
		System.out.println("CUADRADO 1");
        System.out.println("Area del Cuadrado: "+area1);
        System.out.println("Perimetro del Cuadrado: "+perimetro1);
        System.out.println("CUADRADO 2");
        System.out.println("Area del Cuadrado: "+area2);
        System.out.println("Perimetro del Cuadrado: "+perimetro2);
        System.out.println("CUADRADO 3");
        System.out.println("Area del Cuadrado: "+area3);
        System.out.println("Perimetro del Cuadrado: "+perimetro3);
	}

}
