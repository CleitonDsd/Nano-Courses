package br.com.fiap.exceptions.capturatratamentoexececoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestExceptionChecked {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("c:\\nota.txt");

		PrintWriter print = new PrintWriter(fw);
		print.println("Maça = R$ 4,00");
		print.println("Morango = R$ 6,50");
		print.println("Total = R$ 10,50");
		print.close();
		fw.close();
	}

}
