package designpattern.structure.composite.leaf;

import designpattern.structure.composite.component.Graphic;

// Representa um elemento de árvore sem filhos.
public class Ellipse implements Graphic{
	@Override
	public void print() {
		System.out.println("Ellipse");
	}

}
