/*1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/
package recursividade_20240219.controller;

public class E01_Controller {
	public E01_Controller() {
		super();
	}


	public int soma(int val) {
//		Condicional para validar se a soma chegou ao fim ou
//		se foi fornecido um arquivo negativo
		if (val <= 0)
			return 0;
		else {
//			Soma o valor atual do número natural atual (val) com o
//			próprio valor subtraindo 1
			return val + soma(val -1);
		}
	}
}
