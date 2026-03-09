package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p1 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetro1;
		//Area
		r1.base=10;
		r1.altura=5;
		r2.base=8;
		r2.altura=3;
		//Perimetro
		p1.base=4;
		p1.altura=2;
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		perimetro1=p1.calcularPerimetro();
        System.out.println("r1: "+areaR1);
        System.out.println("r2: "+areaR2);
        System.out.println("p1: "+perimetro1);
       
	}

}
