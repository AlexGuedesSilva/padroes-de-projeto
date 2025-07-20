package designpattern.structure.decorator.component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileDataSource implements DataSource {
	private String filename;

	public FileDataSource(String filename) {
		super();
		this.filename = filename;
	}

	// 📦 src/designpattern/structure/decorator/component/FileDataSource.java
	@Override
	public void writeData(String data) {
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String readData() {
		try (FileReader reader = new FileReader(filename); BufferedReader br = new BufferedReader(reader)) {
			return br.lines().collect(Collectors.joining("\n"));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}