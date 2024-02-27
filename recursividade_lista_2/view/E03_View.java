/*3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de
números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
diferentes de zero.*/
package recursividade_lista_2.view;

import recursividade_lista_2.controller.E03_Controller;

public class E03_View {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 6, 8, 1};
		int length = vetor.length;
		boolean isValid = true;
		E03_Controller countEven = new E03_Controller();
		for (int i : vetor) {
			if (i <= 0) {
				isValid = false;
				break;
			}
		}
		if (isValid) {
			int result = countEven.count_even(vetor, length);
			System.out.printf("O vetor possui %d números pares", result);
		} else {
			System.out.print("O vetor possui valores menores ou iguais a zero, o programa será encerrado");
		}
	}

}
