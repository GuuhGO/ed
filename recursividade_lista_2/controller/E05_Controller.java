/*
5. O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou
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
package recursividade_lista_2.controller;

public class E05_Controller {
	public E05_Controller() {
		super();
	}

	public int calc_mdc(int x, int y) {
		if (x > y) {
			return calc_mdc(x - y, y);
		} else if (x < y) {
			return calc_mdc(y, x);
		} else {
			return x;
		}
	}
}