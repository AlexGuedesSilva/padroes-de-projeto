package designpattern.creating.prototype;

public class UMLTool {
    public static void main(String[] args) {
        try {
            UMLClass umlClass = (UMLClass) new PrototypeFactory().getPrototype("Class");
            System.out.println("Name in umlClass instance: " + umlClass.getClassName());

            UMLAttribute umlAttr = (UMLAttribute) new PrototypeFactory().getPrototype("Attribute");
            System.out.println("Name in umlAttr instance: " + umlAttr.getAttributeName());

            UMLAssociation umlAssoc = (UMLAssociation) new PrototypeFactory().getPrototype("Association");
            System.out.println("Name in umlAssoc instance: " + umlAssoc.getAssociationName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
