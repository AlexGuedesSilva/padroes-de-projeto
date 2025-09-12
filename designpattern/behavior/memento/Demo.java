package designpattern.behavior.memento;

import designpattern.behavior.memento.caretaker.History;
import designpattern.behavior.memento.originador.Editor;

public class Demo {
	public static void main(String[] args) {
		Editor editor = new Editor();
        History history = new History();

        editor.setContent("Primeira versão");
        history.push(editor.save());

        editor.setContent("Segunda versão");
        history.push(editor.save());

        editor.setContent("Terceira versão");
        System.out.println("Conteúdo atual: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Após desfazer: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Após outro desfazer: " + editor.getContent());
	}
}
