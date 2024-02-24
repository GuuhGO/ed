package ed.recursividade_20240221.view;

import java.util.Scanner;

import ed.recursividade_20240221.controller.E01_Controller;

/*1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/

public class E01_View {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número natural: ");
		int valor = Integer.parseInt(scan.next());
		scan.close();
		E01_Controller soma_nat = new E01_Controller();
		int resultado = soma_nat.soma(valor);
		System.out.printf("Resultado: %d", resultado);
	}
}
