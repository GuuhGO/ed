/*4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
duplo de 5 é:
5!! = 1*3*5 = 15
*/
package recursividade_lista_2.controller;

public class E04_Controller {
	public E04_Controller() {
		super();
	}
	public int double_fat(int N) {
		if (N > 1) {
			return N * double_fat(N - 2);
		}
		return 1; 
	}
}
