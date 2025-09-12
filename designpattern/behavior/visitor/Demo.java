package designpattern.behavior.visitor;

import designpattern.behavior.visitor.element.Book;
import designpattern.behavior.visitor.element.Fruit;
import designpattern.behavior.visitor.element.ShoppingCart;
import designpattern.behavior.visitor.visitor.NameVisitor;
import designpattern.behavior.visitor.visitor.PriceVisitor;

public class Demo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Book("Clean Code", 50));
		cart.addItem(new Book("Design Pattern", 70));
		cart.addItem(new Fruit("Maçã", 2, 5));
		cart.addItem(new Fruit("Banana", 3, 4));
		
		// Visitor para calcular preço
		PriceVisitor priceVisitor = new PriceVisitor();
		cart.accept(priceVisitor);
		System.out.println("Preço total: R$ " + priceVisitor.getTotal());
	
		// Visitor para exibir nomes
		NameVisitor nameVisitor = new NameVisitor();
		cart.accept(nameVisitor);
	}
}
