package br.ce.lobato.test;


import org.junit.Assert;
import org.junit.Test;

import br.ce.lobato.core.BaseTest;
import br.ce.lobato.page.ContasPage;
import br.ce.lobato.page.MenuPage;



public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void inserirConta() {
		
		menuPage.acessarTelaAdicionarConta();
		contasPage.setNome("Conta teste 1");
		contasPage.salvarConta();
		
	
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMenssagemCadastradoComSucesso());

	}
	
	@Test
	public void alterarConta() {
	
		menuPage.acessarTelaListarConta();
		contasPage.pegarTextoTabela("tabelaContas");
		contasPage.clicarAlterarConta("Conta para alterar");
		contasPage.setNome("Conta alterada");
		contasPage.salvarConta();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMenssagemCadastradoComSucesso());
		
	}
	
	@Test
	public void inserirContaComMesmoNome() {
		
		menuPage.acessarTelaAdicionarConta();
		contasPage.setNome("Conta mesmo nome");
		contasPage.salvarConta();
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMenssagemCadastradoSemSucesso());
	
	}
	
}
