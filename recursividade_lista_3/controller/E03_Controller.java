/*3. Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
(Ex.: entrada = teste ; saída = etset):
Deve se u�lizar a função SUBSTRING da Java
O código deve trazer como comentários:
• A condição de parada
• Como escrever a função para o termo n em função do termo anterior*/
package recursividade_lista_3.controller;

public class E03_Controller {
	public E03_Controller() {
		super();
	}
	public StringBuffer inverterString(StringBuffer inValue, int start, int end) {

		StringBuffer localBuffer = new StringBuffer();
		// CONDIÇÃO DE PARADA
		// Enquanto o valor de start for maior ou igual a zero irá fazer um
		// append
		// do buffer do caracter na posição iniciando em start e terminando em
		// end
		// considerando que start é o valor de end - 1.
		if (start >= 0) {
			localBuffer.append(inValue.substring(start, end));

			// Faço o append do buffer local com o retorno da próxima chamada
			// que, recursivamente irá se acumular com o conteúdo da string
			// invertido.
			return localBuffer.append(inverterString(inValue, start - 1, end - 1));
		}
		// Retorno o localBuffer que irá possuir o primeiro caractere da string
		// original
		return localBuffer;
	}
}