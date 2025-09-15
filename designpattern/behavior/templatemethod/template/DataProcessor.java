package designpattern.behavior.templatemethod.template;

/*
 * Classe abstrata que define o algoritmo base (Template Method).
 * O método process() é o "esqueleto" do algoritmo, com etapas fixas.
 */
public abstract class DataProcessor {

	// Template Method (define a sequência de passos)
	public final void process() {
		readData();
		processData();
		saveData();
	}
	
	protected abstract void readData();
	protected abstract void processData();
	
	// Passo comum para todas as subclasses (implementação padrão)
	protected void saveData() {
		System.out.println("Salvando dados no banco de dados...");
	}
}
