package week4.home_assignments;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_and_Alert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//- Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//navigate inside frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//move to alert prompt
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Testleaf");
		alert.accept();
		
		//navigate inside frame
		//driver.switchTo().frame("iframeResult");
		if(driver.getPageSource().contains("Hello Testleaf! How are you today?"))
		{
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}	
		//driver.close();
	}
}
