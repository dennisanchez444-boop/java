package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p = new Producto("Laptop",500);
		p.setPrecio(400);
		double valor = p.calcularPrecioPromo(10);
		
        System.out.println("Valor del producto con su descuento: "+valor);
	}

}
