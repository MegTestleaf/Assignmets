package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	String lead_ID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("Leadid-"+lead_ID);
	driver.findElement(By.xpath("//a[text()='"+lead_ID+"']")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	System.out.println(driver.getPageSource().contains("No records to display"));
	boolean tt = driver.getPageSource().contains("No records to display");
	if(!tt) {
		System.out.println("lead deleted successfully");
	}
	else {
		System.out.println("lead deletion failure");
	}
	driver.close();	
}
}
