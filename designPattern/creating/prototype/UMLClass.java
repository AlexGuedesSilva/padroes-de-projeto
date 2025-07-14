package designpattern.creating.prototype;

public class UMLClass implements Prototype {
    private String className = "Default Prototype Class Name";

    public void setClassName(String className) {
        this.className = className;
    }
    public String getClassName() {
        return className;
    }

    @Override
    public UMLClass clone() throws CloneNotSupportedException {
        System.out.println("Creating clone of UMLClass");
        return (UMLClass) super.clone();
    }
}
