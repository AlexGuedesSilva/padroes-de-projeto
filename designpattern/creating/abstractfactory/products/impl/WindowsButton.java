package designpattern.creating.abstractfactory.products.impl;

import designpattern.creating.abstractfactory.products.Button;

public class WindowsButton implements Button{
	public void paint() {
		System.out.println("Renderizado botão Windows");
	}

}
