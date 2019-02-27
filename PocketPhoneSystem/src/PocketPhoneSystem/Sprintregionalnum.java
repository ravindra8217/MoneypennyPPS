package PocketPhoneSystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sprintregionalnum {
	@Test
	public static void pps() throws IOException, InterruptedException{

    Properties prop= new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\Ravali\\git\\MoneypennyPPS\\PocketPhoneSystem\\src\\PocketPhoneSystem\\Configpps.properties");
	prop.load(ip);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	WebElement ele = driver.findElement(By.xpath(prop.getProperty("calls")));
	Actions act= new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath(prop.getProperty("pps"))).click();
	driver.findElement(By.xpath(prop.getProperty("ppsbutton"))).click();
	Thread.sleep(5000);
	driver.switchTo().frame("designstudio-iframe");
	driver.findElement(By.id("icon-close")).click();
	Thread.sleep(3000);
	WebElement pack= driver.findElement(By.xpath("(//input[@class='choose-package btn submitButton'])[2]"));
	pack.click();
	//driver.navigate().to("https://aslive-www.moneypenny.com/uk/pocket-phone-system/#Emailhttps://test-www.moneypenny.com/uk/pocket-phone-system/#Email");
	WebElement email1= driver.findElement(By.id("Email"));
	email1.sendKeys("moneypennytest+apgomiTechnology51@gmail.com");
	driver.findElement(By.xpath(prop.getProperty("go"))).click();
	Thread.sleep(5000);
	WebElement radioBtn = driver.findElement(By.xpath("(//div[@class='number-type__tab']//div/label)[1]"));
	radioBtn.click();
		/*
		 * WebElement region = driver.findElement(By.id("regionfilter"));
		 * region.sendKeys("0161 - Manchester"); region.sendKeys(Keys.ENTER);
		 */
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//ul[@class='content pps-numbers-standard-list']//li//label)[1]")).click();

	//driver.findElement(By.xpath("//div[@id='paging_container']/ul/li[1]/input/../div")).click();
	driver.findElement(By.id("numbers-next")).click();
	driver.findElement(By.xpath(prop.getProperty("continue1"))).click();
	
	//entering customer details
	driver.findElement(By.id("FirstName")).sendKeys("aiswarya");
	driver.findElement(By.id("LastName")).sendKeys("testIndia");
	driver.findElement(By.id("CompanyName")).sendKeys("ApgomiTech");
	driver.findElement(By.id("ContactNumber")).sendKeys("011122233365");
    driver.findElement(By.id("Password")).sendKeys("test12345");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("test12345");
	driver.findElement(By.id("ConfirmTerms")).click();
	driver.findElement(By.id("gtm-your-business-init")).click();
	
	
	//billing adress
	
	driver.findElement(By.id("HouseName")).sendKeys("Apgomitech");
	driver.findElement(By.id("Address1")).sendKeys("Manchester");
	driver.findElement(By.id("Address2")).sendKeys("London SE1 7PB");
	driver.findElement(By.id("Town")).sendKeys("Hemel");
	driver.findElement(By.id("County")).sendKeys("London");
	driver.findElement(By.id("PostCode")).sendKeys("SE1 7PB");
	
	
	//Switch to payments and entering Payment Details
	driver.switchTo().frame("_iframe_holder");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@data-worldpay='name']")).sendKeys("Apgomitech");
	driver.findElement(By.xpath("//input[@data-worldpay='number']")).sendKeys("1111222233334444");
	driver.findElement(By.xpath("//input[@data-worldpay='exp-month']")).sendKeys("11");
	driver.findElement(By.xpath("//input[@data-worldpay='exp-year']")).sendKeys("2029");
	driver.findElement(By.xpath("//input[@data-worldpay='cvc']")).sendKeys("141");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("pay-button")).click();
	
}
}