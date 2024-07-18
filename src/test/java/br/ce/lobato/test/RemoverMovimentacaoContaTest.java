package br.ce.lobato.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.lobato.core.BaseTest;
import br.ce.lobato.page.ContasPage;
import br.ce.lobato.page.MenuPage;


public class RemoverMovimentacaoContaTest extends BaseTest {
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	
	@Test
	public void removerContaComMovimentação() {
	
		menuPage.acessarTelaListarConta();
		
		contasPage.pegarTextoTabela("tabelaContas");
		
		contasPage.clicarRemoverConta("Conta com movimentacao");
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMenssagemCadastradoSemSucesso());
	
	}
}
