package arvore.aula;

import arvore.aula.model.TreeInt;

public class Main {

	public static void main(String[] args) {
		try {
//			int vetor[] = { 108, 130, 127, 10, 0, 13, 131, 184, 26, 2, 14, 158, 144, 69, 79, 111 };
			int vetor[] = { 27, 68, 60, 28, 191, 3, 21, 130, 121, 66, 16, 48, 9, 190, 146, 160, 24, 182, 26, 0 };
			
			int[] vetor1 = {15, 6, 23, 4, 7, 71, 5, 13, 21, 9, 19, 30, 27, 20, 25, 17, 2, 11, 1, 14};
	        int[] vetor2 = {8, 3, 10, 1, 6, 14, 4, 13, 7, 12, 9, 11, 2, 5, 15, 17, 20, 19, 18, 16};
	        int[] vetor3 = {20, 10, 30, 5, 15, 25, 35, 2, 7, 12, 18, 22, 27, 32, 37, 1, 3, 6, 8, 28};
	        int[] vetor4 = {12, 7, 18, 5, 9, 17, 20, 3, 8, 10, 11, 14, 19, 21, 2, 4, 6, 13, 16, 15};
	        int[] vetor5 = {25, 15, 50, 10, 22, 35, 70, 5, 12, 17, 18, 24, 30, 40, 60, 75, 2, 8, 27, 33};
	        
			TreeInt treeInt = new TreeInt();
			for (int i : vetor) {
				treeInt.insert(i);
			}
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
		} catch (Exception e) {
			System.out.println();
		}
	}

}
