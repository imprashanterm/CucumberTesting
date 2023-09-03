package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Util {
	
	WebDriver driver;
	
	public int age = 28;
	
	public void chromePath() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	}
	
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void login(String user, String pass) {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
	}
	
	public void verifyLoginMessage() {
		String var = driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		Assert.assertEquals(var, "Logged In Successfully");
	}
	
	public void closeBrowser() {
		driver.close();
	}
	 
	public void greeting() {
		System.out.println("prashant");
	}
	
	public void overriding1() {
		System.out.println("ye parent ka overriding method hai");
	}
	

}
