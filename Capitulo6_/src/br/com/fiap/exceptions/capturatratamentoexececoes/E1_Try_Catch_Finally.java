package br.com.fiap.exceptions.capturatratamentoexececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 * Além do Try e Catch existe o Finallyque é opcional e é utilizado quando
		 * sempre precisamos executar um código, independente se aconteceu ou não uma
		 * exceção
		 */
		try {
			System.out.println("");
			System.out.println("TRY_CATCH_FINALLY");
			System.out.println("");

			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();

			// Checked pois herda Exception

			int divisao = numero1 / numero2;
			System.out.println("O Resultado da Divisão é: " + divisao);

		} catch (ArithmeticException e) {
			// java.lang.ArithmeticException: / by zero
			System.err.println("Erro ao Dividir!");

		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");

		} finally {
			System.out.println("Finalizando a excecução do programa!");
			scan.close();
		}

	}

}
