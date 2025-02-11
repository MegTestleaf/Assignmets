package week4.home_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Ajio_List {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		//allow some loading time
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		//allow some loading time
		Thread.sleep(10000);
		
		List<WebElement> product_list = (List<WebElement>) driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']"));
		System.out.println("Total number of products: "+product_list.size());
		
		//Product Brand:
		List<WebElement> product_brand = (List<WebElement>) driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> Product_Brand = new ArrayList<String>();
		System.out.println("Total number of products: "+product_brand.size());
		for(int i=0;i<product_brand.size()-1;i++) {
			//System.out.println(product_brand.get(i).getText());
			Product_Brand.add(product_brand.get(i).getText());
		}
		System.out.println("Product Brand names:");
		System.out.println(Product_Brand);
		System.out.println(Product_Brand.size());
		
		//Product name
		List<WebElement> product_name = (List<WebElement>) driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> Product_Name = new ArrayList<String>();
		System.out.println("Total number of products: "+product_name.size());
		for(int i=0;i<product_name.size()-1;i++) {
			//System.out.println(product_brand.get(i).getText());
			Product_Name.add(product_name.get(i).getText());
		}
		System.out.println("Product Names:");
		System.out.println(Product_Name);
		System.out.println(Product_Name.size());
	}
}
