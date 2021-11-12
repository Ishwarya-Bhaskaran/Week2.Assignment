package Week2Assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGLinks {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//maximize the window 
		driver.manage().window().maximize();
		//wait 
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//go to home page
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//a")).click();
	    //secd link 
	   WebElement ele= driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
	  String expectedUrl= ele.getAttribute("href");
	  System.out.println(expectedUrl);
	  
	  //broken link 
	 WebElement ele2= driver.findElement(By.linkText("Verify am I broken?"));
	  ele2.click();
	 String url= driver.getCurrentUrl();
	 if (url.contains("error")) {
		 System.out.println("The link is broken");
	
	 }else 
		 System.out.println ("The link works fine");
	  //home page link 
	  WebElement ele1= driver.findElement(By.linkText("Go to Home Page"));
	  System.out.println(ele1);
	  ele1.click();
	  
	  //count of links 
	  List<WebElement> linksCount= driver.findElements(By.tagName("a"));
	  int count= linksCount.size();
	  System.out.println("The number of links in this page are:"+count);
	  }
}
