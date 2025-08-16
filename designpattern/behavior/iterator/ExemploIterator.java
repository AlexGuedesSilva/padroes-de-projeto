package designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExemploIterator {
	public static void main(String[] args) {
	
		System.out.println("Exemplo imprimir nomes da lista com iterator");
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Carlos");
		nomes.add("Fernanda");
		
		Iterator<String> itNomes = nomes.iterator();
		itNomes.forEachRemaining(nome -> System.out.println("Nome: " + nome));
		
		/* Método tradiconal ou programação imperativa.
		while(itNomes.hasNext()) {
			System.out.println(itNomes.next());
		} /*/
		
		System.out.println();
		System.out.println("Exemplo excluir numeros impares da lista");
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		
		Iterator<Integer> itLista = numeros.iterator();
		while(itLista.hasNext()) {
			Integer numero = itLista.next();
			if(numero % 2 != 0) {
				itLista.remove();
			}
		}
		System.out.println("Lista após remoção: " + numeros);System.out.println();
		
		
		System.out.println("Exemplo: Remover Elementos Durante a Iteração");
		ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Cenoura");

        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            String fruta = it.next();
            if ("Banana".equals(fruta)) {
                it.remove(); // Remove "Banana" durante a iteração
            }
        }
        System.out.println("Lista após remoção: " + frutas);System.out.println();
        
        System.out.println("Exemplo: Navegação Bidirecional em uma Lista");
        List<String> nomes2 = new ArrayList<>(Arrays.asList("Ana", "Carlos", "Fernanda"));

        ListIterator<String> it2 = nomes2.listIterator();

        // Iteração para frente
        System.out.println("Iterando para frente:");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // Iteração para trás
        System.out.println("\nIterando para trás:");
        while (it2.hasPrevious()) {
            System.out.println(it2.previous());
        }
	}
}
