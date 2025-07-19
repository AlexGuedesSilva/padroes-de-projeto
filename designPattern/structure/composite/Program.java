package designpattern.structure.composite;

import designpattern.structure.composite.composite.CompositeGraphic;
import designpattern.structure.composite.leaf.Ellipse;

//Exemplo típico em que o cliente não precisa distinguir tipos entre folhas e compostos.
public class Program {
	public static void main(String[] args) {
		Ellipse e1 = new Ellipse();
		Ellipse e2 = new Ellipse();
		Ellipse e3 = new Ellipse();
		Ellipse e4 = new Ellipse();
		
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();
		
		graphic1.add(e1);
		graphic1.add(e2);
		graphic1.add(e3);

		graphic2.add(e4);
		
		graphic.add(graphic1);
		graphic.add(graphic2);
		
		graphic.print();
		// Saída esperada: imprime "Ellipse" 4 vezes
	
	
	}
}
