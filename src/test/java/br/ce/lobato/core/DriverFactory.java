package br.ce.lobato.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverFactory {

	private static WebDriver driver;
	
	//private DriverFactory() {};
	
	private static ThreadLocal<WebDriver> threadDriver	= new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			return initDriver();
		}
	};
	public static WebDriver getDriver() {
		return threadDriver.get();
	}
	
	public static WebDriver initDriver() {
		WebDriver driver = null;
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		
		return driver;
	};
	
	public static void killDriver() {
		WebDriver driver = getDriver();
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
		if(threadDriver!=null) {
			threadDriver.remove();
		}
	};
}
