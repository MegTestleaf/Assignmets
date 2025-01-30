package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_With_SelectClass {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test_leaf_sample");
		driver.findElement(By.name("description")).sendKeys("Test_leaf_sample_description");
		driver.findElement(By.name("industryEnumId")).click();
		driver.findElement(By.xpath("//option[text()=\"Computer Software\"]")).click();
		
		WebElement dd = driver.findElement(By.name("ownershipEnumId"));
		Select option1 = new Select(dd);
		option1.selectByVisibleText("S-Corporation");
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select option2 = new Select(dd1);
		option2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dd2 = driver.findElement(By.id("marketingCampaignId"));
		Select option3 = new Select(dd2);
		option3.selectByIndex(7);
		
		WebElement dd3 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option4 = new Select(dd3);
		option4.selectByValue("TX");
		//Create account
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		Thread.sleep(10000);
		//System.out.println(driver.getPageSource().contains("Test_leaf_sample"));
		boolean tt = driver.getPageSource().contains("Test_leaf_sample");
		if(tt) {
			System.out.println("Account created successfully");
			//Get title and output it
			String title = driver.getTitle();
			System.out.println(title);	
		}
		else {
			System.out.println("Account creation failed");
		}
		driver.close();	
		
}}
