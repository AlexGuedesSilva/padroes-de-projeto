package designpattern.structure.composite.composite;

import java.util.ArrayList;
import java.util.List;

import designpattern.structure.composite.component.Graphic;

// Representa um nó que pode conter outros componentes (folha ou composto), delegando a impressão recursivamente.
public class CompositeGraphic implements Graphic{
	private final List<Graphic> childGraphic = new ArrayList<>();
	
	public void add(Graphic graphic) {
		childGraphic.add(graphic);
	}
	
	public void remove(Graphic graphic) {
		childGraphic.remove(graphic);
	}
	
	@Override
	public void print() {
		for(Graphic graphic : childGraphic) {
			graphic.print();
		}
	}

}
