package br.com.fiap.collections;

import java.util.HashSet;

public class SetArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Define uma cole��o que n�o pode conter valores duplicados. */

		// Armazena seus elementos numa tabela Hash
		HashSet cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Java");// repetido!

		System.out.println(cursos);

		// Vantagaem do Set � a performance nas opera��es de busca
	}

}
