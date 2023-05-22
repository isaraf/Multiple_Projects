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

import basefile.meesho;
import pages.SignUpPage;

public class TestUpPage extends meesho {
	SignUpPage sp;
	String actualTitle;
	@BeforeSuite
	public void Launch()throws InterruptedException
	{
		initialization();
		sp=new SignUpPage();   	
}
	@Test(priority=1)
	 public void profilevisible() {
	      sp.profile().isDisplayed();
	      //Assert.assertTrue(profile.isDisplayed());
	   }

	
	@Test(priority = 2)
	public void clickprofile()throws InterruptedException
	{
		sp.profile().click();
		
	}
	@Test(priority = 3)
	public void clicksignup()throws InterruptedException
	{
		sp.signup().click();
		
	}
	@Test(priority = 4)
	public void clickmobile()throws InterruptedException
	{
		sp.mobile().sendKeys("9682647124");	
	}
	@Test(priority = 5)
	public void clickcountinue()throws InterruptedException
	{
		sp.continues().click();	
	}
	@Test(priority = 6)
	public void clickverify()throws InterruptedException
	{
		Thread.sleep(1000);
		sp.verifys().click();	
	}
	
	
		
	}