package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseDriver {
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(itera);
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
    public void testLocators() throws InterruptedException{
    	
		WebElement id = driver.findElement(By.id("name"));
		id.sendKeys("Seher");
		Thread.sleep(1000);
		
		WebElement num = driver.findElement(By.id("phone"));
		num.sendKeys("01913478358");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("islammillie11@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456#");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("201, Kafrul, Dhaka");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);
    }

}

