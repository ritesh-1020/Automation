package Scenario;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		WebElement targetToMouseHover = 
		driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
		Thread.sleep(4000);
		
		WebElement targetToMouseHover1 = 
				driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		Actions act1= new Actions(driver);
		act1.moveToElement(targetToMouseHover1).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"view-sort-by\"]/div[3]/a")).click();
		
	}

}
