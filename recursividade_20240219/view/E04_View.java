/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/
package recursividade_20240219.view;

import recursividade_20240219.controller.E04_Controller;

public class E04_View {
	public static void main(String[] args) {
		E04_Controller countNgtv = new E04_Controller();
		int vet[] = {0, 1, 2, -3, 4, -5, -6, 7, 8, 9};
		int length = vet.length;
		int count = countNgtv.count_negative(vet, length);
		System.out.printf("Quantidade de itens negativos: %d", count);
	}
}