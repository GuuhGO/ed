package pilhas.view;

import java.io.PrintStream;

import pilhas.model.Pilha;

public class Principal {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		try {
			pilha.push(1);
			pilha.push(2);
			pilha.push(10);
			pilha.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
