package WebDriver_Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.ProtocolHandshake;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Chrome Driver\\chromedriver.exe");
	   WebDriver Object=new ChromeDriver();
	   Object.get("https://www.w3schools.com/sql/");
	   Object.findElement(By.linkText("SQL HOME")).click();
	   Object.findElement(By.linkText("SQL Intro")).click();
	   String URL=Object.getCurrentUrl();
	   System.out.println(URL);
	   Object.close();
	}

}
