package pilhas.lista_3.controller;

import br.com.gustavoguimaraes.pilhas.PilhaInt;

public class NPRController {

	public NPRController() {
		super();
	}

	public void insereValor(PilhaInt p, int valor) {
		p.push(valor);
	}

	public int npr(PilhaInt p, String op) throws Exception {
		int res = 0;
		if (p.size() >= 2) {
			switch (op) {
			case "+":
				res = p.pop() + p.pop();
				break;
			case "-":
				int t1 = p.pop();
				int t2 = p.pop();
				res = t2 - t1;
				break;
			case "*":
				res = p.pop() * p.pop();
				break;
			case "/":
				int deno = p.pop();
				int num = p.pop();
				res = num / deno;
				break;
			default:
				break;
			}
		} else {
			throw new Exception("Pilha com valores insuficientes");
		}
		return res;
	}
}
