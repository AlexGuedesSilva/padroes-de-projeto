package designpattern.creating.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype implements Prototype {
    private String config;
    private List<String> items;

    public ConcretePrototype() {
        this.items = new ArrayList<>();
    }

    public ConcretePrototype(ConcretePrototype source) {
        this.config = source.config;
        this.items = new ArrayList<>(source.items); // Deep copy da lista
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this);
    }
}
