package Week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACME {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window 
		driver.manage().window().maximize();
		//enter email 
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//enter pwd 
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//click login 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//page title and print 
		String title = driver.getTitle();
		System.out.println(title);
		//click on logout Log Out
		driver.findElement(By.linkText("Log Out")).click();
		//close browser 
		driver.close();
	}

}
