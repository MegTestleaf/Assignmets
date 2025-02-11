package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal_Alert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://leafground.com/alert.xhtml");
		//Simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text=driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text);
		//span[text()='Show']
		
		//Confirmation alert - press ok
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		String Ok_text=driver.findElement(By.id("result")).getText();
		System.out.println(Ok_text);
		
		//Confirmation alert - press ok
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		String Dismiss_text=driver.findElement(By.id("result")).getText();
		System.out.println(Dismiss_text);
		
		//Prompt alert:
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Testleaf");
		alert3.accept();
		String Prompt_success_text=driver.findElement(By.id("confirm_result")).getText();
		System.out.println(Prompt_success_text);
		
		//Prompt alert dismiss:
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Testleaf");
		alert4.dismiss();
		String Prompt_dismiss_text=driver.findElement(By.id("confirm_result")).getText();
		System.out.println(Prompt_dismiss_text);
	}

}
