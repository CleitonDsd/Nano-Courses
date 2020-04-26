package br.com.fiap.exceptions.capturatratamentoexececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_Try_Catch_CapturaETratamentoExcecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Captura e tratamento de exce��es

		/*
		 * bloco TRY possui o c�digo que pode gerar uma exce��o, se acontecer algum erro
		 * o fluxo da excecu��o � desviado para o bloco CATCH
		 * 
		 * O Bloco CATCH s� � executado se uma exce��o for gerada
		 */

		System.out.println("");
		System.out.println("TRY_CATCH");
		System.out.println("");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();

		// Checked pois herda Exception
		try {
			int divisao = numero1 / numero2;
			System.out.println("O Resultado da Divis�o �: " + divisao);
		} catch (ArithmeticException e) {
			// java.lang.ArithmeticException: / by zero
			System.err.println("Erro ao Dividir!");
		}

		System.out.println("");
		System.out.println("Imprimir informa��es dos erros gerados");
		System.out.println("");
		/*
		 * //Dentro do bloco CATCH podemos recuperar a exce��o gerada, atrav�s do
		 * par�metro.
		 * 
		 * A classe THROWABLE possui alguns metodos que podem exibir informa��es dos
		 * erros gerados:
		 * 
		 * printStackTrace() -> imprime a pilha de erro encontrada na exce��o
		 * 
		 * getMessage() -> retorna uma mensagem contendo a lista de erros armazenadas em
		 * uma execu��o
		 */

		// Vamos imprmir o StackTrace e a mensagem de erro da Exce��o
		System.out.println("");
		int[] array = new int[2];

		try {
			// tenta acessar uma posi��o inexistente do vetor
			array[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Mensagem de erro: " + e.getMessage());

			e.printStackTrace();

			// retornar o valor do indice inv�lido que tentamos acessar no array;
		}
	}

}
