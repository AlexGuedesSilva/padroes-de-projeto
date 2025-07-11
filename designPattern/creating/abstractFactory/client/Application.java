package designPattern.creating.abstractFactory.client;

import designPattern.creating.abstractFactory.factories.GUIFactory;
import designPattern.creating.abstractFactory.products.Button;
import designPattern.creating.abstractFactory.products.Checkbox;

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
