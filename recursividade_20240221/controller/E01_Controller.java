package ed.recursividade_20240221.controller;

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
