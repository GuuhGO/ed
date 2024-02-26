/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor, retorne o menor
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/
package recursividade_20240219.view;

import recursividade_20240219.controller.E02_Controller;


public class E02_View {
	public static void main(String[] args) {
		int array[] = {-2, 20, 30, 40, 5, 60, 2, 1, 1, 100};
		int length = array.length;
		E02_Controller findLowest = new E02_Controller();
		int menor = findLowest.menor_vet(array, length, array[length - 1]);
		System.out.printf("Menor valor: %d", menor);
	}
}
