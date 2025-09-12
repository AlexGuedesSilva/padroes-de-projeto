package designpattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private final Map<String, Integer> variables = new HashMap<>();
	
	public void assign(String variable, int value) {
			variables.put(variable, value);
	}
	
	public int getValue(String variable) {
		return variables.getOrDefault(variable, 0);
	}
}
