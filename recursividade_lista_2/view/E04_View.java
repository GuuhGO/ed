/*4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
duplo de 5 é:*/
package recursividade_lista_2.view;

import java.util.Scanner;

import recursividade_lista_2.controller.E04_Controller;

public class E04_View {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		E04_Controller fatDupla = new E04_Controller();
		boolean valid = false;
		int resultado = 0;
		int input1 = 0;
		do {
			System.out.printf("Informe um número ímpar: ");
			input1 = scanner.nextInt();
			if (input1 % 2 == 1) {
				resultado = fatDupla.double_fat(input1);
				valid = true;
			} else {
				System.out.println("Entrada inválida, insira somente números ímpares");
			}
		} while (!valid);
		System.out.printf("Resultado da fatorial dupla de %d = %d", input1, resultado);
		scanner.close();
	}
}
