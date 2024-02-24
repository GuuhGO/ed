package ed.recursividade_20240221.view;

import java.util.Scanner;

import ed.recursividade_20240221.controller.E03_Controller;

public class E03_View {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Informe um valor (limite 12): ");
		int value = scan.nextInt();
		scan.close();
		E03_Controller fat_con = new E03_Controller();
		int res = fat_con.func_fat(value);
		System.out.printf("Resultado = %d", res);
	}
}
