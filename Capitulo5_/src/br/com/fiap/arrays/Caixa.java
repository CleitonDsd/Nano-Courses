package br.com.fiap.arrays;

import br.com.fiap.entity.Produtos;

public class Caixa {

	public static void main(String[] args) {

		/*
		 * float[] valores = new float[5];
		 * 
		 * valores[0] = 10; valores[1] = 20; valores[2] = 30; valores[3] = 40;
		 * valores[4] = 50;
		 */

		float[] valores = { 10, 20, 30, 40, 50 };
		float[] valores2 = new float[] { 10, 20, 30, 40, 50 };

		System.out.println(valores[4]);
		System.out.println(valores2[4]);

		// Array na classe

		Produtos[] produtos = new Produtos[2];

		Produtos prod1 = new Produtos();

		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);

		Produtos prod2 = new Produtos();

		prod2.setNome("Maçã");
		prod2.setDescricao("Gala");
		prod2.setValor(5);

		produtos[0] = prod1;
		produtos[1] = prod2;

		System.out.println("");
		for (Produtos prod : produtos) {
			System.out.println(prod.toString());
		}

		// Array Multidimensional
		System.out.println("");
		System.out.println("= = = Array Multidimensional = = =");

		Produtos[][] localizacaoProduto = new Produtos[10][3];

		localizacaoProduto[2][1] = prod1;
		localizacaoProduto[2][2] = prod2;

		System.out.println("");
		System.out.println(localizacaoProduto[2][1].getNome());

	}

}
