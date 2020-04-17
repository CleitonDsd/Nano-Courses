package br.com.fiap.collections;

import java.util.ArrayList;

public class GenerecisArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Podemos usar o Generics para restringir os tipos de dados aceitos por
		 * referencia genérica
		 */

		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cleiton");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Hellen");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.getNome());
		}
		/*
		 * for (int i = 0; i < listaCliente.size(); i++) { Cliente cli =
		 * listaCliente.get(i); System.out.println(cli.getNome()); }
		 */
	}
}
