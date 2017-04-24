import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2_Selectable {
	
	public final String url="https://jqueryui.com/selectable/";
	
	public void doSelect(WebDriver driver) throws InterruptedException{
		driver.navigate().to(url);
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.cssSelector("#content"));
		 
		// print the total number of elements
		System.out.println("Total selected rows are " + rows.size());	
		
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText()+"  "+i);
		}

	}

	
}
