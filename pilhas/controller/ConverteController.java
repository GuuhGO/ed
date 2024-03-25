package pilhas.controller;

import br.com.gustavoguimaraes.pilhas.PilhaInt;

public class ConverteController {
	public ConverteController() {
		super();
	}

	public String decToBin(int decimal) {
		PilhaInt pilhaInt = new PilhaInt();
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
