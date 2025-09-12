package designpattern.behavior.interpreter.expression;

import designpattern.behavior.interpreter.Context;

public interface Expression {
	int interpret(Context context);
}
