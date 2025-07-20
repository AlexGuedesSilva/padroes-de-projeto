package designpattern.structure.decorator;

import designpattern.structure.decorator.component.DataSource;
import designpattern.structure.decorator.component.FileDataSource;
import designpattern.structure.decorator.decorator.CompressionDecorator;
import designpattern.structure.decorator.decorator.EncryptionDecorator;

public class App {
    public static void main(String[] args) {
        String rawData = "Olá, Decorator!";
        DataSource file = new FileDataSource("arquivo.txt");

        DataSource encrypted = new EncryptionDecorator(file);
        DataSource compressedEncrypted = new CompressionDecorator(encrypted);

        compressedEncrypted.writeData(rawData);
        String result = compressedEncrypted.readData();

        System.out.println(result);
    }
}