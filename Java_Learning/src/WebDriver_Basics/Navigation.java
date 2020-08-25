package WebDriver_Basics;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		
		WebDriver Object=new ChromeDriver();
		
		Object.get("https://www.w3schools.com/sql/");
		Object.findElement(By.linkText("SQL Syntax")).click();
		Object.findElement(By.linkText("SQL Where")).click();
		Object.navigate().back();
		System.out.println("Title1 is"+" "+ Object.getTitle());
		Object.navigate().forward();
		System.out.println("Title2 is"+" "+ Object.getTitle());
		Object.navigate().refresh();
		System.out.println("Title3 is"+" "+ Object.getTitle());
		Object.navigate().to("https://www.seleniumhq.org/");
		System.out.println("Title4 is"+" "+ Object.getTitle());
		Object.navigate().back();
		System.out.println("URL is"+" "+ Object.getCurrentUrl());
		Object.close();

	}

}
