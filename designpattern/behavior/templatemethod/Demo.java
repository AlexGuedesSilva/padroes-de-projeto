package designpattern.behavior.templatemethod;

import designpattern.behavior.templatemethod.template.CsvDataProcessor;
import designpattern.behavior.templatemethod.template.DataProcessor;
import designpattern.behavior.templatemethod.template.JsonDataProcessor;

public class Demo {
	public static void main(String[] args) {
		DataProcessor csvProcessor = new CsvDataProcessor();
		DataProcessor jsonProcessor = new JsonDataProcessor();
		
		System.out.println("=== Excecutando CSV processor ===");
		csvProcessor.process();
		
		System.out.println("\n=== Executando JSON Processor ===");
		jsonProcessor.process();
	}
}
