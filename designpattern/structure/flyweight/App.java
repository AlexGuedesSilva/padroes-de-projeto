package designpattern.structure.flyweight;

import designpattern.structure.flyweight.flyweight.Icon;
import designpattern.structure.flyweight.flyweight.IconFactory;

public class App {
    public static void main(String[] args) {
        String[] types = {"File", "Folder", "File", "File", "Folder", "Image"};
        int[][] coords = {{0,0},{10,5},{5,5},{20,20},{15,5},{30,10}};
        
        for (int i = 0; i < types.length; i++) {
            Icon icon = IconFactory.getIcon(types[i]);
            icon.draw(coords[i][0], coords[i][1]);
        }

        System.out.println("Número de ícones distintos criados: " + IconFactory.getIconCount());
    }
}
