/*2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
subtrações, exiba o resto da divisão.*/
package recursividade_lista_2.controller;

public class E02_Controller {
	public E02_Controller() {
		super();
	}
	public int div_by_sub(int dividendo, int divisor) {
		if (dividendo < divisor) {
			System.out.printf("O resto é %d\n", dividendo);
			return 0;
		} else {
			return 1 + div_by_sub(dividendo - divisor, divisor);
		}
	}
}