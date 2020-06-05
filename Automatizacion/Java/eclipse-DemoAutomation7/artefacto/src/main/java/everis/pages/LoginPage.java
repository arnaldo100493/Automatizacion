package everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import everis.DriverFactory;

public class LoginPage {

	protected WebDriver driver = DriverFactory.getChromeDriver();
	  
	  public Boolean LoginAsUser(String user, String password)
      {
		  driver.findElement(By.name("user")).sendKeys(user);
          driver.findElement(By.name("password")).sendKeys(password);
          driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
          return true;
      }
}
