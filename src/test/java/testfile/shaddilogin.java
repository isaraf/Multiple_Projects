package testfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefile.shaddi;
import pages.loginpage;

	public class shaddilogin extends shaddi {
		
		loginpage sp;
		String actualTitle;
		@BeforeSuite
		public void Launch()throws InterruptedException
		{
			initialization();
			sp=new loginpage(); 
}
		@Test(priority=1)
		 public void logologinvisible() {
		      sp.logologin().isDisplayed();
		      //Assert.assertTrue(logologinvisible.isDisplayed());
		   }
		@Test(priority = 2)
		public void clicklogologin()throws InterruptedException
		{
			sp.logologin().click();
			
		}
		@Test(priority = 3)
		public void SignUpFree()throws InterruptedException
		{
			sp.SignUpFree().click();
			
		}
		@Test(priority = 4)
		public void Myself()throws InterruptedException
		{
			sp.Myself().click();
			
		}
		@Test(priority = 5)
		public void Female()throws InterruptedException
		{
			sp.Female().click();
			
		}
		@Test(priority = 6)
		public void Firstname()throws InterruptedException
		{
			sp.Firstname().sendKeys("jaspreet");
			
		}
		@Test(priority =7 )
		public void Lastname()throws InterruptedException
		{
			sp.Lastname().sendKeys("Kaur");
			
		}
		@Test(priority =8 )
		public void Day()throws InterruptedException
		{
			sp.Day().sendKeys("22");
			
		}
		@Test(priority =9 )
		public void Month()throws InterruptedException
		{
			sp.Month().sendKeys("07");
			
		}
		@Test(priority =10 )
		public void Year()throws InterruptedException
		{
			sp.Year().sendKeys("2001");
			
		}
		@Test(priority = 11)
		public void Continue ()throws InterruptedException
		{
//			Thread.sleep(2000);
			sp.Continue().click();
			
		}
		@Test(priority = 12)
		public void Religion ()throws InterruptedException
		{
			sp.Religion().click();
			sp.ReligionSelect().click();
			
		}
		@Test(priority = 13)
		public void Community ()throws InterruptedException
		{
			Thread.sleep(3000);
			sp.Community().click();
			Thread.sleep(3000);
			sp.CommunitySelect().click();
			
		}
		@Test(priority = 14)
		public void Continues ()throws InterruptedException
		{
			sp.Continues().click();
}
		@Test(priority = 15)
		public void EmailID ()throws InterruptedException
		{
			sp.EmailId().click();
			sp.EmailId().sendKeys("isaraf677@gmail.com");
}
		@Test(priority = 16) 
		public void Mobilenumber ()throws InterruptedException
		{
			sp.Mobilenumber().click();
			sp.Mobilenumber().sendKeys("9682647124");
}
		@Test(priority = 17)
		public void Submit ()throws InterruptedException
		{
			sp.Submit().click();
	}
	}
