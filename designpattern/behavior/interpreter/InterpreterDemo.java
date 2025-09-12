package designpattern.behavior.interpreter;

import designpattern.behavior.interpreter.expression.Expression;
import designpattern.behavior.interpreter.expression.MinusExpression;
import designpattern.behavior.interpreter.expression.NumberExpression;
import designpattern.behavior.interpreter.expression.PlusExpression;

public class InterpreterDemo {
	public static void main(String[] args) {
		Context context = new Context();
		Context contextInfix = new Context();
		
		NumberExpression n1 = new NumberExpression(10);
		NumberExpression n2 = new NumberExpression(5);
		
		NumberExpression n3 = new NumberExpression(7);
		NumberExpression n4 = new NumberExpression(3);
		
		PlusExpression plusExpression1 = new PlusExpression(n1, n2);
		PlusExpression plusExpression2 = new PlusExpression(n3, n4);
		
		// Expressão: (10 + 5) - (7 + 3)
		Expression expression = new MinusExpression(plusExpression1, plusExpression2);
		
		int result = expression.interpret(context);
		System.out.println("Exemplo com expressão: (10 + 5) - (7 + 3)");
		System.out.println("Resultado da expressão: " + result);
		
		System.out.println();
		
		contextInfix.assign("x", 7);
		contextInfix.assign("y", 3);
		
		InfixParser infixParser = new InfixParser();
		ExpressionParser rpnParser = new ExpressionParser();
		
		// Expressão infixa
        String exprInfix = "( 10 + x ) * ( y - 2 )";
		
        // Converte para pós-fixa (RPN)
        String exprPostfix = infixParser.toPostfix(exprInfix);
        System.out.println("Expressão pós-fixa gerada: " + exprPostfix);
        
        // Monta a árvore com o parser RPN
        Expression expressionParser = rpnParser.parse(exprPostfix);
		
        // Interpreta
        int resultInfix = expressionParser.interpret(contextInfix);
        System.out.println("Resultado da expressão: " + resultInfix);
		
	}
}
