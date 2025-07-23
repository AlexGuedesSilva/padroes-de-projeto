package designpattern.behavior.strategy.strategy;

/**
 * O contexto mantém uma referência para um objeto Strategy
 * e delega a execução da estratégia para ele.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
