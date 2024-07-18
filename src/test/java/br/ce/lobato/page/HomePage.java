package br.ce.lobato.page;

import br.ce.lobato.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldoDaConta(String conta) {
		return obterCelula("Conta", conta, "Saldo", "tabelaSaldo").getText();
	}
}
