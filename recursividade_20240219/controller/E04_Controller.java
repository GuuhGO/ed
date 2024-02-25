/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/
package ed.recursividade_20240219.controller;

public class E04_Controller {
	public E04_Controller() {
		super();
	}
	public int count_negative(int arr[], int len) {
		// CONDIÇÃO DE PARADA
		// Verifica se a variavel len (tamanho) é maior que 0, para garantir
		// que não estoure o índice do vetor durante as comparações com len - 1.
		if (len > 0) {
			// Se o valor atual for menor que zero incremental 1 à variável
			// negative para contar
			int negative = 0;
			if (arr[len - 1] < 0) {
				negative += 1;
			}
			// Faz a soma do valor de negative com o retorno da próxima chamada
			// da funão recursiva, para cada retorno o valor será somado ou com
			// 0 ou com 1 se acumulando até retornar a contagem total.
			return negative + count_negative(arr, len - 1);
		}
		return 0;
	}
}
