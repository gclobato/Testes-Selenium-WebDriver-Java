package br.ce.lobato.page;

import org.openqa.selenium.By;

import br.ce.lobato.core.BasePage;

public class ContasPage extends BasePage {
	
	private String tabString;

	public void setNome(String nome) {
		escreverBy(By.id("nome"), nome);
	
	}
	
	public void salvarConta() {
		clicarBotaoPorTexto("Salvar");
	}	
	
	public String obterMenssagemCadastradoComSucesso() {
		return pegarTexto(By.xpath(".//div[@class='alert alert-success']"));
	}
	
	public String obterMenssagemCadastradoSemSucesso() {
		return pegarTexto(By.xpath(".//div[@class='alert alert-danger']"));
	}
	public String pegarTextoTabela(String id) {
		tabString = pegarTexto(By.id(id));
		System.out.println(tabString);
		return tabString;
	}
	
	public void clicarAlterarConta(String conta) {
		obterCelula("Conta", conta, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
		
	}	
	
	public void clicarRemoverConta(String conta) {
		obterCelula("Conta", conta, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
		
	}
	
	
	
}
