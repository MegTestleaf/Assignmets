package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_elements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List <WebElement> values = new ArrayList<WebElement>();
		values = driver.findElements(By.tagName("a"));
		System.out.println(values);
		System.out.println("Element list");
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
		}
}}
