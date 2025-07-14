package designpattern.creating.builder.variants;

import designpattern.creating.builder.product.Computer;

/** Interface abstrata que define o processo de build fluente */
public interface ComputerBuilder {

	ComputerBuilder storage(int s);
    ComputerBuilder graphicsCard(boolean g);
    Computer build();
}
