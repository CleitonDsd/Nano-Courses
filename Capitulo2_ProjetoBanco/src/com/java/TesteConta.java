package com.java;

public class TesteConta {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();

		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Cleiton";
		contaCorrente.cliente.idade = 19;

		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaCorrente.cliente.nome = "Fulano";
		contaCorrente.cliente.idade = 40;

		contaInvestimento.cliente.nome = "Ciclano";
		contaInvestimento.cliente.idade = 40;
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 22;

		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);

	}

}
