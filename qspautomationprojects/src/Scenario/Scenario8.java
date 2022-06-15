package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		WebElement targetToMouseHover = 
				driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions act= new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		Thread.sleep(4000);
				
			
		WebElement dropdownelement = driver.findElement(By.xpath("//span[@class='size-box-overlay']"));
		Select sel = new Select(dropdownelement);
		sel.selectByVisibleText("2-2(2 2/16");
		
		driver.findElement(By.id("buy-now")).click();
	}

}
