package ordenacao.controller;

import br.edu.fateczl.ordenacao.Ordenacao;

public class E04_Controller {
	public E04_Controller() {
		super();
	}
	public void ordenar(int vetor[], int option) {
		int length = vetor.length;
		int vetFinal[] = new int[length];
		Ordenacao ordenacao = new Ordenacao();
		System.out.printf("\nVetor Desordenado\n");
		for (int i : vetor) {
			System.out.printf("%d\t", i);
		}
		System.out.println("\n\n");
		switch (option) {
			case 1 :
				System.out.println("UTILIZANDO BUBBLE SORT");
				vetFinal = ordenacao.bubble_sort(vetor.clone());
				break;
			case 2 :
				System.out.println("UTILIZANDO MERGE SORT");
				vetFinal = ordenacao.merge_sort(vetor.clone(), 0, length - 1);
				break;
			case 3 :
				System.out.println("UTILIZANDO QUICK SORT");
				vetFinal = ordenacao.quickSort(vetor.clone(), 0, length - 1);
				break;
			default :
				System.out.println("Opção Inválida");
				return;
		}
		System.out.printf("\nVetor Ordenado\n");
		for (int i : vetFinal) {
			System.out.printf("%d\t", i);
		}
	}
}
