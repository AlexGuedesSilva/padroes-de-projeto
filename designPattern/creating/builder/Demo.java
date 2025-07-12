package designPattern.creating.builder;

import designPattern.creating.builder.director.ComputerDirector;
import designPattern.creating.builder.product.Computer;
import designPattern.creating.builder.variants.ComputerBuilder;
import designPattern.creating.builder.variants.GamingComputerBuilder;

public class Demo {
    public static void main(String[] args) {
    	
        ComputerBuilder builder = new GamingComputerBuilder("Intel i9", 32);

        ComputerDirector director = new ComputerDirector();
		director.setBuilder(builder);
		director.constructGamingPC();
        Computer gamingPC = director.getComputer();
        System.out.println(gamingPC);

        // Ou sem Director, direto:
        Computer officePC = new GamingComputerBuilder("Intel i5", 16)
                                .storage(512)
                                .graphicsCard(false)
                                .build();
        System.out.println(officePC);
    }
}

