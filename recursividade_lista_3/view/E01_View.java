package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E01_Controller;

public class E01_View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um valor numérico inteiro: ");
		int value = scanner.nextInt();
		
		E01_Controller contDigit = new E01_Controller();
		int resultado = contDigit.conta_digitos(value);
		System.out.printf("O valor %d possui %d dígitos", value, resultado);
		scanner.close();
	}

}
