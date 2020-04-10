package br.com.fiap.lacos;

public class Caixa {

	public static void main(String[] args) {

		int quantidadeProdutos = 5;
		int registro = 0;
		
		System.out.println("=== WHILE ===");
		while (registro < quantidadeProdutos) {
			registro++;
			System.out.println(registro + "° produto registado");
		}
		
		System.out.println("=== DO WHILE ===");
		do {
			registro++;
			System.out.println(registro + "° produto registado");
		} while (registro < quantidadeProdutos);
		
		System.out.println("=== FOR ===");
		for (int i = 1; i <= quantidadeProdutos; i++) {
			System.out.println(registro + "° produto registado");
		}
	}

}
