package ordenacao.controller;

import br.edu.fateczl.ordenacao.Ordenacao;

public class E05_Controller {
	public E05_Controller() {
		super();
	}
	public int[] ordenar(int vetor[]) {
		int length = vetor.length;
		int vetFinal[] = new int[length];
		Ordenacao ordenacao = new Ordenacao();
		vetFinal = ordenacao.quickSort(vetor.clone(), 0, length - 1);
		return vetFinal;
	}
}
