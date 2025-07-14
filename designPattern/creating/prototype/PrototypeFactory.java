package designpattern.creating.prototype;

import java.util.HashMap;

public class PrototypeFactory {
    private static HashMap<String, Prototype> cloneMap = new HashMap<>();

    static {
        cloneMap.put("Class", new UMLClass());
        cloneMap.put("Attribute", new UMLAttribute());
        cloneMap.put("Association", new UMLAssociation());
    }

    public Prototype getPrototype(String identifier) throws CloneNotSupportedException {
        Prototype p = cloneMap.get(identifier);
        return (p != null) ? p.clone() : null;
    }
}

