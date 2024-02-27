/*5. O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou
mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a
fatoração por meio da decomposição em fatores primos dos números indicados.
Para exemplificar, vamos calcular através da fatoração o MDC do 20 e 24:
Para saber o MDC dos números, devemos olhar à direita da fatoração e ver quais números dividiram,
simultaneamente, nas duas colunas e mul�plicá-los.
Assim, pela fatoração podemos concluir que o 4 (2 x 2) é o maior número que divide ambos e, portanto,
é o máximo divisor comum de 20 e 24.

O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma
definição recursiva:
• MDC(x, y) = MDC(x − y, y), se x > y
• MDC(x,y) = MDC(y,x)
• MDC(x,x) = x

Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.
*/
package recursividade_lista_2.view;

import java.util.Scanner;

import recursividade_lista_2.controller.E05_Controller;

public class E05_View {
	public static void main(String[] args) {
		E05_Controller calcMDC = new E05_Controller();
		Scanner scanner = new Scanner(System.in);

		int valor1;
		int valor2;
		boolean valid = false;
		do {
			System.out.print("Informe o primeiro valor: ");
			valor1 = scanner.nextInt();
			System.out.print("Informe o segundo valor: ");
			valor2 = scanner.nextInt();
			if (valor1 > 0 && valor2 > 0)
				valid = true;
			else
				System.out.println("Entradas inválidas, insira valores inteiros positivos.");
		} while (!valid);

		scanner.close();

		int resultado = calcMDC.calc_mdc(valor1, valor2);
		System.out.printf("O MDC de %d e %d é %d", valor1, valor2, resultado);
	}
}
