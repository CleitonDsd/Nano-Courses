package br.com.fiap.strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// M�todo Equals
		String nome = "FIAP";
		String nome2 = new String("FIAP");
		/*
		 * Compara o conte�do de duas Strings, direfenciando os caracteees maiusculos e
		 * minusculos;
		 */
		if (nome.equals(nome2)) {
			System.out.println("�s Strings s�o iguais");
		} else {
			System.out.println("�s Strings s�o diferentes");
		}
		/*
		 * para comparar se as Strings s�o diferentes basta adicionar
		 * !nome.contentEquals(nome2){};
		 */

		// Metodo equalsIgnoreCase();
		// compara o conte�do mas n�o diferencia caracteres maiusculos e minusculos
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("�s Strings s�o iguais");
		} else {
			System.out.println("�s Strings s�o diferentes");
		}

		String faculdade = "FIAP a Melhor Faculdade de Tecnologia";

		// Verifica se uma String come�a com uma sequ�ncia especifica de caracteres
		if (faculdade.startsWith("FIAP")) {
			System.out.println("A String come�a com \"FIAP\". ");
		} else {
			System.out.println("A String n�o come�a com \"FIAP\" ");
		}

		// Verifica se uma String termina com determinada sequencia de caracteres
		if (faculdade.endsWith("gia")) {
			System.out.println("A String termina com \"gia\". ");
		} else {
			System.out.println("A String n�o termina com \"gia\". ");
		}

		// Verifica a quantidade de caracteres numa string
		int caracteres = faculdade.length();
		System.out.println("A String possui " + caracteres + " caracteres");

		// Metodo para recuperar um caracter da String
		char caracter = faculdade.charAt(1);
		System.out.println("O segundo caracter da String � " + caracter);

		// Retorna a primeira ocorr�ncia da palavra ou caractere
		int posicao = faculdade.indexOf('a');
		System.out.println("O �ndice do caracter 'a' na String �:" + posicao);
		// Quando n�o existir essa ocorr�ncia na String o retorno ser� -1

		// Retorna o �ltimo �ndice da ocorr�ncia de uma palavra ou caractere
		posicao = faculdade.lastIndexOf('a');
		System.out.println("O �ndice do �ltimo caracter 'a' na String �:" + posicao);

		// Copia caracteres de uma string a partir (ponto inicial, final)
		String nova = faculdade.substring(14, 23);
		System.out.println("A nova String �: " + nova);

		// retornar o m�todo a partir da primeira ocorr�ncia e criar uma nova String
		nova = faculdade.substring(faculdade.indexOf('M'), 24);
		System.out.println("A nova String �: " + nova);

		// Aceita apenas a inicial do conjunto de caracteres para forma um String nova
		nova = faculdade.substring(14);
		System.out.println("A nova String �: " + nova);

		// Utilizando os m�todos em conjunto
		nova = faculdade.substring(faculdade.lastIndexOf('T'));
		System.out.println("A nova String �: " + nova);

		// Transformar todos caracteres na String em maiusculos
		nova = faculdade.toUpperCase();
		System.out.println("A nova String �: " + nova);

		// Transformar todos caracteres na String em minusculos
		nova = faculdade.toLowerCase();
		System.out.println("A nova String �: " + nova);

		// Substitui os caracteres de uma string original, com isso cria uma no string
		nova = faculdade.replace('a', 'x');
		System.out.println("A nova String �: " + nova);

		// substuindo palavras
		nova = faculdade.replace("Tecnologia", "S�o Paulo");
		System.out.println("A nova String �: " + nova);

		// Separa o valor de uma string em v�rias Strings separadas por um delimitador
		String[] palavras = faculdade.split(" ");
		for (String p : palavras) {
			System.out.println(p);
		}
		// Nesse caso o m�todo usou o ; como delimitador e quebrou a linha
		String disciplinas = "LTP;WEB;Algoritmos;Bando de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
			System.out.println(d);
		}
	}

}
