package lista_encadeada.aula;

import lista_encadeada.aula.model.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<String> l = new List<>();
		boolean vazia = l.isEmpty();
		System.out.println(vazia);
		int size = l.size();
		System.out.println("Tamanho: " + size);
		String valor = l.get(0);
		l.addFirst("C");
		l.addFirst("B");
		l.addFirst("A");
		l.addLast("D");
		l.add("Y", 0);
		l.add("X", 2);
		size = l.size();
		System.out.println("Tamanho: " + size);
		valor = l.get(0);
		System.out.println(valor);
		l.add("K", 10);
		l.add("Z", 6);
		l.removeFirst();
		valor = l.get(0);
		System.out.println(valor);
		l.removeLast();
		size = l.size();
		valor = l.get(size - 1);
		System.out.println(valor);
		l.remove(1);
		size = l.size();
		System.out.println(l.toString());
	}
}
