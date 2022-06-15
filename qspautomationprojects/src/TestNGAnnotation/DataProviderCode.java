package TestNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderCode {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@DataProvider(name="testActiTimeData")
	public Object[][] dataprovider()
	{
		Object[][] data= new Object[5][2];
	
		data[0][0]="admin1";
		data[0][1]="manager123";
		
		data[1][0]="ad min1";
		data[1][1]="manager 123";
		
		data[2][0]="xyz123";
		data[2][1]="!@#$123";
		
		data[3][0]="123";
		data[3][1]="admin";
		
		data[4][0]="abc123";
		data[4][1]="admin123";
		return data;
		
		
	}
}
