package Marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_Scalesforce extends BaseClas{
	@BeforeTest
	public void set() {
		filename="Tc_001";
	}
	@Test(dataProvider = "fetch")
	public void postingquestion(String qus,String des) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement chatter=driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));
		driver.executeScript("arguments[0].click();", chatter);
		String s1=driver.getTitle();
		if(s1.equals(s1)) {
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title doesn't matched");
		}
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(qus);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(des);
		driver.findElement(By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button[@type='button']")).click();
		driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
	}
	
	
		
	}

	


