/*6. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória
S = 1 + 1/2! + 1/3! + 1/4! + ... + 1/N!
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;
*/
package recursividade_lista_3.controller;

public class E06_Controller {
	public E06_Controller() {
		super();
	}
	private double fatorial(int n) {
		if (n > 1) {
			return n * fatorial(n - 1);
		}
		return 1;
	}
	public double soma_fat(int num) {
		if (num > 1) {
			double div = 1 / fatorial(num);
			return div + soma_fat(num - 1);
		}
		return 1;
	}
}
