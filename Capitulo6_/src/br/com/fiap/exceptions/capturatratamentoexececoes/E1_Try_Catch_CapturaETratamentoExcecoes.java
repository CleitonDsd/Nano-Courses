package br.com.fiap.exceptions.capturatratamentoexececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_Try_Catch_CapturaETratamentoExcecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Captura e tratamento de exceções

		/*
		 * bloco TRY possui o código que pode gerar uma exceção, se acontecer algum erro
		 * o fluxo da excecução é desviado para o bloco CATCH
		 * 
		 * O Bloco CATCH só é executado se uma exceção for gerada
		 */

		System.out.println("");
		System.out.println("TRY_CATCH");
		System.out.println("");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();

		// Checked pois herda Exception
		try {
			int divisao = numero1 / numero2;
			System.out.println("O Resultado da Divisão é: " + divisao);
		} catch (ArithmeticException e) {
			// java.lang.ArithmeticException: / by zero
			System.err.println("Erro ao Dividir!");
		}

		System.out.println("");
		System.out.println("Imprimir informações dos erros gerados");
		System.out.println("");
		/*
		 * //Dentro do bloco CATCH podemos recuperar a exceção gerada, através do
		 * parâmetro.
		 * 
		 * A classe THROWABLE possui alguns metodos que podem exibir informações dos
		 * erros gerados:
		 * 
		 * printStackTrace() -> imprime a pilha de erro encontrada na exceção
		 * 
		 * getMessage() -> retorna uma mensagem contendo a lista de erros armazenadas em
		 * uma execução
		 */

		// Vamos imprmir o StackTrace e a mensagem de erro da Exceção
		System.out.println("");
		int[] array = new int[2];

		try {
			// tenta acessar uma posição inexistente do vetor
			array[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Mensagem de erro: " + e.getMessage());

			e.printStackTrace();

			// retornar o valor do indice inválido que tentamos acessar no array;
		}
	}

}
