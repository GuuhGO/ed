package ordenacao.controller;

import br.edu.fateczl.ordenacao.Ordenacao;

public class E06_Controller {
	public E06_Controller() {
		super();
	}
	public int[] ordenar(int vetor[]) {
		int length = vetor.length;
		int vetFinal[] = new int[length];
		Ordenacao ordenacao = new Ordenacao();
		double start_time;
		double end_time;
		double total_time;

		System.out.print("QUICK SORT: ");
		start_time = (double) System.nanoTime();
		vetFinal = ordenacao.quickSort(vetor.clone(), 0, length - 1);
		end_time = (double) System.nanoTime();
		total_time = end_time - start_time;
		System.out.printf("%f segundos\n", (total_time / Math.pow(10, 9)));

		System.out.print("MERGE SORT: ");
		start_time = (double) System.nanoTime();
		vetFinal = ordenacao.merge_sort(vetor.clone(), 0, length - 1);
		end_time = (double) System.nanoTime();
		total_time = end_time - start_time;
		System.out.printf("%f segundos\n", (total_time / Math.pow(10, 9)));

		System.out.print("BUBBLE SORT: ");
		start_time = (double) System.nanoTime();
		vetFinal = ordenacao.bubble_sort(vetor.clone());
		end_time = (double) System.nanoTime();
		total_time = end_time - start_time;
		System.out.printf("%f segundos\n", (total_time / Math.pow(10, 9)));

		System.out.println();

		return vetFinal;
	}

}
