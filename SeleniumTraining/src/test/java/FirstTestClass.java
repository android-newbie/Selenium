import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("piyush");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login-button")).click();	
		driver.close();

	}

}
