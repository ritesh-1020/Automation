package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement targetToMouseHover = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Jinesh Kada For Him']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='getNearestStore']")).click();
			
		}

	}


