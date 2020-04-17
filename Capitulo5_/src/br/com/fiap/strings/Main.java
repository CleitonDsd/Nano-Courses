package br.com.fiap.strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Método Equals
		String nome = "FIAP";
		String nome2 = new String("FIAP");
		/*
		 * Compara o conteúdo de duas Strings, direfenciando os caracteees maiusculos e
		 * minusculos;
		 */
		if (nome.equals(nome2)) {
			System.out.println("Às Strings são iguais");
		} else {
			System.out.println("Às Strings são diferentes");
		}
		/*
		 * para comparar se as Strings são diferentes basta adicionar
		 * !nome.contentEquals(nome2){};
		 */

		// Metodo equalsIgnoreCase();
		// compara o conteúdo mas não diferencia caracteres maiusculos e minusculos
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("Às Strings são iguais");
		} else {
			System.out.println("Às Strings são diferentes");
		}

		String faculdade = "FIAP a Melhor Faculdade de Tecnologia";

		// Verifica se uma String começa com uma sequência especifica de caracteres
		if (faculdade.startsWith("FIAP")) {
			System.out.println("A String começa com \"FIAP\". ");
		} else {
			System.out.println("A String não começa com \"FIAP\" ");
		}

		// Verifica se uma String termina com determinada sequencia de caracteres
		if (faculdade.endsWith("gia")) {
			System.out.println("A String termina com \"gia\". ");
		} else {
			System.out.println("A String não termina com \"gia\". ");
		}

		// Verifica a quantidade de caracteres numa string
		int caracteres = faculdade.length();
		System.out.println("A String possui " + caracteres + " caracteres");

		// Metodo para recuperar um caracter da String
		char caracter = faculdade.charAt(1);
		System.out.println("O segundo caracter da String é " + caracter);

		// Retorna a primeira ocorrência da palavra ou caractere
		int posicao = faculdade.indexOf('a');
		System.out.println("O índice do caracter 'a' na String é:" + posicao);
		// Quando não existir essa ocorrência na String o retorno será -1

		// Retorna o último índice da ocorrência de uma palavra ou caractere
		posicao = faculdade.lastIndexOf('a');
		System.out.println("O índice do último caracter 'a' na String é:" + posicao);

		// Copia caracteres de uma string a partir (ponto inicial, final)
		String nova = faculdade.substring(14, 23);
		System.out.println("A nova String é: " + nova);

		// retornar o método a partir da primeira ocorrência e criar uma nova String
		nova = faculdade.substring(faculdade.indexOf('M'), 24);
		System.out.println("A nova String é: " + nova);

		// Aceita apenas a inicial do conjunto de caracteres para forma um String nova
		nova = faculdade.substring(14);
		System.out.println("A nova String é: " + nova);

		// Utilizando os métodos em conjunto
		nova = faculdade.substring(faculdade.lastIndexOf('T'));
		System.out.println("A nova String é: " + nova);

		// Transformar todos caracteres na String em maiusculos
		nova = faculdade.toUpperCase();
		System.out.println("A nova String é: " + nova);

		// Transformar todos caracteres na String em minusculos
		nova = faculdade.toLowerCase();
		System.out.println("A nova String é: " + nova);

		// Substitui os caracteres de uma string original, com isso cria uma no string
		nova = faculdade.replace('a', 'x');
		System.out.println("A nova String é: " + nova);

		// substuindo palavras
		nova = faculdade.replace("Tecnologia", "São Paulo");
		System.out.println("A nova String é: " + nova);

		// Separa o valor de uma string em várias Strings separadas por um delimitador
		String[] palavras = faculdade.split(" ");
		for (String p : palavras) {
			System.out.println(p);
		}
		// Nesse caso o método usou o ; como delimitador e quebrou a linha
		String disciplinas = "LTP;WEB;Algoritmos;Bando de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
			System.out.println(d);
		}
	}

}
