

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Testphp  {
	public static void main(String []args) throws Exception, InterruptedException {
		loginTest();
	}
public static void loginTest() throws IOException,InterruptedException  {
 WebDriver driver=new ChromeDriver();
 String url="http://testphp.vulnweb.com/login.php";
 driver.get(url);
 driver.manage().window().maximize();
 sleep(2); // Slow down
 WebElement
username=driver.findElement(By.xpath("//div[@id='content']/div[1]/form[@name='loginform']/table//input[@name='uname']"));
 username.sendKeys("test");
 WebElement
password=driver.findElement(By.xpath("//div[@id='content']/div[1]/form[@name='loginform']/table//input[@name='pass']"));
 password.sendKeys("test");
 sleep(2); // Slow down
 WebElement
loginbtn=driver.findElement(By.xpath("//div[@id='content']//form[@name='loginform']/table/tbody/tr[3]/td/input[@value='login']"));
 loginbtn.click();
 System.out.println("The Test Executed Successfully");
 BufferedReader reader = new BufferedReader(new
FileReader("C:/Users/piyus/Desktop/data.txt"));
 String line = reader.readLine();
 String[] content = line.split(",");
 
 WebElement field1_input =
driver.findElement(By.name("urname"));
 WebElement field2_input =driver.findElement(By.name("ucc"));
 WebElement field3_input =
driver.findElement(By.name("uemail"));
 WebElement field4_input =
driver.findElement(By.name("uphone"));
 WebElement field5_input =
driver.findElement(By.name("uaddress"));
 
 field1_input.clear();
 field2_input.clear();
 field3_input.clear();
 field4_input.clear();
 field5_input.clear();
 field1_input.sendKeys(content[0]);
 field2_input.sendKeys(content[1]);
 field3_input.sendKeys(content[2]);
 field4_input.sendKeys(content[3]);
 field5_input.sendKeys(content[4]);
 WebElement
submit_btn=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/table/tbody/tr[6]/td/input"));
 submit_btn.click();
 reader.close();
 sleep(15);
 driver.close();
 }

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

 }

