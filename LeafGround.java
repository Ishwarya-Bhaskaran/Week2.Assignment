package Week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	//maximize the window 
	driver.manage().window().maximize();
	//enter email 
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    //append 
    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Ishu");
    //ele.clear();
    String ele= driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
    System.out.println(ele);
    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
    //disabled field
    System.out.println(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled());
    
}
}
