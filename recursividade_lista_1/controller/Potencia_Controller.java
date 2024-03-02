package recursividade_lista_1.controller;


public class Potencia_Controller {
	public Potencia_Controller() {
		super();
	}
	
	public int potencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * potencia(base, expoente - 1);
		}
	}
}
