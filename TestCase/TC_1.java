import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\OswaldoArana\\workspace\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				String url="https://es.wikipedia.org/wiki/Wikipedia:Portada";
				WikipediaMain wiki=new WikipediaMain();
				
				driver.navigate().to(url);
				driver.manage().window().maximize();
				wiki.getObj_verCodigo(driver).click();

				
				Thread.sleep(3000);
				wiki.getPopUp_Editar(driver).click();
				
				String t=wiki.getTxt_codigoFuente(driver).getText();			
			
			System.out.println(t);
			Thread.sleep(2000);
			wiki.getTxt_verHistorial(driver).click();
			//				driver.quit();
	}

}
