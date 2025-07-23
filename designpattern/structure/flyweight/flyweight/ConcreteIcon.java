package designpattern.structure.flyweight.flyweight;

public class ConcreteIcon implements Icon {
    private final String type; // estado intrínseco

    public ConcreteIcon(String type) {
        this.type = type;
    }

    @Override
    public void draw(int x, int y) {
        System.out.printf("Drawing %s icon at (%d, %d)\n", type, x, y);
    }
}