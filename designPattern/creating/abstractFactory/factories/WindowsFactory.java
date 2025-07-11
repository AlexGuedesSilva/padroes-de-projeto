package designPattern.creating.abstractFactory.factories;

import designPattern.creating.abstractFactory.products.Button;
import designPattern.creating.abstractFactory.products.Checkbox;
import designPattern.creating.abstractFactory.products.impl.WindowsButton;
import designPattern.creating.abstractFactory.products.impl.WindowsCheckbox;

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
