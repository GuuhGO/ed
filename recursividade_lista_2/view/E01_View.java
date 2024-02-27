/*1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
mul�plicação de A por B.*/
package recursividade_lista_2.view;

import java.util.Scanner;

import recursividade_lista_2.controller.E01_Controller;

public class E01_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		E01_Controller multSum = new E01_Controller();
		System.out.print("Entre com fator 1: ");
		int fator1 = scanner.nextInt();
		
		System.out.print("Entre com o fator 2: ");
		int fator2 = scanner.nextInt();
		
		scanner.close();
		
		int resultado = multSum.mult_by_sum(fator1, fator2);
		System.out.printf("O resultado de %d * %d é igual a %d", fator1, fator2, resultado);
	}

}
