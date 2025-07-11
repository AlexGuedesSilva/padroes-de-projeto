package designPattern.creating.abstractFactory.products.impl;

import designPattern.creating.abstractFactory.products.Button;

public class MacButton implements Button{
	public void paint() {
		System.out.println("Renderizado botão Mac");
	}
}
