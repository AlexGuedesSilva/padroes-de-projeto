package designpattern.creating.abstractfactory;

import designpattern.creating.abstractfactory.client.Application;
import designpattern.creating.abstractfactory.factories.GUIFactory;
import designpattern.creating.abstractfactory.factories.MacFactory;
import designpattern.creating.abstractfactory.factories.WindowsFactory;

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

