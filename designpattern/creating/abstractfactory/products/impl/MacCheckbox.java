package designpattern.creating.abstractfactory.products.impl;

import designpattern.creating.abstractfactory.products.Checkbox;

public class MacCheckbox implements Checkbox{
	public void paint() {
		System.out.println("Renderizado checkbox Mac");
	}
}
