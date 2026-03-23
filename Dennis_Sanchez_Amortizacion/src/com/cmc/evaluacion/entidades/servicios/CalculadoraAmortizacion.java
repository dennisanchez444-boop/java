package com.cmc.evaluacion.entidades.servicios;

import com.cmc.evaluacion.Utilitario;
import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double monto = prestamo.getMonto();
		double interesAnual = prestamo.getInteres();
		int plazo = prestamo.getPlazo();

		double i = interesAnual / 100 / 12;

		double cuota = (monto * i) / (1 - Math.pow(1 + i, -plazo));

		return cuota;
	}

	Utilitario util = new Utilitario();

	public void generarTabla(Prestamo prestamo) {
		double cuotaCalculada = util.redondear(calcularCuota(prestamo));
		Cuota[] cuotas = prestamo.getCuotas();

		for (int i = 0; i < cuotas.length; i++) {
			cuotas[i] = new Cuota(i + 1);
			cuotas[i].setCuota(cuotaCalculada);
		}
		cuotas[0].setInicio(prestamo.getMonto());

		double interesMensual = prestamo.getInteres() / 100 / 12;

		for (int i = 0; i < cuotas.length; i++) {
			Cuota actual = cuotas[i];
			Cuota siguiente = (i < cuotas.length - 1) ? cuotas[i + 1] : null;
			calcularValoresCuota(interesMensual, actual, siguiente);
		}
		Cuota ultima = cuotas[cuotas.length - 1];
		double saldoPendiente = ultima.getSaldo();
		ultima.setAbonoCapital(ultima.getAbonoCapital() + saldoPendiente);
		ultima.setSaldo(0);
	}

	public void calcularValoresCuota(double interes, Cuota actual, Cuota siguiente) {
		double inicio = util.redondear(actual.getInicio());

		double interesCalculado = util.redondear(inicio * interes);
		double abonoCapital = util.redondear(actual.getCuota() - interesCalculado);
		double saldo = util.redondear(inicio - abonoCapital);

		actual.setInicio(inicio);
		actual.setInteres(interesCalculado);
		actual.setAbonoCapital(abonoCapital);
		actual.setSaldo(saldo);

		if (siguiente != null) {
			siguiente.setInicio(saldo);
		}
	}
}