/*5. Considere a série de Fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
Entrada limitada a 20 (Condição que deve ser testada na Main da aplicação).
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/

package recursividade_lista_3.controller;

public class E05_Controller {
	public E05_Controller() {
		super();
	}
	public int fibonacci(int n) {
		// CONDIÇÃO DE PARADA
		// Se n for > 2 então deve-se relizar a chamada dos passos
		// que consistem em somar os retornos da função recebendo n-1
		// e n-2...
		
		if (n > 2)
			// Faz a chamada, tendo como retorno da última chamada o valor 1
			// resultando no retorno de 1 + 1 = 2. Iniciando a sequência de
			// retornos da pilha de funções até chegar no valor passado na
			// primeira chamada.
			return fibonacci(n - 1) + fibonacci(n - 2);
		// Quando a função receber n = 2 ou n = 1 irá retornar 1 que é 
		// o valor dos dois primeiros valores da série de Fibonacci.
		return 1;
	}
}
