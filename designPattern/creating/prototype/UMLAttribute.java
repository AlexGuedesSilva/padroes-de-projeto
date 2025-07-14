package designpattern.creating.prototype;

public class UMLAttribute implements Prototype {
    private String attributeName = "Default Prototype Attribute Name";
    
    @Override
    public UMLAttribute clone() throws CloneNotSupportedException {
        System.out.println("Creating clone of UMLAttribute");
        return (UMLAttribute) super.clone();
    }


    // getters, setters...
	public String getAttributeName() {
		return attributeName;
	}


	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
}

