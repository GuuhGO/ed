package ordenacao.view;

import java.util.Scanner;

import ordenacao.controller.E04_Controller;

public class E04_View {

	public static void main(String[] args) {
		int vet1[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int vet2[] = {44, 43, 42, 41, 40, 39, 38};
		int vet3[] = {31, 32, 33, 34, 99, 98, 97, 96};
		E04_Controller ordenacao_C_Lib = new E04_Controller();
		Scanner scanner = new Scanner(System.in);
		System.out.printf(
				"Escolha um método de ordenação:"
				+ "\n1 - Bubble Sort"
				+ "\n2 - Merge Sort"
				+ "\n3 - Quick Sort"
				+ "\nR: "
		);
		int opt = Integer.parseInt(scanner.nextLine());
		ordenacao_C_Lib.ordenar(vet3, opt);
	}
}
