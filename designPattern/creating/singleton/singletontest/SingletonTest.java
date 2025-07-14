package designpattern.creating.singleton.singletontest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) throws Exception {
        // Instância única
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1==s2? " + (s1 == s2));

        // Teste clone
        try {
            Singleton sClone = (Singleton) s1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone impedido: " + e.getMessage());
        }

        // Teste serialização
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("s.ser"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("s.ser"))) {
            out.writeObject(s1);
            Singleton s3 = (Singleton) in.readObject();
            System.out.println("s1==s3 após serialização? " + (s1 == s3));
        }

        // Teste reflexão
        try {
            Constructor<Singleton> c = Singleton.class.getDeclaredConstructor();
            c.setAccessible(true);
            Singleton s4 = c.newInstance();
            System.out.println("Reflection criou novo? " + (s1 == s4));
        } catch (Exception e) {
            System.out.println("Reflection bloqueado: " + e.getCause());
        }
    }
}

