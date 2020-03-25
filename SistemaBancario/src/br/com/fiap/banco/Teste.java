package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta cc = new Conta();

		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		cc.depositar(1000);
		System.out.println("Saldo atual (R$): " + cc.getSaldo());

		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		System.out.println("Saldo atual (R$): " + poupanca.getSaldo());

		Conta cc2 = null;

		if (cc2 != null) {
			cc2.depositar(1000);
		}

	}

}
