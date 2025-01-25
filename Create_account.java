package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_account {
public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	WebElement PW = driver.findElement(By.id("password"));
	PW.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("TestLeaf_2025");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	driver.findElement(By.id("numberEmployees")).sendKeys("10");
	driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
	driver.findElement(By.className("smallSubmit")).click();
	
	//Get title and output it
	String title = driver.getTitle();
	System.out.println(title);	
}
}
