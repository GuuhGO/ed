package pilhas.lista_3.view;

import java.util.Scanner;
import datastructures.genericStack.Stack;
import pilhas.lista_3.controller.NPRController;

public class NPRView {
	static int n = 0;
	static StringBuffer screen = new StringBuffer();

	public static void main(String[] args) {
		boolean running = true;
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> intStack = new Stack<>();
		NPRController npr = new NPRController();

		do {
			System.out.print("> ");
			String input = scanner.nextLine();
			if ("+-*/".contains(input)) {
				try {
					int res = npr.npr(intStack, input);
					npr.insereValor(intStack, res);
					System.out.println("> " + res);
					printScreen(res, true);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				if (input.toUpperCase().equals("Q")) {
					running = false;
					break;
				}
				try {
					int intInput = Integer.parseInt(input);
					npr.insereValor(intStack, intInput);
					printScreen(intInput, false);
				} catch (NumberFormatException e) {
					System.out.printf("Cannot convert Number for string \"%s\"\n", input);
				}
			}

		} while (running);
		scanner.close();
		System.out.println("Execução Finalizada");
	}

	private static void printScreen(int valor, boolean overwrite) {
		n++;
		String line;
		if (overwrite) {
			n -= 2;
			line = String.format("%02d: %10d\n", n, valor);
			int scLength = screen.length();
			int lineLength = line.length();
			screen.delete(scLength - lineLength * 2, scLength);
			screen.append(line);
		} else {
			line = String.format("%02d: %10d\n", n, valor);
			screen.append(line);
		}
		System.out.print(screen);
	}
}