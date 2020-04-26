package br.com.fiap.propagacaodeexcecoes;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Calculadora {

	private int num1;
	private int num2;

	/*
	 * Um m�todo pode optar por n�o tratar a exce��o e simplesmente propag�-la, ou
	 * melhor, delegar para o m�todo que a chamou. Desa forma, podemos notificar o
	 * m�todo que invocou outro m�todo, que alguma exce��o ocorreu.
	 */

	public int dividir(int n1, int n2) throws Exception {
		return n1 / n2;
		/*
		 * try { return n1 / n2; } catch (ArithmeticException e) { e.printStackTrace();
		 * } return 0;
		 */

		/*
		 * Um m�todo pode lan�ar mais de um tipo de exce��o, para isso basta separar por
		 * v�rgulas
		 */
	}

	public void gravarArquivo(String valor) throws SecurityException, FileNotFoundException, IOException {

	}
	/*
	 * Sendo assim, a cl�usula Throws declara exce��es que podem ser lan�adas em
	 * determinados m�todos. Isso � uma vantagem para os desenvolvedores, pois
	 * deixamos de modo expl�cito os eventuais erros que podem ocorrer na chamada do
	 * m�todo, permitindo que o tratamento adequado para o erro seja implementado.
	 */

	private double saldo;

	/*
	 * Nesse caos estamos validando se o valor depositado � maior que zero. Se for,
	 * o valor � adicionado ao saldo, caso n�o, uma exce��o � lan�ada. Isso indica
	 * que o valor passado como parametro para o m�todo � inv�lido. Repare que n�o
	 * foi preciso adicionar o throws na assinatura do m�todo, pois essa exce��o �
	 * UNCHEKED.
	 */
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor < 0) {
//			throw new IllegalArgumentException();
			throw new ValorInvalidoException();
		}
		saldo += valor;
	}

	/*
	 * Caso a Exce��o seja CHECKED, � necess�rip declarar na assinatura do m�todo:
	 */
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
	}

}
