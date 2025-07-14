package designpattern.creating.prototype.deep;

public class PrototypeClient {
    public static void main(String[] args) {
        ConcretePrototype original = (ConcretePrototype) PrototypeFactory.getPrototype("deep");
        System.out.println("Original config: " + original.getConfig());
        System.out.println("Original items: " + original.getItems());

        ConcretePrototype clone = (ConcretePrototype) PrototypeFactory.getPrototype("deep");
        clone.setConfig("ModifiedConfig");
        clone.addItem("C");

        System.out.println("\nApós modificação:");
        System.out.println("Original config: " + original.getConfig());
        System.out.println("Original items: " + original.getItems());
        System.out.println("Clone config: " + clone.getConfig());
        System.out.println("Clone items: " + clone.getItems());
    }
}
