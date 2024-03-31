package pilhas.lista_3.view;

import br.com.gustavoguimaraes.pilhas.PilhaInt;

public class InvertePilhaView {

	public static void main(String[] args) {
		PilhaInt pilhaInt = new PilhaInt();
		pilhaInt.push(1);
		pilhaInt.push(17);
		pilhaInt.push(20);
		pilhaInt.push(22);
		pilhaInt.push(25);
		pilhaInt.push(11);
		pilhaInt.push(39);
		pilhaInt.push(5);
		pilhaInt.push(15);
		pilhaInt.push(38);
		pilhaInt.push(26);
		pilhaInt.push(14);

		PilhaInt vet[] = new PilhaInt[pilhaInt.size()];

		try {
			int length = vet.length;
			for (int i = 0; i < length; i++) {
				vet[i] = new PilhaInt();
				vet[i].push(pilhaInt.pop());
			}
			for (PilhaInt v : vet) {
				pilhaInt.push(v.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}