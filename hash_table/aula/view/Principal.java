package hash_table.aula.view;

import hash_table.aula.controller.Dicionario;
import hash_table.aula.model.Palavra;

public class Principal {
	public static void main(String[] args) {
		Palavra p0 = new Palavra();
		p0.verbete = "Vocábulo";
		p0.significado = "Significado de Vocábulo";
		Palavra p1 = new Palavra();
		p1.verbete = "Voz";
		p1.significado = "Significado de Voz";
		Palavra p2 = new Palavra();
		p2.verbete = "Palestra";
		p2.significado = "Significado de Palestra";
		Palavra p3 = new Palavra();
		p3.verbete = "Teclado";
		p3.significado = "Significado de Teclado";
		Palavra p4 = new Palavra();
		p4.verbete = "Tarefa";
		p4.significado = "Significado de Tarefa";
		Palavra p5 = new Palavra();
		p5.verbete = "Peculiar";
		p5.significado = "Significado de Peculiar";
		Palavra p6 = new Palavra();
		p6.verbete = "Fato";
		p6.significado = "Significado de Fato";
		
		Dicionario dicio = new Dicionario();
		dicio.adicionarPalavra(p0);
		dicio.adicionarPalavra(p1);
		dicio.adicionarPalavra(p2);
		dicio.adicionarPalavra(p3);
		dicio.adicionarPalavra(p4);
		dicio.adicionarPalavra(p5);
		dicio.adicionarPalavra(p6);
		
		Palavra px = new Palavra();
		px.verbete = "Palestra";
		try {
			px = dicio.buscarPalavra(px);
//			System.out.println(px.toString());
			
			dicio.removePalavra(px);
			
			String caracter = "t";
			dicio.listaPorCaracter(caracter);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
