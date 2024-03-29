package pilhas.view;

import java.util.Scanner;

import pilhas.controller.ConverterController;

public class Main_Converter {
	public static void main(String[] args) {
		ConverterController conv = new ConverterController();
		int dec;
		boolean valid = false;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("Informe um valor de 0 a 1000: ");
			dec = Integer.parseInt(scanner.nextLine());
			valid = (dec >= 0 && dec <= 1000);
			if (!valid)
				System.out.println("ENTRADA INVÁLIDA");
		} while (!valid);
		scanner.close();
		String bin = conv.decToBin(dec);
		System.out.printf("%d em binário: %s", dec, bin);
	}
}
