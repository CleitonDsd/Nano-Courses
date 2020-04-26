package br.com.fiap.acessoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			// stream é uma conexão de escrita para o arquivos
			stream = new FileWriter(caminho);
			// a classe PrintWriter escreverá no arquivo
			print = new PrintWriter(stream);

			for (String linha : conteudo) {
				// o método println escreve uma linha no arquivo
				print.println(linha);
			}
			// fecha o arquivo
			print.close();
			stream.close();

			System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void lerEstoque(String caminho) {
		try {
			// abre o arquivo
			FileReader stream = new FileReader(caminho);

			// BufferedReader possui o método readLine()
			// Lê uma linha do arquivo e retorna uma String como o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();

			// Enquanto linha for != null
			while (linha != null) {
				System.out.println(linha);
				linha = reader.readLine();

			}
			reader.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade");
		conteudo.add("Pera; 200; pct; R$ 5,40;");
		conteudo.add("Morango; 400; cx; R$ 6,50;");
		conteudo.add("Abacaxi; 280; un; R$ 5,00;");

		//gravarEstoque(nomeDoArquivo, caminho, conteudo);

		lerEstoque(caminho);
	}

}
