package WebDriver_Basics;

/*import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
*/
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;



public class Dropdown {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		
		WebDriver Object=new ChromeDriver();
		Object.get("https://www.w3schools.com/sql/");
		Object.findElement(By.linkText("CSS")).click();
		String Title=Object.getTitle();
		System.out.println(Title);
		String WindowHandle=Object.getWindowHandle();
		System.out.println(WindowHandle);
		Object.findElement(By.linkText("PHP")).click();
		String Title1=Object.getTitle();
		System.out.println(Title1);
		String WindowHandle1=Object.getWindowHandle();
		System.out.println(WindowHandle1);
		Object.close();
	}
}
