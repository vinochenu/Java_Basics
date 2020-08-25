package WebDriver_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		
		WebDriver Object =new ChromeDriver();
		
		Object.get("http://automationpractice.com/index.php");
		
		Object.findElement(By.xpath("//a[@class='login']")).click();
		
		Object.findElement(By.id("email_create")).clear();
		Object.findElement(By.id("email_create")).click();
		Object.findElement(By.id("email_create")).sendKeys("vinoalphaq1@gmail.com");
		
		Object.findElement(By.xpath("//button[@type='submit' and @name='SubmitCreate']")).click();
		
		//Object.findElement(By.id("id_gender1")).clear();
		Object.findElement(By.id("id_gender1")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object.findElement(By.xpath("//label[@for='id_gender1']")).click();
		
		
		
		//Object.findElement(By.id("uniform-id_gender1")).click();
		
		Object.findElement(By.id("customer_firstname")).clear();
		Object.findElement(By.id("customer_firstname")).click();
		Object.findElement(By.id("customer_firstname")).sendKeys("vinothkumar");
		
		Object.findElement(By.id("customer_lastname")).clear();
		Object.findElement(By.id("customer_lastname")).click();
		Object.findElement(By.id("customer_lastname")).sendKeys("palanisamy");
		
		Object.findElement(By.id("email")).clear();
		Object.findElement(By.id("email")).click();
		Object.findElement(By.id("email")).sendKeys("vinoalphaq1@gmail.com");
		
		Object.findElement(By.id("passwd")).clear();
		Object.findElement(By.id("passwd")).click();
		Object.findElement(By.id("passwd")).sendKeys("Puspam@3118");
		
		Object.findElement(By.id("days")).click();
		new Select (Object.findElement(By.id("days"))).selectByVisibleText("31");
		
		Object.findElement(By.id("months")).click();
		new Select (Object.findElement(By.id("months"))).selectByVisibleText("January");
		
		Object.findElement(By.id("years")).click();
		new Select (Object.findElement(By.id("years"))).selectByVisibleText("1990");
		
		Object.findElement(By.xpath("//input[@class='form-control' and @id='firstname']")).clear();
		Object.findElement(By.xpath("//input[@class='form-control' and @id='firstname']")).click();
		Object.findElement(By.xpath("//input[@class='form-control' and @id='firstname']")).sendKeys("vinothkumar");
		
		Object.findElement(By.xpath("//input[@class='form-control' and @id='lastname']")).clear();
		Object.findElement(By.xpath("//input[@class='form-control' and @id='lastname']")).click();
		Object.findElement(By.xpath("//input[@class='form-control' and @id='lastname']")).sendKeys("palanisamy");
		
		Object.findElement(By.id("address1")).clear();
		Object.findElement(By.id("address1")).click();
		Object.findElement(By.id("address1")).sendKeys("Flat G1");
		
		Object.findElement(By.id("city")).clear();
		Object.findElement(By.id("city")).click();
		Object.findElement(By.id("city")).sendKeys("Flat G1");
		
		
		Object.findElement(By.id("id_state")).click();
		new Select(Object.findElement(By.id("id_state"))).selectByVisibleText("Texas");
		
		Object.findElement(By.id("postcode")).clear();
		Object.findElement(By.id("postcode")).click();
		Object.findElement(By.id("postcode")).sendKeys("10000");
		
		Object.findElement(By.id("phone_mobile")).clear();
		Object.findElement(By.id("phone_mobile")).click();
		Object.findElement(By.id("phone_mobile")).sendKeys("9789605795");
		
		Object.findElement(By.id("alias")).clear();
		Object.findElement(By.id("alias")).click();
		Object.findElement(By.id("alias")).sendKeys("Home");
		
		Object.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		System.out.println("Account has been registered successfully");
		
		Object.close();
		
	}

}
