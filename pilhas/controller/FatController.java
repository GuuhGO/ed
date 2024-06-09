package pilhas.controller;

import datastructures.genericStack.Stack;

public class FatController {
	private Stack<Integer> pilhaInt = new Stack<>();

	public FatController() {
		super();
	}

	public int fatorial(int valor) {
		for (int i = valor; i > 0; i--) {
			if (pilhaInt.isEmpty()) {
				pilhaInt.push(i);
			} else {
				int top = pilhaInt.top();
				pilhaInt.push(i * top);
			}
		}
		return pilhaInt.top();
	}
}
