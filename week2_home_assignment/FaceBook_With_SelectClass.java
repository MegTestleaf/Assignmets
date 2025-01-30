package week2.home_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_With_SelectClass {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testleaf@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("123456");
	
	WebElement dd = driver.findElement(By.name("birthday_day"));
	Select option = new Select(dd);
	option.selectByValue("31");
	
	WebElement dd1 = driver.findElement(By.name("birthday_month"));
	Select option1 = new Select(dd1);
	option1.selectByValue("12");
	
	WebElement dd2 = driver.findElement(By.name("birthday_year"));
	Select option2 = new Select(dd2);
	option2.selectByValue("1912");
	
	driver.findElement(By.xpath("//label[text()='Male']")).click();
}
}
