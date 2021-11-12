package Week2Assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

public static void main(String[] args) throws InterruptedException
{
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
//maximize the window 
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
Thread.sleep(5000);
//Click on Create New Account button
driver.findElement(By.linkText("Create New Account")).click();
//Enter the first name
driver.findElement(By.name("firstname")).sendKeys("Ish");

//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ishu");
//Enter the last name
driver.findElement(By.name("lastname")).sendKeys("Bask");
//enter phone number 
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9047811874");
//handle the dropdowns
WebElement dropdown=driver.findElement(By.name("birthday_day"));
Select select = new Select(dropdown);
select.selectByValue("3");

WebElement dropdown1= driver.findElement(By.name("birthday_month"));
Select select1 = new Select(dropdown1);
select1.selectByVisibleText("May");

WebElement dropdown2 = driver.findElement(By.name("birthday_year"));
Select select2 = new Select(dropdown2);
select2.selectByValue("1993");
//handle the radio button (select female)

driver.findElement(By.xpath("//label[text()='Female']")).click();
}
}
