package br.com.fiap.exceptions.capturatratamentoexececoes;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int valor = 10 / 0;

			int[] valores = new int[3];
			System.out.println(valores[4]);

			String nome = null;
			System.out.println(nome.length());

			int numero = Integer.parseInt("zero");

		} catch (ArithmeticException e) {
			System.out.println("N�o � poss�vel realizar uma divis�o por zero");

			// Mensagem com a lista de erros
			System.out.println(e.getMessage());

			// Imprime a pilha de erro da exce��o
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("N�o � poss�vel acessar a posi��o 4 do Array! ");

		} catch (NullPointerException e) {
			System.out.println("N�o fo poss�vel retorna o lenth, vari�vel nome n�o instanciada");

		} catch (NumberFormatException e) {
			System.out.println("N�o fo poss�vel realizar a convers�o!");

		} catch (Exception e) {
			System.out.println("Erro na execu��o do programa! ");
		} finally {
			System.out.println("Sempre passar� aqui {finally}");
		}
	}

}
