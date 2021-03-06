package assignmentweek3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	//ChromeOptions options= new ChromeOptions();
	//options.addArguments("--disable notifications");
	//options.addArguments("--start maximized");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
	
	List<WebElement> brand = driver.findElements(By.className("brand"));
	
	System.out.println("\n Number of Brands :" +brand.size()+"\nThere are:\n");
	for (WebElement element : brand) 
	{
		String brandName = element.getText();
		System.out.println(brandName);
	}
	
	List<WebElement> bag = driver.findElements(By.className("nameCls"));

	System.out.println("\n Number of Bags :"+bag.size()+"\nThere are:\n");
	
	for(WebElement element : bag)
	{
		String bagName = element.getText();
		System.out.println(bagName);
	}
}

}
