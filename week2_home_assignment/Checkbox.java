package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	Thread.sleep(2000);
	//System.out.println(driver.getPageSource().contains("Checked"));
	boolean tt = driver.getPageSource().contains("Checked");
	if(!tt)
	{
		System.out.println("Expected msg is not displayed");
	}else {
		System.out.println("Expected msg is displayed successfully");
	}
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
	//String selected=driver.findElement(By.xpath("(//div[@class='ui-growl-message']/p)[2]")).getText();
	//System.out.println(selected);
	Thread.sleep(2000);
	//System.out.println(driver.getPageSource().contains("State has been changed."));
	boolean tt1 = driver.getPageSource().contains("State has been changed.");
	if(!tt1)
	{
		System.out.println("State not changed.");
	}else {
		System.out.println("State has been changed successfully");
	}
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
	boolean tt2 = driver.getPageSource().contains("Checked");
	if(!tt2)
	{
		System.out.println("Not checked");
	}else {
		System.out.println("Checked successfully");
	}
	String selected=driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/span)[3]")).getText();
	//System.out.println(selected);
	if(selected.contains("Disabled")) {
		System.out.println("Disabled state");
	}else {
		System.out.println("Not disabled, please cehck");
	}
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
	driver.findElement(By.xpath("//div[class()='layout-topbar']")).click();
	/*boolean tt3 = driver.getPageSource().contains("Paris");
	if(!tt3)
	{
		System.out.println("Paris not selected");
	}else {
		System.out.println("pars selected successfully");
	}
	
	//driver.close();
	*/
}
}
