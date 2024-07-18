package br.ce.lobato.test;

import static br.ce.lobato.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import br.ce.lobato.core.BaseTest;
import br.ce.lobato.page.MenuPage;
import br.ce.lobato.page.ResumoPage;




public class ResumoTest extends BaseTest {
	
	ResumoPage resumoPage = new ResumoPage();
	MenuPage menuPage = new MenuPage();
	
	@Test
	public void removerMovimentação() {
	
		menuPage.acessarTelaResumoMensal();
		resumoPage.excluirMovimentação();
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemRemovidoComSucesso());
	
	}
	
	@Test
	public void ResumoMensal() {
		
		menuPage.acessarTelaResumoMensal();
		Assert.assertEquals(
				"Seu Barriga - Extrato", getDriver().getTitle());
		
		resumoPage.selecionarAno("2022");
		
		resumoPage.buscar();
		
		List<WebElement> elementosEncontrados =
				getDriver().findElements(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr"));
		Assert.assertEquals(0, elementosEncontrados.size());
		
		try {
			getDriver().findElement(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr"));
			Assert.fail();
		} catch (NoSuchElementException e) {
			
		}
		
	}
	
}
