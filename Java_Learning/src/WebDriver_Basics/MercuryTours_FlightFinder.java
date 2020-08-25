package WebDriver_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_FlightFinder {

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
				
				//Fight Finder
				
				Object.findElement(By.xpath("//input[@type='radio' and @value='roundtrip']")).click();
				
				Object.findElement(By.name("passCount")).click();
			new Select(Object.findElement(By.name("passCount"))).selectByVisibleText("1");
			
			Object.findElement(By.name("fromPort")).click();
			new Select(Object.findElement(By.name("fromPort"))).selectByVisibleText("London");
			
			
			Object.findElement(By.name("fromMonth")).click();
			new Select(Object.findElement(By.name("fromMonth"))).selectByVisibleText("May");
			
			Object.findElement(By.name("fromDay")).click();
			new Select(Object.findElement(By.name("fromDay"))).selectByVisibleText("31");
			
			Object.findElement(By.name("toPort")).click();
			new Select(Object.findElement(By.name("toPort"))).selectByVisibleText("Paris");
			
			Object.findElement(By.name("toMonth")).click();
			new Select(Object.findElement(By.name("toMonth"))).selectByVisibleText("June");
			
			Object.findElement(By.name("toDay")).click();
			new Select(Object.findElement(By.name("toDay"))).selectByVisibleText("31");
			
			Object.findElement(By.xpath("//input[@type='radio' and @name='servClass' and @value='Coach']")).click();
			
			Object.findElement(By.name("airline")).click();
			new Select(Object.findElement(By.name("airline"))).selectByVisibleText("No Preference");
			
			Object.findElement(By.name("findFlights")).click();
			
			
			
			
			// FLIGHT CONFIRMATION
			
			Object.findElement(By.xpath("//input[@type='radio' and @name='outFlight' and @value='Blue Skies Airlines$361$271$7:10']")).click();
			
			Object.findElement(By.xpath("//input[@type='radio' and @name='inFlight' and @value='Blue Skies Airlines$630$270$12:23']")).click();
			
			Object.findElement(By.name("reserveFlights")).click();
			
			
			//PAYMENT SCREEN
			
			
			Object.findElement(By.name("creditCard")).click();
			new Select(Object.findElement(By.name("creditCard"))).selectByVisibleText("American Express");
			
			Object.findElement(By.name("creditnumber")).clear();
			Object.findElement(By.name("creditnumber")).click();
			Object.findElement(By.name("creditnumber")).sendKeys("1234567890");
			
			Object.findElement(By.name("cc_exp_dt_mn")).click();
			new Select(Object.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("02");
			
			Object.findElement(By.name("cc_exp_dt_yr")).click();
			new Select(Object.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2010");
			
			Object.findElement(By.name("cc_frst_name")).sendKeys("vinoth");
			Object.findElement(By.name("cc_mid_name")).sendKeys("kumar");
			Object.findElement(By.name("cc_last_name")).sendKeys("palanisamy");
			
			Object.findElement(By.xpath("//input[@type='checkbox' and @name='ticketLess']")).click();
			Object.findElement(By.name("buyFlights")).click();
			
			//Billing Address
			
			/*Object.findElement(By.name("billAddress1")).sendKeys("Flat G1");
			Object.findElement(By.name("billAddress2")).sendKeys("kundanahalli");
			Object.findElement(By.name("billCity")).sendKeys("Bangalore");
			Object.findElement(By.name("billState")).sendKeys("karnataka");
			Object.findElement(By.name("billCountry")).click();
			new Select(Object.findElement(By.name("billCountry"))).selectByVisibleText("INDIA");
			Object.findElement(By.name("billZip")).sendKeys("560066");
			
			//Delivery Address
			Object.findElement(By.name("delAddress1")).sendKeys("Flat G1");
			Object.findElement(By.name("delAddress2")).sendKeys("kundanahalli");
			Object.findElement(By.name("delCity")).sendKeys("Bangalore");
			Object.findElement(By.name("delState")).sendKeys("karnataka");
			Object.findElement(By.name("delCountry")).click();
			new Select(Object.findElement(By.name("delCountry"))).selectByVisibleText("INDIA");
			Object.findElement(By.name("delCountry")).sendKeys("560066");*/
			
}

}
