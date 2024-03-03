/*3. Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
(Ex.: entrada = teste ; saída = etset):
Deve se utlizar a função SUBSTRING da Java
O código deve trazer como comentários:
• A condição de parada
• Como escrever a função para o termo n em função do termo anterior*/
package recursividade_lista_3.view;

import java.util.Scanner;

import recursividade_lista_3.controller.E03_Controller;

public class E03_View {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com uma string qualquer: ");
		StringBuffer inputValue = new StringBuffer(scanner.nextLine());
		E03_Controller e03 = new E03_Controller();
		int lastChar = inputValue.length();
		StringBuffer auxStr = new StringBuffer(e03.inverterString(inputValue, lastChar - 1, lastChar));
		System.out.printf("String invertida: %s", auxStr);
		scanner.close();
	}
}
