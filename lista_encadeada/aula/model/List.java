package lista_encadeada.aula.model;

public class List<T> implements IList<T> {
	private Node<T> first;

	@Override
	public void addFirst(T t) throws Exception {
		if (isEmpty()) {
			first = new Node<>();
			first.data = t;
		} else {
			Node<T> aux = new Node<>();
			aux.data = t;
			aux.next = first;
			first = aux;
		}
	}

	@Override
	public void addLast(T t) throws Exception {
		if (isEmpty()) {
			addFirst(t);
		} else {
			Node<T> aux = new Node<>();
			aux.data = t;
			getNode(size() - 1).next = aux;
		}
	}

	@Override
	public void add(T t, int position) throws Exception {
		int size = size();
		if (position < 0 || position >= size) {
			throw new Exception("Posição inválida");
		}
		if (position == 0) {
			addFirst(t);
		} else if (position == size - 1) {
			addLast(t);
		} else {
			Node<T> anterior = getNode(position - 1);
			Node<T> elementos = new Node<>();
		}
	}

	@Override
	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia!");
		}
		first = first.next;
	}

	@Override
	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int size = size();
		if (size == 1) {
			removeFirst();
		} else {
			Node penultimate = getNode(size - 2);
			penultimate.next = null;
		}
	}

	@Override
	public void remove(int position) throws Exception {
		int size = size();
		if (position < 0 || position > size - 1) {
			throw new Exception("Posição Inválida");
		}
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		if (position == 0) {
			removeFirst();
		} else if (position == size - 1) {
			removeLast();
		} else {
			Node previous = getNode(position);
			Node current = getNode(position);
			previous.next = current.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public T get(int position) throws Exception {
		return getNode(position).data;

	}

	@Override
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			Node<T> aux = first;
			while (aux != null) {
				cont++;
				aux = aux.next;
			}
		}
		return cont;
	}

	private Node<T> getNode(int position) throws Exception {
		if (isEmpty())
			throw new Exception("Lista está vazia");
		int size = size();
		if (position < 0 || position > size - 1)
			throw new Exception("Posição inválida");
		int cont = 0;
		Node<T> aux = first;
		while (cont < position) {
			aux = aux.next;
			cont++;
		}
		return aux;
	}
}