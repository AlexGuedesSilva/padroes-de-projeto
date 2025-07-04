package designPattern.structure.adapter;

public class Main {
    public static void main(String[] args) {
        TomadaDeTresPinos tomada = new AdapterTomada();
        tomada.conectar(); // Saída: Ligado na tomada de dois pinos.
    }
}
