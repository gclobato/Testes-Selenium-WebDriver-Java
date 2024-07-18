package br.ce.lobato.page;

import br.ce.lobato.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaAdicionarConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaCriarMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumoMensal() {
		clicarLink("Resumo Mensal");
	}
	public void acessarTelaInicial() {
		clicarLink("Home");
	}
}
