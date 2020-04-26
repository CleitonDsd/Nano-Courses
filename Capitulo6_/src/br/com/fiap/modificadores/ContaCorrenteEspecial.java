package br.com.fiap.modificadores;

import br.com.fiap.propagacaodeexcecoes.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente implements Transferivel{
	
	private double limite;
	
	//sobrecarga de método - polimorfismo
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
	}

	@Override
	public double verificarSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}
}
