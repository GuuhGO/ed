package recursividade_lista_3.controller;

public class E01_Controller {
	public E01_Controller() {
		super();
	}
	public int conta_digitos(int num) {
		if (num > 0) {
			// Se o valor da divisão for maior do que 0 faz a chamada recursiva
			// dividindo por 10 para reduzir um dígito
			return 1 + conta_digitos(num / 10);
		}
		// CONDIÇÃO DE PARADA
		// Se o valor da divisão por 10 resultar em 0 então retorna 0
		return 0;
	}
}
