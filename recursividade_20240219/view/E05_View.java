/*5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/
package ed.recursividade_20240219.view;

import java.util.Scanner;

import ed.recursividade_20240219.controller.E05_Controller;

public class E05_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		E05_Controller somatoria_div = new E05_Controller();
		
		System.out.printf("Informe um número inteiro: ");
		int valor = scanner.nextInt();
		double somatoria = somatoria_div.somatoria(valor);
		System.out.printf("Resultado da somatória das divisões: %f", somatoria);
		scanner.close();
	}

}
