package Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClas{
public String filename;
	public ChromeOptions ch;
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition()
	{
		ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");;
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postcondtion()
	{
		driver.close();
	}
	
	@DataProvider (name="fetch")
	public String[][] getdata() throws IOException
	{
		String[][] readData = ReadExcel.ReadData(filename);
		return readData;
	}
}
