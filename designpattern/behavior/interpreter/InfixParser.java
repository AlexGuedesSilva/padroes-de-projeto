package designpattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixParser {

	//Prioridade dos operadores
	private static final Map<String, Integer> precedence = new HashMap<>();
	
	static {
		precedence.put("+", 1);
		precedence.put("-", 1);
		precedence.put("*", 2);
		precedence.put("/", 2);
	}
	
	public String toPostfix(String infixExpression) {
		StringBuilder output = new StringBuilder();
		Stack<String> operators = new Stack<>();
		
		// Quebra a string por espaços
		String[] tokens = infixExpression.split(" ");
		for(String token : tokens) {
			if (token.matches("\\d+") || token.matches("[a-zA-Z]")) {
				// número ou variável
				output.append(token).append(" ");
			} else if (precedence.containsKey(token)) {
				// operador
				while (!operators.isEmpty() && precedence.containsKey(operators.peek())
						&& precedence.get(operators.peek()) >= precedence.get(token)) {
					output.append(operators.pop()).append(" ");
				}
				operators.push(token);
			} else if (token.equals("(")) {
				operators.push(token);
			} else if (token.equals(")")) {
				while (!operators.isEmpty() && !operators.peek().equals("(") ) {
					output.append(operators.pop()).append(" ");
				}
				if (!operators.isEmpty() && operators.peek().equals("(")) {
					operators.pop();
				}
			}
		}
		// esvazia a pilha
		while (!operators.isEmpty()) {
			output.append(operators.pop()).append(" ");
		}
		return output.toString().trim();
	}
}
