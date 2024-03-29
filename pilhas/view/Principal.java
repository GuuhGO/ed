package pilhas.view;

import java.util.Scanner;

import pilhas.controller.FatController;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		boolean valid = false;
		do {
			System.out.print("Digite um valor de 0 a 10: ");
			valor = Integer.parseInt(scanner.nextLine());
			valid = (valor >= 0 && valor <= 10);
			if(!valid) {
				System.out.print("VALOR INVÁLIDO\n");
			}
		} while (!valid);
		scanner.close();
		FatController fatController = new FatController();
		int fat = fatController.fatorial(valor);
		System.out.printf("%d! = %d\n", valor, fat);
	}
}
