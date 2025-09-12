package designpattern.behavior.interpreter;

import java.util.Stack;

import designpattern.behavior.interpreter.expression.DivideExpression;
import designpattern.behavior.interpreter.expression.Expression;
import designpattern.behavior.interpreter.expression.MinusExpression;
import designpattern.behavior.interpreter.expression.MultiplyExpression;
import designpattern.behavior.interpreter.expression.NumberExpression;
import designpattern.behavior.interpreter.expression.PlusExpression;
import designpattern.behavior.interpreter.expression.VariableExpression;

public class ExpressionParser {

	public Expression parse(String expression) {
		String[] tokens = expression.split(" ");
		Stack<Expression> stack = new Stack<>();
		
		for(String token : tokens) {
			Expression exp;
			
			switch(token) {
				case "+":
					Expression rightAdd = stack.pop();
					Expression leftAdd = stack.pop();
					exp = new PlusExpression(leftAdd, rightAdd);
					break;
				case "-":
					Expression rightSub = stack.pop();
					Expression leftSub = stack.pop();
					exp = new MinusExpression(leftSub, rightSub);
					break;
				case "*":
					Expression rightMul = stack.pop();
					Expression leftMul = stack.pop();
					exp = new MultiplyExpression(leftMul, rightMul);
					break;
				case "/":
					Expression rightDiv = stack.pop();
					Expression leftDiv = stack.pop();
					exp = new DivideExpression(leftDiv, rightDiv);
					break;
				default:
					if(token.matches("\\d+")) {
						exp = new NumberExpression(Integer.parseInt(token));
					} else {
						exp = new VariableExpression(token);
					}
				}
			stack.push(exp);
		}
		return stack.pop();
	}
}
