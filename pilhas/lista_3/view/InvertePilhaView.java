package pilhas.lista_3.view;

import datastructures.genericStack.Stack;

public class InvertePilhaView {

	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(1);
		intStack.push(17);
		intStack.push(20);
		intStack.push(22);
		intStack.push(25);
		intStack.push(11);
		intStack.push(39);
		intStack.push(5);
		intStack.push(15);
		intStack.push(38);
		intStack.push(26);
		intStack.push(14);

		Stack<Integer> vet[] = new Stack[intStack.size()];

		try {
			int length = vet.length;
			for (int i = 0; i < length; i++) {
				vet[i] = new Stack<>();
				vet[i].push(intStack.pop());
			}
			for (Stack<Integer> v : vet) {
				intStack.push(v.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}