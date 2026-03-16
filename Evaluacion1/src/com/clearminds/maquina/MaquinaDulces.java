package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (Celda c : celdas) {
			System.out.println("Celda: " + c.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		for (Celda c : celdas) {
			if (c.getCodigo().equals(codigo)) {
				return c;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		}
	}

	public void mostrarProductos() {
		for (Celda c : celdas) {
			Producto p = c.getProducto();
			if (p != null) {
				System.out.println("Celda:" + c.getCodigo() + " Stock:" + c.getStock() + " Producto: " + p.getCodigo()
						+ " Precio: " + p.getPrecio());
			} else {
				System.out.println("Celda:" + c.getCodigo() + " Stock:" + c.getStock() + " Sin producto Asignado");
			}
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
	
	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidad);
		}
	}
	public Celda buscarCeldaProducto(String codigo) {
	    for (Celda c : celdas) {
	        Producto p = c.getProducto();
	        if (p != null && p.getCodigo().equals(codigo)) {
	            return c;
	        }
	    }
	    return null;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> menores = new ArrayList<>();

        for (Celda c : celdas) {
            Producto p = c.getProducto();
            if (p != null && p.getPrecio() <= limite) {
                menores.add(p);
            }
        }
        return menores;
    }

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
