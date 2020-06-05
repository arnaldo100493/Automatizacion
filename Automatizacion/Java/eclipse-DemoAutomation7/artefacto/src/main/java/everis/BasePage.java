package everis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {

	  protected WebDriver driver = DriverFactory.getChromeDriver();

	    public BasePage verifyIsDisplayed(By element){
	        Assert.assertTrue(driver.findElement(element).isDisplayed());
	        return this;
	    }

	    public BasePage verifyIsNotDisplayed(By element){
	        // your code ...
	        return this;
	    }
	    
}
