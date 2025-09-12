package designpattern.behavior.visitor.visitor;

import designpattern.behavior.visitor.element.Book;
import designpattern.behavior.visitor.element.Fruit;

public class PriceVisitor implements Visitor {
	private double total = 0;
	
	@Override
	public void visit(Book book) {
		total += book.getPrice();
	}

	@Override
	public void visit(Fruit fruit) {
		total += fruit.getWeight() * fruit.getPricePerKg();
	}

	public double getTotal() {
		return total;
	}
}
