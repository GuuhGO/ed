/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor, retorne o menor
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/
package ed.recursividade_20240219.controller;
public class E02_Controller {
	public E02_Controller() {
		super();
	}
	public int menor_vet(int arr[], int len, int last) {
		int menor;
		menor = last;

		// CONDIÇÃO DE PARADA
		// Se len (tamanho) for igual a 0 significa que o vetor todo já foi
		// percorrido,
		// portanto deve-se retornar o último menor valor que foi informado.
		if (len == 0) {
			return menor;
		} else {
			// Verifica se o item atual é menor que o último menor valor registrado,
			// se for, substitui o último menor valor pelo valor atual.
			if (arr[len - 1] < menor) {
				menor = arr[len - 1];
			}
			// Chama a função subtraindo 1 de len (tamanho) para analisar o próximo
			// item à esquerda.
			return menor_vet(arr, len - 1, menor);
		}
	}

}
