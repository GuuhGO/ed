package ordenacao.controller;

public class Ordenacao_Controller {
	public Ordenacao_Controller() {
		super();
	}
	public int[] bubble_sort(int vet[]) {
		int tamanho = vet.length;

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("%dª iteração: ", i + 1);
			for (int j = 0; j < tamanho - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
			for (int val : vet) {
				System.out.printf("%d ", val);
			}
			System.out.println();
		}

		return vet;
	}

	public int[] merge_sort(int vet[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge_sort(vet, inicio, meio);
			merge_sort(vet, meio + 1, fim);
			intercala(vet, inicio, meio, fim);
		}
		return vet;
	}

	private void intercala(int[] vet, int inicio, int meio, int fim) {
		int vetAux[] = new int[vet.length];
		for (int i = inicio; i <= fim; i++) {
			vetAux[i] = vet[i];
		}
		System.out.println("");

		int k = 0;
		for (int val : vetAux) {
			System.out.printf("%2d\t", val);
		}
		System.out.println("");
		for (int val : vetAux) {
			System.out.printf("%2d\t", k);
			k++;
		}
		k = 0;

		System.out.println();
		for (int i : vetAux) {
			System.out.print("--------");
		}
		System.out.println();
		int esq = inicio;
		int dir = meio + 1;
		for (int cont = inicio; cont <= fim; cont++) {
			if (esq > meio) {
				vet[cont] = vetAux[dir];
				dir++;
			} else if (dir > fim) {
				vet[cont] = vetAux[esq];
				esq++;
			} else if (vetAux[esq] < vetAux[dir]) {
				vet[cont] = vetAux[esq];
				esq++;
			} else {
				vet[cont] = vetAux[dir];
				dir++;
			}
		}

	}

	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivoFixado = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixado - 1);
			quickSort(vetor, posicaoPivoFixado + 1, fim);
		}
		return vetor;
	}

	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[inicio];
		while (ponteiroEsquerda <= ponteiroDireita) {
			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
