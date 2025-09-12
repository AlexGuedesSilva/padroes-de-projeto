package designpattern.behavior.visitor.element;

import designpattern.behavior.visitor.visitor.Visitor;

public interface Element {
	void accept(Visitor visitor);
}
