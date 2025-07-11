package designPattern.creating.abstractFactory.factories;

import designPattern.creating.abstractFactory.products.Button;
import designPattern.creating.abstractFactory.products.Checkbox;
import designPattern.creating.abstractFactory.products.impl.MacButton;
import designPattern.creating.abstractFactory.products.impl.MacCheckbox;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}