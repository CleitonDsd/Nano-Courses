package br.com.fiap.entity;

public class Produtos {

	private String nome;
	private String descricao;
	private float valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto [nome: " + nome + " | descrição: " + descricao + " | valor(R$): " + valor + "]\n";
	}
}
