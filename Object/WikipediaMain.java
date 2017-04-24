import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaMain {

	public WebElement getObj_verCodigo(WebDriver driver){
		return driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[1]/ul/li[2]/span/a"));
	}
	
	public WebElement getTxt_codigoFuente(WebDriver driver){
		return driver.findElement(By.xpath(".//*[@id='wpTextbox1']"));
	}
	
	public WebElement getPopUp_Editar(WebDriver driver){
		return 	driver.findElement(By.xpath("//*[text()='Empezar a editar']"));
	}
	
	public WebElement getTxt_verHistorial(WebDriver driver){
		return driver.findElement(By.linkText("Ver historial"));
	}

}
