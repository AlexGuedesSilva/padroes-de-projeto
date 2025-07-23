package designpattern.creating.builder.variants;

import designpattern.creating.builder.product.Computer;

/**
 * ConcreteBuilder padrão para configurar um PC Gamer.
 * Aplica configuração base fixa: GPU ativada e storage 1024GB por padrão.
 */
public class GamingComputerBuilder implements ComputerBuilder {
    private final String cpu;
    private final int ram;
    private int storage = 1024;
    private boolean graphics = true;

    public GamingComputerBuilder(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public GamingComputerBuilder storage(int s) {
        this.storage = s;
        return this;
    }

    @Override
    public GamingComputerBuilder graphicsCard(boolean g) {
        this.graphics = g;
        return this;
    }

    @Override
    public Computer build() {
        // Usa o builder interno de Computer
        return new Computer.ComputerBuilder(cpu, ram)
                    .storage(storage)
                    .graphicsCard(graphics)
                    .build();
    }
}
