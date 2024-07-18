package br.ce.lobato.page;

import static br.ce.lobato.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.ce.lobato.core.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setDataMovimentacao(String dataMov) {
		escrever("data_transacao", dataMov);
	}
	
	public void setDataPagamento(String dataPay) {
		escrever("data_pagamento", dataPay);
	}
	
	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
	}
	
	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
	}
	public void setValor(String valor) {
		escrever("valor", valor);
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void setSituacaoPago() {
		clicarRadio("status_pago");
	}
	
	public void setSituacaoPendente() {
		clicarRadio("status_pendente");
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}
	
	public String obterMenssagemCadastradoComSucesso() {
		return pegarTexto(By.xpath("/html/body/div[1]"));
	}
	
	public List<String> obterTextoErros(){
		
		List<WebElement> msgErros = getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));
		
		List<String> retorno = new ArrayList<String>();
		
		for(WebElement erro: msgErros){
			retorno.add(erro.getText());
		}
		
		return retorno;
	}
	
}
