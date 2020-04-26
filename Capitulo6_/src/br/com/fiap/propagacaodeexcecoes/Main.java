package br.com.fiap.propagacaodeexcecoes;

public class Main {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub

		Calculadora conta = new Calculadora();

		try {
			conta.sacar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		conta.depositar(200);
	}

}
