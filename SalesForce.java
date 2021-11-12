package Week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	//maximize the window 
	driver.manage().window().maximize();
	//add implicit wait 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//fill in all text fields 
	driver.findElement(By.name("UserFirstName")).sendKeys("shrinidhi");
	driver.findElement(By.name("UserLastName")).sendKeys("shankar");
	driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
	//select job title dropdown 
	WebElement dropdown= driver.findElement(By.name("UserTitle"));
	Select select = new Select(dropdown);
	select.selectByValue("IT_Manager_AP");
	//enter company name 
	driver.findElement(By.name("CompanyName")).sendKeys("TCS");
	//select employees 
	WebElement dropdown1= driver.findElement(By.name("CompanyEmployees"));
	Select select1 = new Select(dropdown1);
	select1.selectByValue("75");
	//enter phone number 
	driver.findElement(By.name("UserPhone")).sendKeys("9047811879");
	//select country 
	WebElement dropdown2= driver.findElement(By.name("CompanyCountry"));
	Select select2 = new Select(dropdown2);
	select2.selectByVisibleText("India");
	//select checkbox 
	driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
	Thread.sleep(5000);
	//close the browser 
	driver.close();
	}
}
