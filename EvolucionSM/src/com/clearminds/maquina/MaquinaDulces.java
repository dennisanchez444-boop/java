package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda1: " + celda1.getCodigo());
		System.out.println("Celda2: " + celda2.getCodigo());
		System.out.println("Celda3: " + celda3.getCodigo());
		System.out.println("Celda4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo))
			return celda1;
		if (celda2.getCodigo().equals(codigo))
			return celda2;
		if (celda3.getCodigo().equals(codigo))
			return celda3;
		if (celda4.getCodigo().equals(codigo))
			return celda4;
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		}
	}

	public void mostrarProductos() {

		Celda[] celdas = { celda1, celda2, celda3, celda4 };

		for (Celda celda : celdas) {

			System.out.println("********** CELDA " + celda.getCodigo());
			System.out.println("Saldo: " + saldo);
			System.out.println("Stock: " + celda.getStock());

			if (celda.getProducto() != null) {
				System.out.println("Nombre Producto: " + celda.getProducto().getNombre());
				System.out.println("Precio Producto: " + celda.getProducto().getPrecio());
				System.out.println("Código Producto: " + celda.getProducto().getCodigo());
			} else {
				System.out.println("La celda no tiene producto");
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);

		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto().getPrecio();
		}

		return 0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {

		if (celda1.getProducto().getCodigo().equals(codigoProducto))
			return celda1;

		if (celda2.getProducto().getCodigo().equals(codigoProducto))
			return celda2;

		if (celda3.getProducto().getCodigo().equals(codigoProducto))
			return celda3;

		if (celda4.getProducto().getCodigo().equals(codigoProducto))
			return celda4;

		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidad);
		}
	}

	public void vender(String codigoCelda) {

		Celda celda = buscarCelda(codigoCelda);

		if (celda != null) {

			int stockActual = celda.getStock();
			celda.setStock(stockActual - 1);

			double precio = celda.getProducto().getPrecio();
			saldo += precio;

			mostrarProductos();
			System.out.println("Saldo maquina: " + saldo);
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {

		Celda celda = buscarCelda(codigoCelda);

		if (celda != null) {

			celda.setStock(celda.getStock() - 1);

			double precio = celda.getProducto().getPrecio();
			saldo += precio;

			double cambio = valorIngresado - precio;

			return cambio;
		}

		return 0;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}