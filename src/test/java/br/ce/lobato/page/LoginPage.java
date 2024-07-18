package br.ce.lobato.page;

import org.openqa.selenium.By;

import br.ce.lobato.core.BasePage;
import br.ce.lobato.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaLogin() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("/html/body/div[2]/form/button"));
		
	}
	public void resetarMassa() {
		clicarLink("reset");
	}
	
}
