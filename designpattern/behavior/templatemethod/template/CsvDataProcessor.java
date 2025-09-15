package designpattern.behavior.templatemethod.template;

/*
 * Implementação concreta para processamento de daos CSV.
 */
public class CsvDataProcessor extends DataProcessor {
	
	@Override
	protected void readData() {
		System.out.println("Lendo dados de um arquivo CSV...");
	}
	
	@Override
	protected void processData() {
		System.out.println("Processando dados CSV...");
	}
}
