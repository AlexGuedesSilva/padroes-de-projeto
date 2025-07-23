package designpattern.creating.abstractfactory.factories;

import designpattern.creating.abstractfactory.products.Button;
import designpattern.creating.abstractfactory.products.Checkbox;
import designpattern.creating.abstractfactory.products.impl.MacButton;
import designpattern.creating.abstractfactory.products.impl.MacCheckbox;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}