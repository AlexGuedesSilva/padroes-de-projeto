package designpattern.creating.singleton.singletontest;

import java.io.Serializable;

public final class Singleton implements Serializable, Cloneable {
    private static volatile Singleton instance;

    private Singleton() {
        // Bloqueia instância extra via Reflection
        if (instance != null) {
            throw new IllegalStateException("Instância já criada. Use getInstance().");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Protege contra deser/deserialização criando novo objeto
    protected Object readResolve() {
        return getInstance();
    }

    // Impede clonagem via clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Não permitido clonar Singleton");
    }

    // Exemplo de funcionalidade
    public void doSomething() {
        System.out.println("Executando algo com " + this);
    }
}
