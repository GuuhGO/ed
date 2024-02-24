package ed.recursividade_20240221.controller;

public class E03_Controller {

	public E03_Controller() {
		super();
	}
	public int func_fat(int n) {
		// Controle para prevenir estouro de memória limitando a entrada
		// para até 12
		if (n > 12)
			n = 12;
		
		// CONDIÇÃO DE PARADA
		// Se o valor for maior do que 1, executa a chamada recursiva normalmente
		// Senão retorna 1
		if (n > 1) {
			// Multiplica o valor de N pelo retorno da função recebendo
			// N - 1, portanto multiplica pelo seu valor antecessor.
			return n * func_fat(n - 1);
		}
		return 1;
	}
}
