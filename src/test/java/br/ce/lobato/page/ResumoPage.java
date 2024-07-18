package br.ce.lobato.page;

import org.openqa.selenium.By;

import br.ce.lobato.core.BasePage;

public class ResumoPage extends BasePage {
	
	public void excluirMovimentação() {
		clicarBotao(By.xpath(".//span[@class=\"glyphicon glyphicon-remove-circle\"]"));
	}

	public String obterMensagemRemovidoComSucesso() {
		
		return pegarTexto(By.xpath(".//div[@class='alert alert-success']"));
		
	}
	
	public void selecionarAno(String ano) {
		selecionarCombo("ano", ano);
	}
	
	public void buscar() {
		clicarBotao(By.xpath(".//input[@class='btn btn-primary']"));
	}
	
}
