package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alerts extends BaseDriver {
	  
	@Test (priority = 0)
	public void startWebSite() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	@Test (priority = 1)
	public void alertCheck() throws InterruptedException{
		
		WebElement jsAlert= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		SoftAssert softAssert = new SoftAssert();
		
		jsAlert.click();
	    Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		String resultText = result.getText();
		softAssert.assertEquals(resultText, "You successfully clicked an alert");
		
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultConfirm = result.getText();
		softAssert.assertEquals(resultConfirm, "You clicked: Ok");
		
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    String resultConfirmjs = result.getText();
	    softAssert.assertEquals(resultConfirmjs, "You clicked: Cancel");
		
	    jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test Alert");
		driver.switchTo().alert().accept();
    	Thread.sleep(5000);
    	String resultPrompt = result.getText();
	    softAssert.assertEquals(resultPrompt, "You entered: Test Alert");
	    
	    jsPrompt.click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    String resultPromptjs = result.getText();
	    softAssert.assertEquals(resultPromptjs, "You entered: null");
	    Thread.sleep(3000);
	    
    	softAssert.assertAll();
	}
}
