package WebDriver_Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.ProtocolHandshake;



public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.linkText("Projects")).click();
	    driver.findElement(By.linkText("Download")).click();
	    driver.getCurrentUrl();
	    String Url=driver.getCurrentUrl();
	    System.out.println("Url is"+Url);
	    String Title=driver.getTitle();
	    System.out.println("Title is"+Title);
	    String PageSource=driver.getPageSource();
	    //System.out.println("PageSource is"+PageSource);
	    String WindowHandle=driver.getWindowHandle();
	    System.out.println("WindowHandle is"+WindowHandle);
	    Set WindowHandles=driver.getWindowHandles();
	    System.out.println("WindowHandles is"+WindowHandles);
	    driver.getTitle();
	    driver.getPageSource();
	    driver.getWindowHandle();
	    driver.getWindowHandles();
	    driver.close();
	    System.out.println("Program executed");
		
		
	}

}
