package designpattern.behavior.visitor.visitor;

import designpattern.behavior.visitor.element.Book;
import designpattern.behavior.visitor.element.Fruit;

public class NameVisitor implements Visitor {

	@Override
	public void visit(Book book) {
		System.out.println("Livro: "+ book.getTitle());
	}

	@Override
	public void visit(Fruit fruit) {
		System.out.println("Fruta: " + fruit.getName());
	}
	
}
