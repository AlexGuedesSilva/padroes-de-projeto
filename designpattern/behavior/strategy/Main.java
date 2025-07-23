package designpattern.behavior.strategy;

import designpattern.behavior.strategy.strategy.ConcreteStrategyA;
import designpattern.behavior.strategy.strategy.ConcreteStrategyB;
import designpattern.behavior.strategy.strategy.Context;

/**
 * Demonstração do uso do padrão Strategy.
 */
public class Main {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategyA());
		context.executeStrategy(); // Saída: Executando estratégia A

		context.setStrategy(new ConcreteStrategyB());
		context.executeStrategy(); // Saída: Executando estratégia B
	}
}
