import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTestCase {


	public static void main(String args[]) throws InterruptedException{
		TC_2_Selectable tc2=new TC_2_Selectable();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\OswaldoArana\\workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		tc2.doSelect(driver);
	}
}
