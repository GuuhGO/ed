package arvore.aula;

import arvore.aula.model.TreeInt;

public class Main {

	public static void main(String[] args) {
		try {
//			int vetor[] = { 108, 130, 127, 10, 0, 13, 131, 184, 26, 2, 14, 158, 144, 69, 79, 111 };
			int vetor[] = { 27, 68, 60, 28, 191, 3, 21, 130, 121, 66, 16, 48, 9, 190, 146, 160, 24, 182, 26, 0 };
			TreeInt treeInt = new TreeInt();
			treeInt.insert(2);
			treeInt.insert(1);
			treeInt.insert(3);
			treeInt.insert(4);
//			treeInt.insert(2);
//			treeInt.insert(5);
//			for (int i : vetor) {
//				treeInt.insert(i);
//			}
//			System.out.println("Level: " + treeInt.level());
			
			System.out.print("Prefixa (Pré-Ordem): ");
			treeInt.prefixSearch();
			System.out.println();
			System.out.print("Infixa (Ordem): ");
			treeInt.infixSearch();
			System.out.println();
			System.out.print("Posfixa (Pós-Ordem): ");
			treeInt.postfixSearch();
			System.out.println();
			System.out.println("Level: " + treeInt.level());
			System.out.println();
			treeInt.search(144);
			treeInt.search(182);
		} catch (Exception e) {
			System.out.println();
		}
	}

}
