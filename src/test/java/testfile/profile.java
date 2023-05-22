package testfile;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefile.shaddi;
import pages.loginpage;
public class profile {

	public class shaddilogin extends shaddi {
		
		loginpage sp;
		String actualTitle;
		@BeforeSuite
		public void Launch()throws InterruptedException
		{
			initialization();
			sp=new loginpage(); 
		}	
		
		      @Test(priority = 1)
		public void clicklogin()throws InterruptedException
		{
		    	  sp.login().click();
		}

		      @Test(priority = 2)
				public void clickEmailid()throws InterruptedException
				{
					
		    	  sp.Emailid().click();
					sp.Emailid().sendKeys("winnie041418@gmail.com");
					
				}	
		      @Test(priority = 3)
				public void Password()throws InterruptedException
				{
					sp.Password().click();
					sp.Password().sendKeys("ishita@123");
					
				}
		      @Test(priority = 4)
				public void loginnn()throws InterruptedException
				{
		    	  
					sp.Loginn().click();
					
				}
}
	}
