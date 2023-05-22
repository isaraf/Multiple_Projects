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
public class shaddidotcom extends shaddi {
	
		loginpage sp;
		String actualTitle;
		@BeforeSuite
		public void Launch()throws InterruptedException
		{
			initialization();
			sp=new loginpage(); 
}
		@Test(priority=1)
		public void login()throws InterruptedException
		{
			Assert.assertEquals(true, sp.login().isDisplayed());
			System.out.println("profile is displayed-Assert passed");
		}
		@Test(priority=2)
		public void help()throws InterruptedException
		{
			Assert.assertEquals(true, sp.help().isDisplayed());
			System.out.println("logo is displayed-Assert passed");
			Thread.sleep(3000);
		}
		@Test(priority=3)
		public void women()throws InterruptedException
		{
			Assert.assertEquals(true, sp.women().isDisplayed());
			System.out.println(" women logo is displayed-Assert passed");
		}
		@Test(priority=4)
		public void aged()throws InterruptedException
		{
			Assert.assertEquals(true, sp.aged().isDisplayed());
			System.out.println(" age logo is displayed-Assert passed");
		}
		@Test(priority=5)
		public void ofreligion()throws InterruptedException
		{
			Assert.assertEquals(true, sp.ofreligion().isDisplayed());
			System.out.println("logo is displayed-Assert passed");
			Thread.sleep(3000);
		}
		@Test(priority=6)
		public void andmothertounge()throws InterruptedException
		{
			Assert.assertEquals(true, sp.andmothertounge().isDisplayed());
			System.out.println("logo is displayed-Assert passed");
		}
		@Test(priority=7)
		public void LetsBegin()throws InterruptedException
		{
			Assert.assertEquals(true, sp.LetsBegin().isDisplayed());
			System.out.println("LetsBegin is displayed-Assert passed");
		}


}
