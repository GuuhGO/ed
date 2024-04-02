package filas.aula.view;

import filas.aula.model.Fila;

public class Principal {

	public static void main(String[] args) {
		ex1();
	}

	public static void aula() {
		Fila fila = new Fila();
		try {
			fila.insert(1);
			fila.insert(2);
			fila.insert(10);
			fila.insert(4);
			fila.insert(50);
			fila.insert(12);
//			System.out.println(fila.toString());
			int v = fila.remove();
			System.out.printf("\nValor removido %d\n\n", v);
			fila.list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		System.out.println(fila.toString());
	}

	public static void ex1() {
		try {
			Fila f = new Fila();
			for (int i = 0; i < 20; i++) {
				if (f.isEmpty()) {
					f.insert(i + i);
				} else if (i % 2 == 0 && f.size() == 2) {
					int dado1 = f.remove();
					int dado2 = f.remove();
					int dado3 = dado1 + dado2;
					f.insert(dado3);
				} else {
					f.insert(i + 2);
				}
				System.out.println(f.size());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void ex2() {
		int[] vetor = { 98, 32, 44, 17, 1, 10, 72, 35, 99, 27, 0, 14, 54 };
		Fila f = new Fila();
		try {
			for (int i : vetor) {
				if (f.isEmpty()) {
					f.insert(i);
				} else if (f.size() == 4) {
					f.insert(i * 10);
				} else if (f.size() > 5) {
					f.insert(i * 5);
				} else {
					int valor = f.remove();
					System.out.println(valor - 10);
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());

		}
	}
}
