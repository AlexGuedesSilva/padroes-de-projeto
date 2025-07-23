package designpattern.creating.singleton;

public final class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Construtor privado evita instância externa
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
