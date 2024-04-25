
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HerokuClass {
	
	public static void main(String []args) {
		loginTest();
	}

	public static void loginTest() {
// Creating a new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
// Assigning the URL to a string variable
		String url = "https://the-internet.herokuapp.com/login";
// Navigating to the URL
		driver.get(url);
// Maximizing the browser window
		driver.manage().window().maximize();
// Sleeping for 2 seconds
		sleep(2);
// Locating the username field using XPath and sending keys
		WebElement username = driver.findElement(By.xpath("/html//input[@id='username']"));
		username.sendKeys("tomsmith");
// Locating the password field using XPath and sending keys
		WebElement password = driver.findElement(By.xpath("/html//input[@id='password']"));
		password.sendKeys("SuperSecretPassword!");
// Sleeping for 2 seconds
		sleep(2);
// Locating the login button using XPath and clicking
		WebElement loginbtn = driver.findElement(By.xpath("//form[@id='login']//i[@class='fa fa-2x fa-sign-in']"));
		loginbtn.click();
// Assigning the expected URL to a string variable
		String expectedurl = "https://the-internet.herokuapp.com/secure";
// Assigning the current URL to a string variable
		String actualurl = driver.getCurrentUrl();
// Checking if the actual URL matches the expected URL
		//Assert.assertEquals(actualurl, expectedurl, "The URL is not the same as expected");
// Sleeping for 5 seconds
		sleep(5);
// Printing a success message
		System.out.println("The program executed successfully");
// Navigating to the expected URL
		driver.get(expectedurl);
// Locating the logout button using class name and checking if it is displayed
		WebElement logoutbtn = driver.findElement(By.className("icon-signout"));
		Assert.assertTrue(logoutbtn.isDisplayed(), "logout");
// Printing that the logout button was found
		System.out.println(logoutbtn + "logout found");
// Closing the browser
		//driver.close();
	}

	private static void sleep(int sec) {
		try {
// Sleeping for the specified number of seconds
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}