package ordenacao.view;

import ordenacao.controller.E06_Controller;

public class E06_View {

	public static void main(String[] args) {
		int vet1[] = new int[1500];
		int length = vet1.length;
		for (int i = 0; i < length; i++) {
			vet1[i] = length - 1 - i;
		}
		printVetor(vet1);
		E06_Controller ordenacao_lib = new E06_Controller();
		vet1 = ordenacao_lib.ordenar(vet1);
		printVetor(vet1);
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
		System.out.println("\n");

	}
}
