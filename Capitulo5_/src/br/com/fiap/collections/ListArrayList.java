package br.com.fiap.collections;

import java.util.ArrayList;

public class ListArrayList {

	public static void main(String[] args) {
		
		/*
		 * representa uma sequencia de elementos ordenados e podem conter elementos
		 * repetidos.
		 */
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("LTP");
		lista.add("Web");
		lista.add(1, "Algoritmos");

		lista.remove(1);

		System.out.println(lista.get(1));
		// size() retorna a quantidade elementos
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		/*
		 * for (String i : lista) { System.out.println(i); }
		 */

		// procurar valor em uma ArrayList
		int indice = lista.indexOf("Web");
		System.out.println("O valor \"Web\" está na posição: " + indice);
	}
}
