package pilhas.lista_3.view;

import java.util.Scanner;

import pilhas.lista_3.controller.PalindromoController;

public class PalindromoView {

	public static void main(String[] args) {
		PalindromoController pldrm = new PalindromoController();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com uma cadeia de strings: ");
		String input = scanner.nextLine();
		String reversed = pldrm.invertePalavra(input);
		boolean isPalindrome = pldrm.comparaPalavras(input, reversed);
		if (isPalindrome) {
			System.out.printf("%s é um palíndromo!\n", input);
		} else {
			System.out.printf("%s NÃO é um palíndromo!\n", input);
		}

	}
}