package filas.aula.model;

public class Fila {
	private No inicio;
	private No fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;
	}

	public void insert(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) { // Fila vazia
			inicio = elemento;
			fim = inicio;
		} else { // Fila com 1+ elementos
			fim.proximo = elemento;
			fim = elemento;
		}
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia!!");
		}
		int valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		No aux = inicio;
		while (aux != null) {
			System.out.print(aux.dado + " ");
			aux = aux.proximo;
		}

	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No aux = inicio;
			while (aux != null) {
				cont = cont + 1;
				aux = aux.proximo;
			}
		}
		return cont;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		No aux = inicio;
		while (aux != null) {
			buffer.append(aux.toString());
			buffer.append(" -> ");
			aux = aux.proximo;
		}
		buffer.append("NULL");
		return buffer.toString();
	}
}
