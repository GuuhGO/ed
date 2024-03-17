package ordenacao.view;

import ordenacao.controller.E05_Controller;

public class E05_View {

	public static void main(String[] args) {
		int vet1[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int vet2[] = {44, 43, 42, 41, 40, 39, 38};
		int vet3[] = {31, 32, 33, 34, 99, 98, 97, 96};
		E05_Controller ordenacao_C_Lib = new E05_Controller();
		System.out.print("VETOR EXERCÍCIO 1");
		System.out.println("\nVetor Desordenado");
		printVetor(vet1);
		vet1 = ordenacao_C_Lib.ordenar(vet1);
		System.out.println("\nVetor Ordenado");
		printVetor(vet1);

		System.out.print("VETOR EXERCÍCIO 2");
		System.out.println("\nVetor Desordenado");
		printVetor(vet2);
		vet2 = ordenacao_C_Lib.ordenar(vet2);
		System.out.println("\nVetor Ordenado");
		printVetor(vet2);
		
		System.out.print("VETOR EXERCÍCIO 3");
		System.out.println("\nVetor Desordenado");
		printVetor(vet3);
		vet3 = ordenacao_C_Lib.ordenar(vet3);
		System.out.println("\nVetor Ordenado");
		printVetor(vet3);
		
		
	}
	private static void printVetor(int[] vetor) {
		int length = vetor.length;
		for (int i = 0; i < length; i++) {
			System.out.printf("%d\t", vetor[i]);
		}
		System.out.println("");
		for (int i : vetor) {
			System.out.print("--------");
		}
		System.out.println("\n\n");

	}
}
