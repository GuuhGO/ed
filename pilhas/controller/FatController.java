package pilhas.controller;

import br.com.gustavoguimaraes.pilhas.PilhaInt;

public class FatController {
	private PilhaInt pilhaInt = new PilhaInt();

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
