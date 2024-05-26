package pilhas.view;

import br.com.gustavoguimaraes.pilhas.PilhaInt;

public class Fibonacci {
	public static void main(String[] args) throws Exception {
		PilhaInt pilhaInt = new PilhaInt();
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
