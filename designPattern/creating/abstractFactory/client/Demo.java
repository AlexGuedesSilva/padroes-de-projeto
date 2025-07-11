package designPattern.creating.abstractFactory.client;

import designPattern.creating.abstractFactory.factories.GUIFactory;
import designPattern.creating.abstractFactory.factories.MacFactory;
import designPattern.creating.abstractFactory.factories.WindowsFactory;

public class Demo {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}

