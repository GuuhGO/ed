package pilhas.lista_3.view;

import java.util.Scanner;

import br.com.gustavoguimaraes.pilhas.PilhaString;
import pilhas.lista_3.controller.HistoricoController;

public class HistoricoVIew {

	public static void main(String[] args) {
		PilhaString pilhaString = new PilhaString();
		HistoricoController hist = new HistoricoController();
		Scanner scanner = new Scanner(System.in);
		String url;
		int opt = 0;
		boolean running = true;
		do {
			String menu = "O QUE DESEJA FAZER?" + "\n1 - Inserir endereço no histórico"
					+ "\n2 - Remover o último endereço" + "\n3 - Consultar o último endereço" + "\n4 - Sair" + "\n>> ";
			System.out.print(menu);
			String input = scanner.nextLine();
			try {
				opt = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.printf("Não é possível converter a string %s\n", input);
			}

			switch (opt) {
			case 1:
				System.out.print("\nInsira o endereço: ");
				url = scanner.nextLine();
				hist.inserirEndereco(pilhaString, url);
				System.out.printf("Endereço %s adicionado ao histórico\n", url);
				break;
			case 2:
				try {
					url = hist.removerEndereco(pilhaString);
					System.out.printf("Endereço %s removido do histórico\n", url);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					url = hist.consultarEndereco(pilhaString);
					System.out.printf("Último enderço do histórico é %s\n", url);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				running = false;
				break;
			default:
				System.out.println("ENTRADA INVÁLIDA");
				break;
			}
		} while (running);
		scanner.close();
	}
}