package pilhas.controller;

import datastructures.genericStack.Stack;

public class ConverterController {
	public ConverterController() {
		super();
	}

	public String decToBin(int decimal) {
		Stack<Integer> pilhaInt = new Stack<>();
		StringBuffer buffer = new StringBuffer();
		do {
			int resto = (int) decimal % 2;
			pilhaInt.push(resto);
			decimal /= 2;
		} while (decimal != 0);

		while (!pilhaInt.isEmpty()) {
			int valor;
			try {
				valor = pilhaInt.pop();
				buffer.append(valor);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return buffer.toString();
	}
}
