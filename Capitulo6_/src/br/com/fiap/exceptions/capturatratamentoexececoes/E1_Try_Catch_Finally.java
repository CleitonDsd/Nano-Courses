package br.com.fiap.exceptions.capturatratamentoexececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 * Al�m do Try e Catch existe o Finallyque � opcional e � utilizado quando
		 * sempre precisamos executar um c�digo, independente se aconteceu ou n�o uma
		 * exce��o
		 */
		try {
			System.out.println("");
			System.out.println("TRY_CATCH_FINALLY");
			System.out.println("");

			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();

			// Checked pois herda Exception

			int divisao = numero1 / numero2;
			System.out.println("O Resultado da Divis�o �: " + divisao);

		} catch (ArithmeticException e) {
			// java.lang.ArithmeticException: / by zero
			System.err.println("Erro ao Dividir!");

		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");

		} finally {
			System.out.println("Finalizando a excecu��o do programa!");
			scan.close();
		}

	}

}
