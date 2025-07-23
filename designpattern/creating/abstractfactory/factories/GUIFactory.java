package designpattern.creating.abstractfactory.factories;

import designpattern.creating.abstractfactory.products.Button;
import designpattern.creating.abstractfactory.products.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
