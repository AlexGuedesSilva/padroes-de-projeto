package designPattern.creating.builder.variants;

import designPattern.creating.builder.product.Computer;

/** Interface abstrata que define o processo de build fluente */
public interface ComputerBuilder {

	ComputerBuilder storage(int s);
    ComputerBuilder graphicsCard(boolean g);
    Computer build();
}
