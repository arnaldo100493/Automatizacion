package everis;

import everis.pages.AddBookPage;
import everis.pages.LoginPage;

public class BuyBookPage extends BasePage {

	   public Boolean SetLogin(String user, String password)
       {
	       return new LoginPage().LoginAsUser(user,password);
       }

	   
	   
       public Boolean AddPage(int quantity)
       {
           return new AddBookPage().AddPage(5000);
       }
       
	
}
