package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
        item1.setNombre("Laptop");
        item1.setProductosActuales(20);
        item1.imprimir();
        item1.vender(5);
        item1.imprimir();
        item1.devolver(2);
        item1.imprimir();
        Item item2 = new Item();
        item2.setNombre("Mouse");
        item2.setProductosActuales(20);
        item2.vender(3);
        item2.devolver(1);
        item2.imprimir();
    }
}
