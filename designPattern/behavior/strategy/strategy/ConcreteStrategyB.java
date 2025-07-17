package designpattern.behavior.strategy.strategy;

/**
 * Implementação concreta da estratégia B.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executando estratégia B");
    }
}
