package designpattern.behavior.strategy.strategy;

/**
 * Implementação concreta da estratégia A.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executando estratégia A");
    }
}
