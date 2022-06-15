package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches",Keys.ENTER);
		
		WebElement dropdownElement = driver.findElement(By.xpath("//div[@id='s0-64-12-0-1-2-6-0-2[1]-4[0]-3']"));
		Select sel = new Select(dropdownElement);
		
		sel.selectByVisibleText("Apple Watch Series 7");
		sel.selectByVisibleText("Apple Watch Series 6");
		
		
	}
}
