package designpattern.creating.abstractfactory.products.impl;

import designpattern.creating.abstractfactory.products.Checkbox;

public class WindowsCheckbox implements Checkbox{
	public void paint() {
		System.out.println("Redenrizado checkbox Windows");
	}
}
