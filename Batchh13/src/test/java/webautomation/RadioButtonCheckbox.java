package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonCheckbox extends BaseDriver {
	
	@Test (priority = 0)
	public void startWebSite() {
		driver.get(itera);
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void radioCheckbox() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.id("female"));
		WebElement checkbox1 = driver.findElement(By.id("tuesday"));
		WebElement checkbox2 = driver.findElement(By.id("friday"));
		
		gender.click();
		checkbox1.click();
		checkbox2.click();
		Thread.sleep(5000);
	
	}
	
}

