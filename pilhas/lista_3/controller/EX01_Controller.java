package pilhas.lista_3.controller;

import datastructures.genericStack.Stack;

public class EX01_Controller {
	private Stack<Integer> pilhaInt = new Stack<>();

	public EX01_Controller() {
		super();
	}

	public int iterar(int vet[]) {
		for (int value : vet) {
			if (value >= 0) {
				pilhaInt.push(value);
			} else {
				try {
					int soma = pilhaInt.pop() + pilhaInt.pop();
					pilhaInt.push(value);
					pilhaInt.push(soma);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return pilhaInt.size();
	}
}
