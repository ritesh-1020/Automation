package WebElementMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Thread.sleep(4000);
		link.click();
		

	}

}
