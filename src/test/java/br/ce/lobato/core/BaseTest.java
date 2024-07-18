
package br.ce.lobato.core;

import static br.ce.lobato.core.DriverFactory.getDriver;
import static br.ce.lobato.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import br.ce.lobato.page.LoginPage;

public class BaseTest {
	public LoginPage loginPage = new LoginPage();
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializar() {
		loginPage.acessarTelaLogin();
		loginPage.setEmail("emailParaTeste@mail.com");
		loginPage.setSenha("123456");
		loginPage.entrar();
	}
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		Files.copy(arquivo, new File("imagens" + File.separator + "screenshot/" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}






