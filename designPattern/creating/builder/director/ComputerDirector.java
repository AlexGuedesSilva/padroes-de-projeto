package designPattern.creating.builder.director;

import designPattern.creating.builder.product.Computer;
import designPattern.creating.builder.variants.ComputerBuilder;

/** Diretor define sequência padrão de construção */
public class ComputerDirector {
    private ComputerBuilder builder;
    
    public void setBuilder(ComputerBuilder b) { this.builder = b; }

    public Computer getComputer() { return builder.build(); }

    public void constructGamingPC() {
        builder.storage(1024)
               .graphicsCard(true);
    }
}

