package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Conta cc = new Conta(); */

		ContaCorrente cc = new ContaCorrente();

		cc.setAgencia(456);
		cc.setNumero(4211);
		cc.setTipoConta("PF");
		cc.setChequeEspecial(1000);
	}

}
