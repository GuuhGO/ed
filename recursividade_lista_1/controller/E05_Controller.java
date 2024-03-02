/*5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/
package recursividade_lista_1.controller;

public class E05_Controller {
	public E05_Controller() {
		super();
	}
	public double somatoria(int n) {
		// CONDIÇÃO DE PARADA
		// Se n for maior que 1, calcula a divisão de 1 por n e armazena em div
		// o resultado de div é somado com o resultado da próxima chamada da
		// função que recebe n - 1 como parâmetro e depois 
		// retorna-se o valor da soma.
		if (n > 1) {
			double div = (double) 1 / (double) n;
			return div + somatoria(n - 1);
		}
		// Quando N for igual a 1, retorna-se N pois 1/1 = 1
		return (double) n;
	}
}
