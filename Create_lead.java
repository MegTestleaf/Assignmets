package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_lead {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		WebElement PW = driver.findElement(By.id("password"));
		PW.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test_Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Creating Lead");
		driver.findElement(By.name("submitButton")).click();
		
		//Get title and output it
		String title = driver.getTitle();
		System.out.println(title);		
	}
}
