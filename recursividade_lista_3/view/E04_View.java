/*4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro, converta para binário. Entrada limitada a 2000.
• O Código deve apresentar, em formato de comentário, como foi definida a condição de
parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;

* Considere usar a saída da função recursiva como String
** Para converter uma variável inteira para String, fazer:
int n = 10;
String s = String.valueOf(n);
*/

package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E04_Controller;

public class E04_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		boolean valid = false;
		do {
			System.out.print("Informe um valor numérico até 2000: ");
			input = Integer.parseInt(scanner.nextLine());
			valid = (input >= 0 && input <= 2000);
			if (!valid) {
				System.out.print("VALOR DEVE SER ENTRE 0 E 2000!\n");
			}
		} while (!valid);

		E04_Controller e04 = new E04_Controller();
		StringBuffer conversao = e04.dec_to_bin(input);
		
		System.out.printf("Resultado da conversão: %s", conversao);
		scanner.close();
	}

}
