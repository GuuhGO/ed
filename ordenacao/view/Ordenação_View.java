package ordenacao.view;

import ordenacao.controller.Ordenacao_Controller;

public class Ordenação_View {

	public static void main(String[] args) {
		// int[] array1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] array1 = {44, 43, 42, 41, 40, 39, 38};

		int option = 1;

		System.out.println("Vetor desordenado: ");
		for (int i : array1) {
			System.out.printf("%d ", i);
		}

		Ordenacao_Controller sortC = new Ordenacao_Controller();
		int length = array1.length;

		int vetFinal[] = new int[length];
		if (option == 0) {
			// Utilizando Bubble Sort
			System.out.println("\n\nUTILIZANDO BUBBLE SORT");
			vetFinal = sortC.bubble_sort(array1);
		} else if (option == 1) {
			// Utilizando Merge Sort
			System.out.println("\n\nUTILIZANDO MERGE SORT");
			vetFinal = sortC.merge_sort(array1, 0, length - 1);
		}
		System.out.println("\n=============================================");
		System.out.println("Vetor ordenado: ");
		for (int i : vetFinal) {
			System.out.printf("%d\t", i);
		}

	}
}
