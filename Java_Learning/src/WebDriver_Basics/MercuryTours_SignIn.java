package WebDriver_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		
		//LAUNCH Website
		Object.get("http://newtours.demoaut.com/");
		
		//SIGN-IN or REGISTER
		Object.findElement(By.linkText("REGISTER")).click();
		Object.findElement(By.name("firstName")).clear();
		Object.findElement(By.name("firstName")).click();
		Object.findElement(By.name("firstName")).sendKeys("vinothkumar");
		Object.findElement(By.name("lastName")).clear();
		Object.findElement(By.name("lastName")).click();
		Object.findElement(By.name("lastName")).sendKeys("palanisamy");
		Object.findElement(By.name("phone")).clear();
		Object.findElement(By.name("phone")).click();
		Object.findElement(By.name("phone")).sendKeys("9789605795");
		Object.findElement(By.name("userName")).clear();
		Object.findElement(By.name("userName")).click();
		Object.findElement(By.name("userName")).sendKeys("vinoalphaq1@gmail.com");
		
		Object.findElement(By.name("address1")).sendKeys("flat G1");
		Object.findElement(By.name("address2")).sendKeys("kundanahalli");
		Object.findElement(By.name("city")).sendKeys("Bangalore");
		Object.findElement(By.name("state")).sendKeys("karnataka");
		Object.findElement(By.name("postalCode")).sendKeys("560066");
		
		Object.findElement(By.name("country")).click();
		new Select(Object.findElement(By.name("country"))).selectByVisibleText("INDIA");
				
		Object.findElement(By.name("email")).clear();
		Object.findElement(By.name("email")).click();
		Object.findElement(By.name("email")).sendKeys("vinoalphaq1@gmail.com");
		
		Object.findElement(By.name("password")).clear();
		Object.findElement(By.name("password")).click();
		Object.findElement(By.name("password")).sendKeys("Puspam@3118");
		
		Object.findElement(By.name("confirmPassword")).clear();
		Object.findElement(By.name("confirmPassword")).click();
		Object.findElement(By.name("confirmPassword")).sendKeys("Puspam@3118");
		
		Object.findElement(By.xpath("//input[@type='image' and @name='register']")).click();
		
		Object.close();
		
		
		
		
		
		
		
	}

}
