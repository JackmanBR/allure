package P_relatorios.TESTE_ALLURE;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;


public class TesteAllure {
	
	@BeforeClass
	
	void Start() {
		
		Configuration.headless = false;	
		//Configuration.timeout = 7000;
		//Configuration.startMaximized = true;
		
				
	}	
	
	@Test(priority=1)
	public void Acessar() {
		
		open("https://www.google.com.br");
				
	}
	
	@Test(priority=2)
	public void search() {
		
		$(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).setValue("casa").pressEnter();
		
		System.out.println("pausa");
	}
	
	@Test(priority=3)
	public void click() {
		
		$(By.cssSelector("#hdtb-msb > div:nth-child(1) > div > div:nth-child(2) > a")).click();
		
	}
	
}

