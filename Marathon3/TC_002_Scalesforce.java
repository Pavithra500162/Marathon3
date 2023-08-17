package Marathon3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_002_Scalesforce extends BaseClas {
	@BeforeTest
	public void set() {
		filename="Tc_002";
	}
	@Test(dataProvider = "fetch")
	public void opportunity(String oppname, String amount) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		Actions a=new Actions(driver);
		WebElement key=driver.findElement(By.xpath("(//span[@class='viewAllLabel'])[4]"));
		a.scrollToElement(key).click(key).perform();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(oppname);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		WebElement dd1=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click();", dd1);
		WebElement dd=driver.findElement(By.xpath("//span[@title='Partner Referral']"));
		driver.executeScript("arguments[0].click();", dd);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(amount);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("9/20/2023");
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input')]")).click();
		driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Needs Analysis']")).click();
		WebElement option=driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));
		option.click();option.click();
		driver.findElement(By.xpath("//span[contains(@class,'slds-listbox__option-text slds-listbox')]/span")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String s1=driver.findElement(By.xpath("//h2[@title='We hit a snag.']")).getText();
		System.out.println(s1);
		//setTimeout(function(){debugger;}, 5000)
	}
	
}
