package pilhas.lista_3.controller;

import br.com.gustavoguimaraes.pilhas.PilhaString;

public class HistoricoController {
	public HistoricoController() {
		super();
	}

	public void inserirEndereco(PilhaString p, String url) {
		boolean valid = validarUrl(url);
		if (valid) {
			p.push(url);
		}
	}

	public String removerEndereco(PilhaString p) throws Exception {
		String str = p.pop();
		return str;
	}

	public String consultarEndereco(PilhaString p) throws Exception {
		String str = p.top();
		if (str == null)
			throw new Exception("Histórico Vazio");
		return str;
	}

	private boolean validarUrl(String url) {
		boolean urlStart = url.startsWith("https://www");
		boolean urlEnd = url.endsWith(".com") || url.endsWith(".co.uk") || url.endsWith(".com.br");
		if (urlStart && urlEnd) {
			return true;
		} else if (!urlStart) {
			System.out.println("ENDEREÇO DEVE INICIAR COM \"https://www\"!");
		} else if (!urlEnd) {
			System.out.println("ENDEREÇO DEVE TERMINAR COM \".com\", \".co.uk\" ou \".com.br\"");
		}
		return false;
	}

}
