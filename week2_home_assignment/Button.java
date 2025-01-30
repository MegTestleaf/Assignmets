package week2.home_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	//Get title and output it
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("Dashboard")) {
		System.out.println("In correct dashboard page");
	}else {
		System.out.println("wrong page, please check");
	}
	driver.navigate().back();
	boolean enabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
	System.out.println("Enable state: "+enabled);
	//driver.close();
	//driver.get("https://leafground.com/button.xhtml");
	String button_status = driver.findElement(By.xpath("(//button[@type='button']/span)[2]")).getText();
	if(button_status.contains("Disabled")) {
		System.out.println("Button is disabled");
	}else {
		System.out.println("Not disabled");
	}
	System.out.println(driver.findElement(By.xpath("(//button[@type='button']/span)[3]")).getLocation());
	System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
	System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
	driver.close();	
	
}
}
