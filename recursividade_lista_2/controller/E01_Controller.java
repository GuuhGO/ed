/*1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
mul�plicação de A por B.*/
package recursividade_lista_2.controller;

public class E01_Controller {
	public E01_Controller() {
		super();
	}
	
	public int mult_by_sum(int fator1, int fator2) {
		if (fator2 == 0) {
			return 0;
		} else {
			return fator1 + mult_by_sum(fator1, fator2 - 1);
		}
	}
}
