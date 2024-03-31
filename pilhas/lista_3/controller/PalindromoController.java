package pilhas.lista_3.controller;

import br.com.gustavoguimaraes.pilhas.PilhaString;

public class PalindromoController {

	private PilhaString pilhaStr = new PilhaString();

	public PalindromoController() {
		super();
	}

	public String invertePalavra(String input) {
		String str[] = input.split("");

		for (String c : str) {
			pilhaStr.push(c);
		}
		StringBuffer buffer = new StringBuffer();
		try {
			while (!pilhaStr.isEmpty()) {
				buffer.append(pilhaStr.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}

	public boolean comparaPalavras(String original, String reversed) {
		boolean isPalindrome = original.equals(reversed);
		return isPalindrome;
	}
}