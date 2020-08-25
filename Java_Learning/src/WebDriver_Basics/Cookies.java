package WebDriver_Basics;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options.*;
import org.openqa.selenium.remote.ProtocolHandshake;

public class Cookies {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/");
		Set cookies= driver.manage().getCookies();// to get the cookies
		
		for(Object cookiesdisplay : cookies)// Here Object can use for all types or we can use class
		{
		System.out.println(cookiesdisplay);	
		}
		
		//driver.manage().deleteAllCookies();---> not working(to delete all cookies)
		

		driver.close();		
	}

}
