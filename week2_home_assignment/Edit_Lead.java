package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Lead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test_Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Test_Leaf_1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")).sendKeys("New york");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);
		//Get title and output it
		String title = driver.getTitle();
		System.out.println(title);	
		driver.close();
}
}
