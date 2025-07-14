package designpattern.creating.builder.product;

/** Produto complexo construído pelo builder */
public class Computer {
	// Atributos
	private final String CPU;
	private final int RAM;
	private final int storage;
	private final boolean graphicsCard;

	// Construtor
	private Computer(ComputerBuilder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.graphicsCard = builder.graphicsCard;
	}

	@Override
	public String toString() {
		return "Computer[CPU=" + CPU + ", RAM=" + RAM + "GB, storage=" + storage + "GB, GPU=" + graphicsCard + "]";
	}

	/** Builder como inner static */
	public static class ComputerBuilder {
		// campos obrigatórios
		private final String CPU;
		private final int RAM;
		// campos opcionais com valores padrão
		private int storage = 256;
		private boolean graphicsCard = false;

		public ComputerBuilder(String CPU, int RAM) {
			this.CPU = CPU;
			this.RAM = RAM;
		}

		public ComputerBuilder storage(int val) {
			this.storage = val; return this;
		}

		public ComputerBuilder graphicsCard(boolean val) {
			this.graphicsCard = val; return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
