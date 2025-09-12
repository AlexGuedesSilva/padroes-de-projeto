package designpattern.behavior.visitor.visitor;

import designpattern.behavior.visitor.element.Book;
import designpattern.behavior.visitor.element.Fruit;

public interface Visitor {
	void visit(Book book);
	void visit(Fruit fruit);
}
