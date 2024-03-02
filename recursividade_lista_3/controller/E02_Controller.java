/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10
a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas
vezes o 2o número aparece no primeiro.
• Exemplo1: 1o. Número = 523578; 2o. Número = 5; retorno aparece 2 vezes
• Exemplo2: 1o. Número = 836363; 2o. Número = 3; retorno aparece 3 vezes
• A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
• O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada
dos passos;*/
package recursividade_lista_3.controller;

public class E02_Controller {
	public E02_Controller() {
		super();
	}
	public int count(int val1, int val2) {
		int resto = val1 % 10;
		// Enquanto o val1 for maior que 0 (após as divisões recursivas por 10)
		// realiza as chamadas recursivas da função.
		if (val1 > 0) {
			if (val2 == resto) {
				// Se o val2 for igual ao resto somará 1 com o retorno da próxima
				// chamada da função para incrementar a contagem
				return 1 + count(val1 / 10, val2);
			} else {
				// Se o val2 for diferente do resto somará 0 com o retorno, não 
				// alterando o valor original.
				return 0 + count(val1 / 10, val2);
			}
		}
		// CONDIÇÃO DE PARADA		
		// Se o val1 chegar a 0 retorna 0
		return 0;
	}
}
