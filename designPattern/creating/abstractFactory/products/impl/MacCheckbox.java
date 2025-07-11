package designPattern.creating.abstractFactory.products.impl;

import designPattern.creating.abstractFactory.products.Checkbox;

public class MacCheckbox implements Checkbox{
	public void paint() {
		System.out.println("Renderizado checkbox Mac");
	}
}
