/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10
a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas
vezes o 2o número aparece no primeiro.
• Exemplo1: 1o. Número = 523578; 2o. Número = 5; retorno aparece 2 vezes
• Exemplo2: 1o. Número = 836363; 2o. Número = 3; retorno aparece 3 vezes
• A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
• O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada
dos passos;*/
package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E02_Controller;

public class E02_View {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value1;
		boolean valid = false;
		do {
			System.out.print("Informe o primeiro valor: ");
			value1 = Integer.parseInt(scanner.nextLine());
			valid = (value1 >= 10 && value1 <= 999999);
			if (!valid) {
				System.out.println("VALOR DEVE SER ENTRE 0 E 999999\n");
			}
		} while (!valid);
		
		int value2;
		do {
			System.out.print("Informe o segundo valor: ");
			value2 = Integer.parseInt(scanner.nextLine());
			valid = (value2 >= 0 && value2 <= 9);
			if (!valid) {
				System.out.println("VALOR DEVE SER ENTRE 0 E 9\n");
			}
		} while (!valid);

		E02_Controller e02 = new E02_Controller();
		int res = e02.count(value1, value2);

		System.out.printf("O número %d aparece %d vezes no número %d", value2, res, value1);
		scanner.close();
	}
}
