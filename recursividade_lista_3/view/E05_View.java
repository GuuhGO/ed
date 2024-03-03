/*5. Considere a série de Fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
Entrada limitada a 20 (Condição que deve ser testada na Main da aplicação).
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/

package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E05_Controller;

public class E05_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pos;
		boolean valid = false;
		do {
			System.out.print("Informe a posição da série Fibonacci: ");
			pos = Integer.parseInt(scanner.nextLine());
			valid = pos >= 1 && pos <= 20;
			if (!valid)
				System.out.print("VALOR DEVE SER ENTRE 1 E 20\n");
		} while (!valid);
		E05_Controller e05 = new E05_Controller();
		int resultado = e05.fibonacci(pos);
		System.out.printf("Valor na %dº posição: %d", pos, resultado);
		scanner.close();
	}

}
