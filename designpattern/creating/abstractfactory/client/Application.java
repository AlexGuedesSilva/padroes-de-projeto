package designpattern.creating.abstractfactory.client;

import designpattern.creating.abstractfactory.factories.GUIFactory;
import designpattern.creating.abstractfactory.products.Button;
import designpattern.creating.abstractfactory.products.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}
