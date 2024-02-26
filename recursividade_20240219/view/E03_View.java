/*3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/

package recursividade_20240219.view;

import java.util.Scanner;

import recursividade_20240219.controller.E03_Controller;

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
