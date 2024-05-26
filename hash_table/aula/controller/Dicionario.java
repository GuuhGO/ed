package hash_table.aula.controller;


import br.edu.fateczl.lista.listaObj.Lista;

import hash_table.aula.model.Palavra;

public class Dicionario {
	
	Lista[] tabelaHashDicionario;
	public Dicionario() {
		tabelaHashDicionario = new Lista[26];
		inicializarTabelaHash();
	}
	private void inicializarTabelaHash() {
		int tamanho = tabelaHashDicionario.length;
		for (int i = 0; i < tamanho; i++) {
			tabelaHashDicionario[i] = new Lista();
		}
	}
	
	public void adicionarPalavra(Palavra palavra) {
		int posicao = palavra.hashCode();
		tabelaHashDicionario[posicao].addFirst(palavra);
	}
	
	public Palavra buscarPalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanho = tabelaHashDicionario[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Palavra p = (Palavra) tabelaHashDicionario[posicao].get(i);
			if (p.verbete.equals(palavra.verbete)) {
				palavra.significado = p.significado;
				break;
			}
		}
		if (palavra.significado == null) {
			throw new Exception("Verbete não encontrado");
		}
		return palavra;
	}
	
	public void removePalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanho = tabelaHashDicionario[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Palavra p = (Palavra) tabelaHashDicionario[posicao].get(i);
			if (p.verbete.equals(palavra.verbete)) {
				tabelaHashDicionario[posicao].remove(i);
				break;
			}
		}
	}
	
	public void listaPorCaracter(String caracter) throws Exception {
		int posicao = hashCaracter(caracter);
		int tamanho = tabelaHashDicionario[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Palavra p = (Palavra) tabelaHashDicionario[posicao].get(i);
			System.out.println(p.toString());
		}
	}
	
	private int hashCaracter(String caracter) {
		int posicao = caracter.toLowerCase().charAt(0);
		posicao = posicao - 97;
		return posicao;
	}
}
