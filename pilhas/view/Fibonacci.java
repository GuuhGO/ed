package pilhas.view;

import datastructures.genericStack.Stack;

public class Fibonacci {
	public static void main(String[] args) throws Exception {
		Stack<Integer> pilhaInt = new Stack<>();
		while (pilhaInt.top() != 55) {
			if (pilhaInt.isEmpty()) {
				pilhaInt.push(1);
				pilhaInt.push(1);
			} else {
				int a = pilhaInt.pop();
				pilhaInt.push(a);
			}
		}
	}
}
