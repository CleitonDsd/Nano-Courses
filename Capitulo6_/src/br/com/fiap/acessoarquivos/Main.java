package br.com.fiap.acessoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		try {
			// abre o arquivo
			FileWriter stream = new FileWriter("arquivo.txt");
			PrintWriter print = new PrintWriter(stream);

			// escreve no arquivo
			print.println("Teste");
			print.println("Escrevendo no arquivo");

			print.close();
			// fecha o arquivo
			stream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			// Abre o arquivo
			FileReader stream = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			reader.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
