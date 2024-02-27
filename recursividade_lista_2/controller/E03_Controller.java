/*3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de
números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
diferentes de zero.*/
package recursividade_lista_2.controller;

public class E03_Controller {
	public E03_Controller() {
		super();
	}

	public int count_even(int arr[], int len) {
		if (len == 0) {
			return 0;
		} else {
			if (arr[len - 1] % 2 == 0) {
				return 1 + count_even(arr, len - 1);
			} else {
				return 0 + count_even(arr, len - 1);
			}
		}
	}
}
