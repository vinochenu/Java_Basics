package WebDriver_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccoutCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		
		WebDriver Object =new ChromeDriver();
		
		Object.get("https://www.flipkart.com/");
		//Object.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Get access to your Orders, Wishlist and Recommendations'])[1]/following::input[1]")).click();
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Get access to your Orders, Wishlist and Recommendations'])[1]/following::input[1]")).clear();
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Get access to your Orders, Wishlist and Recommendations'])[1]/following::input[1]")).sendKeys("9789605795");
		
		
		
		/*Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter Email/Mobile number'])[1]/following::input[1]")).click();
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter Email/Mobile number'])[1]/following::input[1]")).clear();
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter Email/Mobile number'])[1]/following::input[1]")).sendKeys("Puspam@3118");*/
		
		
		/*Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).clear();
		Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).click();
		Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).sendKeys("9789605795");
		Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).clear();
		Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).click();
		Object.findElement(By.xpath("//*[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]/following::input[1]")).sendKeys("9789605795");*/
		/*Object.findElement(By.className("_2zrpKA")).click();
		Object.findElement(By.className("_2zrpKA")).sendKeys("9789605795");
		Object.findElement(By.className("_2zrpKA _3v41xv")).clear();
		Object.findElement(By.className("_2zrpKA _3v41xv")).click();
		Object.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("Puspam@3118");
		//Object.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).clear();
		//Object.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).click();
		//Object.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys("9789605795");*/
		Object.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv']")).clear();
		Object.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv']")).click();
		Object.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv']")).sendKeys("Puspam@3118");
		
		Object.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot?'])[1]/following::button[1]")).click();
		Object.close();
		
		System.out.println("program got executed");

		/*Object.findElement(By.id("email_create")).clear();
		Object.findElement(By.id("email_create")).click();
		Object.findElement(By.id("email_create")).sendKeys("vinoalphaq@gmail.com");
		Object.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::span[1]")).click();
		*/
		//Object.close();
		

	}

}
