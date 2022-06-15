package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		WebElement targetToMouseHover = 
				driver.findElement(By.xpath("//span[@data-p='offers,m']"));
		Actions act= new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

	}

}
