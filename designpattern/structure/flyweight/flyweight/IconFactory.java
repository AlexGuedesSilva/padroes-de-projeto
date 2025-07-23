package designpattern.structure.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private static final Map<String, Icon> icons = new HashMap<>();

    public static Icon getIcon(String type) {
        return icons.computeIfAbsent(type, ConcreteIcon::new);
    }

    public static int getIconCount() {
        return icons.size();
    }
}
