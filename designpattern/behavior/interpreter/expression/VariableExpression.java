package designpattern.behavior.interpreter.expression;

import designpattern.behavior.interpreter.Context;

public class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(name);
    }
}