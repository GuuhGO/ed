package pilhas.lista_3.controller;

import br.com.gustavoguimaraes.pilhas.PilhaString;

public class EX02_Controller {
	private String start[] = { "W", "L", "H", "B", "R", "G", "J" };

	private PilhaString pilha = new PilhaString();

	public EX02_Controller() {
		super();
		for (String val : start) {
			pilha.push(val);
		}
	}

	public void execute() {
		PilhaString pilhaAux = new PilhaString();

		try {
			while (!pilha.isEmpty()) {
				if (pilha.top() != "R" && pilha.top() != "W")
					pilhaAux.push(pilha.pop());
				else
					System.out.print(pilha.pop() + " ");
			}
			pilha.push(pilhaAux.pop());
			pilhaAux.pop();
			pilha.push(pilhaAux.pop());
			pilha.push("M");
			pilha.push(pilhaAux.pop());
			pilhaAux.pop();
			pilha.push("K");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}