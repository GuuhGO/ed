/*2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
subtrações, exiba o resto da divisão.*/
package recursividade_lista_2.view;

import java.util.Scanner;

import recursividade_lista_2.controller.E02_Controller;

public class E02_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		E02_Controller divSub = new E02_Controller();
		int dividendo;
		boolean valid = false;
		int divisor;
		do {
			System.out.print("Informe o dividendo: ");
			dividendo = scanner.nextInt();
			System.out.print("Informe o divisor: ");
			divisor = scanner.nextInt();
			if (divisor > 0 && dividendo > 0)
				valid = true;
			else
				System.out.println("Entradas inválidas, informe valores maiores do que 0");
		} while (!valid);
		
		scanner.close();
		
		int resultado = divSub.div_by_sub(dividendo, divisor);
		System.out.printf("%d divido por %d é igual a %d", dividendo, divisor, resultado);

	}

}
