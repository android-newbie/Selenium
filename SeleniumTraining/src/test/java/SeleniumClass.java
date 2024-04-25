import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		 WebElement searchInput = driver.findElement(By.xpath("//*[contains(@gh-ac)]"));
         searchInput.sendKeys("mobile");

         // Find the element containing text "mobile" and click on it
         WebElement mobileElement = driver.findElement(By.xpath("//*[text()='mobile']"));
         mobileElement.click();
//		driver. close();
		//driver.quit();

	}

}
