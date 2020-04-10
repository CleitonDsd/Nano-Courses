package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tipoConta;
	private double chequeEspecial;

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
	}

	// sobreescrita = polimorfismo
	@Override
	public void retirar(double valor) {
		valor = +10;
		super.retirar(valor);
	}
}
