package br.nd.todomvc.steps;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InserirItem {
	private WebDriver driver;
		
	@Dado("que acesso a aplicação")
	public void queAcessoAAplicação() {
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\017145631\\Downloads\\program install\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://todomvc.com/examples/vue/");
	}
	
	@Dado("preencho o campo com {string}")
	public void preenchoOCampoCom(String itens) {
		driver.findElement(By.className("new-todo")).sendKeys(itens);
		
	}
	
	@Quando("aciono o botão enter")
	public void acionoOBotãoEnter() {
		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
	   
	}
	
	@Entao("o {string} é exibido na listagem")
	public void oÉExibidoNaListagem(String itens) {
		String campo = driver.findElement(By.className("view")).getText();
		Assert.assertEquals(campo , itens);
	}

	@After
	public void fecharBrowser() {
		driver.quit();
	}
}
