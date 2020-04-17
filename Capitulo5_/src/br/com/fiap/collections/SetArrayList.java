package br.com.fiap.collections;

import java.util.HashSet;

public class SetArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Define uma coleção que não pode conter valores duplicados. */

		// Armazena seus elementos numa tabela Hash
		HashSet cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Java");// repetido!

		System.out.println(cursos);

		// Vantagaem do Set é a performance nas operações de busca
	}

}
