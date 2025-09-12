package designpattern.behavior.memento.originador;

import designpattern.behavior.memento.memento.EditorState;

public class Editor {
	private String content;
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public EditorState save() {
		return new EditorState(content);
	}

	public void restore(EditorState state) {
		this.content = state.getContent();
	}
}
