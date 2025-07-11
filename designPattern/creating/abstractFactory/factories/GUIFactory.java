package designPattern.creating.abstractFactory.factories;

import designPattern.creating.abstractFactory.products.Button;
import designPattern.creating.abstractFactory.products.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
