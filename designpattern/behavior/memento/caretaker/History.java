package designpattern.behavior.memento.caretaker;

import java.util.Stack;

import designpattern.behavior.memento.memento.EditorState;

public class History {
	private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        if (!states.isEmpty()) {
            return states.pop();
        }
        return null;
    }
}
