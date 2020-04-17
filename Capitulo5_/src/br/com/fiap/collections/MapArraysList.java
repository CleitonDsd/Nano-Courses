package br.com.fiap.collections;

import java.util.HashMap;

public class MapArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mapas, são muito úteis quando precismaos recuperar de forma rápida as
		 * informações do objeto, para isso é preciso passar uma chave.
		 * 
		 * Para usar uma lista nesse caso teriamos que percorrer todos os elementos da
		 * lista para encontrar o indice correto
		 */

		HashMap mapa = new HashMap<>();

		// put adiciona valores
		mapa.put("RM86287", "Hellen");
		mapa.put("RM86288", "Cleiton");

		System.out.println(mapa);

		// recuperar elemento
		System.out.println(mapa.get("RM86287"));

		// remover um elemento
		mapa.remove("RM86287");

		System.out.println(mapa.get("RM86287"));
	}

}
