package br.com.fiap.propagacaodeexcecoes;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Calculadora {

	private int num1;
	private int num2;

	/*
	 * Um método pode optar por não tratar a exceção e simplesmente propagá-la, ou
	 * melhor, delegar para o método que a chamou. Desa forma, podemos notificar o
	 * método que invocou outro método, que alguma exceção ocorreu.
	 */

	public int dividir(int n1, int n2) throws Exception {
		return n1 / n2;
		/*
		 * try { return n1 / n2; } catch (ArithmeticException e) { e.printStackTrace();
		 * } return 0;
		 */

		/*
		 * Um método pode lançar mais de um tipo de exceção, para isso basta separar por
		 * vírgulas
		 */
	}

	public void gravarArquivo(String valor) throws SecurityException, FileNotFoundException, IOException {

	}
	/*
	 * Sendo assim, a cláusula Throws declara exceções que podem ser lançadas em
	 * determinados métodos. Isso é uma vantagem para os desenvolvedores, pois
	 * deixamos de modo explícito os eventuais erros que podem ocorrer na chamada do
	 * método, permitindo que o tratamento adequado para o erro seja implementado.
	 */

	private double saldo;

	/*
	 * Nesse caos estamos validando se o valor depositado é maior que zero. Se for,
	 * o valor é adicionado ao saldo, caso não, uma exceção é lançada. Isso indica
	 * que o valor passado como parametro para o método é inválido. Repare que não
	 * foi preciso adicionar o throws na assinatura do método, pois essa exceção é
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
	 * Caso a Exceção seja CHECKED, é necessárip declarar na assinatura do método:
	 */
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
	}

}
