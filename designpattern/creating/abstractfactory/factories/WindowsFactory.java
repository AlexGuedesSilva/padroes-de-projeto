package designpattern.creating.abstractfactory.factories;

import designpattern.creating.abstractfactory.products.Button;
import designpattern.creating.abstractfactory.products.Checkbox;
import designpattern.creating.abstractfactory.products.impl.WindowsButton;
import designpattern.creating.abstractfactory.products.impl.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
