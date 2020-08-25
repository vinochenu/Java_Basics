package WebDriver_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		
		//LAUNCH Website
		Object.get("http://newtours.demoaut.com/");
		
		//LOG IN
		
		Object.findElement(By.linkText("SIGN-ON")).click();
		
		Object.findElement(By.name("userName")).clear();
		Object.findElement(By.name("userName")).click();
		Object.findElement(By.name("userName")).sendKeys("vinoalphaq1@gmail.com");
		
		Object.findElement(By.name("password")).clear();
		Object.findElement(By.name("password")).click();
		Object.findElement(By.name("password")).sendKeys("Puspam@3118");
		
		Object.findElement(By.name("login")).click();
		
		

	}

}
