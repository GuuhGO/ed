package pilhas.model;

public class Pilha {
	No topo;

	public Pilha() {
		topo = null;
	}

	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		elemento.proximo = topo;
		topo = elemento;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}
