package webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends BaseDriver{
	
	@Test ( priority = 0)
	public void startWebSite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}

    @Test ( priority = 1)
	public void dropDown() throws InterruptedException{
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select select = new Select(dropdown);
		
		
		select.selectByValue("1");
		Thread.sleep(4000);
		
		
	}
	
}


