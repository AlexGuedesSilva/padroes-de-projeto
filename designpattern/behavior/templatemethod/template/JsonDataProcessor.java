package designpattern.behavior.templatemethod.template;

public class JsonDataProcessor extends DataProcessor {

	@Override
	protected void readData() {
		System.out.println("Lendo dados de um arquivo JSON...");
	}

	@Override
	protected void processData() {
		System.out.println("Processando dados JSON...");
	}
	
}
