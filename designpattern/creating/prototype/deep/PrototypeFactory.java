package designpattern.creating.prototype.deep;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static final Map<String, Prototype> prototypes = new HashMap<>();

    static {
        ConcretePrototype cp = new ConcretePrototype();
        cp.setConfig("InitialConfig");
        cp.addItem("A");
        cp.addItem("B");
        prototypes.put("deep", cp);
    }

    public static Prototype getPrototype(String key) {
        Prototype prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
