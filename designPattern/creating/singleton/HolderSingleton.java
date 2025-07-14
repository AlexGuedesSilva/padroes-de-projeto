package designpattern.creating.singleton;

public final class HolderSingleton {
    private HolderSingleton() {}

    private static class SingletonHelper {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

