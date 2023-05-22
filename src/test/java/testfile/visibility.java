package testfile;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefile.meesho;
import pages.SignUpPage; 
public class visibility extends meesho {
	SignUpPage sp;
	String actualTitle;
	@BeforeSuite
	public void Launch()throws InterruptedException
	{
		initialization();
		sp=new SignUpPage();   	
}
	@Test(priority=1)
	public void profile()throws InterruptedException
	{
		Assert.assertEquals(true, sp.profile().isDisplayed());
		System.out.println("profile is displayed-Assert passed");
	}
	@Test(priority=2)
	public void logos()throws InterruptedException
	{
		Assert.assertEquals(true, sp.logos().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=3)
	public void womenethiclogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.womenethiclogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=4)
	public void womenwesternlogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.womenwesternlogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=5)
	public void menlogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.menlogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=6)
	public void kidslogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.kidslogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=7)
	public void homelogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.homelogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}
	@Test(priority=8)
	public void beautylogo()throws InterruptedException
	{
		Assert.assertEquals(true, sp.beautylogo().isDisplayed());
		System.out.println("logo is displayed-Assert passed");
	}

}
