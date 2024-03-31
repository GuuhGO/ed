package pilhas.lista_3.view;

import pilhas.lista_3.controller.EX01_Controller;

public class EX01_View {
	public static void main(String[] args) {
		EX01_Controller e01 = new EX01_Controller();
		int vetor[] = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		int totalElementosPilha = e01.iterar(vetor);
		System.out.printf("A pilha possui %d elementos\n", totalElementosPilha);
	}
}
