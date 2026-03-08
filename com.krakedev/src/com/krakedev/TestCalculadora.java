package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu= new Calculadora();
		resultadoSuma=calcu.sumar(5,3);
        resultadoResta=calcu.restar(10, 7);
        resultadoMultiplicacion=calcu.multiplicar(10, 5);
        resultadoDividir=calcu.dividir(10, 2);
        resultadoPromedio=calcu.promediar(10, 8, 9);
        calcu.mostrarResultado();
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicacion);
		System.out.println("RESULTADO DIVICION: "+resultadoDividir);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);
	}
}
