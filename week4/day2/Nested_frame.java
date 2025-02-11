package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://leafground.com/frame.xhtml");
		
		//outside frame		
		driver.switchTo().frame(2);
		//inner frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.getPageSource().contains("Hurray! You Clicked Me."));
		
		//move to outer frame
		driver.switchTo().parentFrame();
		//Move from frames to main page
		driver.switchTo().defaultContent();		
	}
}
