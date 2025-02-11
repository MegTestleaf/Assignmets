package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Non_Modal_Aert {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://leafground.com/alert.xhtml");
	
	//Sweet alert - this can be handled directly using DOM elements, instead of using Alert object
	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	if(driver.getPageSource().contains("Dialog")){
		System.out.println("Dialog box is visible");
		}else{
		System.out.println("Dialog box is not visible");}
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	if(!driver.getPageSource().contains("Dialog")){
		System.out.println("Dialog box is dismissed successfully");
		}else{
		System.out.println("Dialog box is not dismissed successfully");}
	
	//Sweet alert with only X icon to dismiss
	driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	if(!driver.getPageSource().contains("Modal Dialog (Sweet Alert)")){
		System.out.println("Sweet Alert Dialog box is displayed");
		}else{
		System.out.println("Sweet Alert Dialog box is not displayed");}
	//press X icon to dismiss:
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
	if(!driver.getPageSource().contains("Modal Dialog (Sweet Alert)")){
		System.out.println("Sweet Alert Dialog box is dismissed successfully");
		}else{
		System.out.println("Sweet Alert Dialog box is not is dismissed");}
}}

