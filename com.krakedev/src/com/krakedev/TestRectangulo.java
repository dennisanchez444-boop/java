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
		r1.setBase(10);;
		r1.setAltura(5);;
		r2.setBase(8);;
		r2.setAltura(3);;
		//Perimetro
		p1.setBase(4);;
		p1.setAltura(2);;
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		perimetro1=p1.calcularPerimetro();
        System.out.println("r1: "+areaR1);
        System.out.println("r2: "+areaR2);
        System.out.println("p1: "+perimetro1);
       
	}

}
