package designpattern.behavior.interpreter.expression;

import designpattern.behavior.interpreter.Context;

public class DivideExpression implements Expression {
	private final Expression leftExpression;
	private final Expression rightExpression;
	
	public DivideExpression(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}
	
	
	@Override
	public int interpret(Context context) {
		int divisor = rightExpression.interpret(context);
		if(divisor == 0) throw new ArithmeticException("Divisão por zero não permitida!");
		return leftExpression.interpret(context) / divisor;
	}

}
