package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta cc = new Conta();

		cc.saldo = 50;
		cc.agencia = 123;
		cc.numero = 321;
		cc.depositar(1000);
		System.out.println("Saldo atual (R$): " + cc.verificarSaldo());

		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		System.out.println("Saldo atual (R$): " + poupanca.verificarSaldo());

		Conta cc2 = null;

		if (cc2 != null) {
			cc2.depositar(1000);
		}

	}

}
