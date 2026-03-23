package com.cmc.evaluacion.test;

import com.cmc.evaluacion.Utilitario;
import com.cmc.evaluacion.entidades.Cuota;

public class TestImpresion {

	public static void main(String[] args) {
		Utilitario util = new Utilitario();
		
		Cuota cuota = new Cuota(1);
		cuota.setCuota(44.24);
		cuota.setInicio(5000);
		cuota.setInteres(50);
		cuota.setAbonoCapital(394.24134);
		cuota.setSaldo(4605.76);

		double r1 = util.redondear(cuota.getCuota());
		double r2 = util.redondear(cuota.getCapital());
		double r3 = util.redondear(cuota.getInicio());
		double r4 = util.redondear(cuota.getAbonoCapital());
		double r5 = util.redondear(cuota.getSaldo());
		
		System.out.println(r1+" | "+r2+" | "+r3+" | "+r4+" | "+r5);
	}
}
