package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_try {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://leafground.com/frame.xhtml");
		
		//below will fail since click is inside frame
		//driver.findElement(By.id("Click")).click(); - so switch to frame and then use same
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.getPageSource().contains("Hurray! You Clicked Me."));
		
		//Move from frames to main page
		driver.switchTo().defaultContent();
				
	}
}
