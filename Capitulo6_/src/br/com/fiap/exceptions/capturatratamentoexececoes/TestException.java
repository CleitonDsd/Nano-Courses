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
			System.out.println("Não é possível realizar uma divisão por zero");

			// Mensagem com a lista de erros
			System.out.println(e.getMessage());

			// Imprime a pilha de erro da exceção
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não é possível acessar a posição 4 do Array! ");

		} catch (NullPointerException e) {
			System.out.println("Não fo possível retorna o lenth, variável nome não instanciada");

		} catch (NumberFormatException e) {
			System.out.println("Não fo possível realizar a conversão!");

		} catch (Exception e) {
			System.out.println("Erro na execução do programa! ");
		} finally {
			System.out.println("Sempre passará aqui {finally}");
		}
	}

}
