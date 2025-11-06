package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item();
		
		item.setNombre("CocaCola");
		item.setProductosActuales(20);
		item.imprimir();
		
		item.vender(8);
		item.imprimir();
		
		item.devolver(2);
		item.imprimir();
	}
}
