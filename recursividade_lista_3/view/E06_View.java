/*6. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória
S = 1 + 1/2! + 1/3! + 1/4! + ... + 1/N!
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;
*/
package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E06_Controller;

public class E06_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int N = Integer.parseInt(scanner.nextLine());

		E06_Controller e06 = new E06_Controller();
		double resultado = e06.soma_fat(N);
		System.out.printf("O resultado da somatória é %f\n\nFINALIZADO", resultado);
		
		scanner.close();
	}

}
