package designpattern.behavior.interpreter.expression;

import designpattern.behavior.interpreter.Context;

public class MinusExpression implements Expression {
	private final Expression leftExpression;
	private final Expression rightExpression;
	
	public MinusExpression(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}
	
	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) - rightExpression.interpret(context);
	}
}
