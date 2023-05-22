package testfile;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import basefile.realme;

import pages.realmehome;

public class realmeproj extends realme {
	realmehome sp;
	String actualTitle;
	@BeforeSuite
	public void Launch()throws InterruptedException
	{
		initialization();
		sp=new realmehome();   	
}
	@Test(priority=1)
	public void AccessoriesandLifestyle()throws InterruptedException
	{
		sp.AccessoriesandLifestyle().click();
	}
	@Test(priority=2)
	public void Searchicon()throws InterruptedException
	{
		Thread.sleep(4000);
		sp.SearchIcon().click();
		Thread.sleep(3000);
		sp.SearchBar().sendKeys("New phones");
	}
	@Test(priority=3)
	public void realmewatch3pro()throws InterruptedException
	{
		Thread.sleep(4000);
		sp.realmewatch3pro().click();
		
	}
	@Test(priority=4)
	public void realmewatch3()throws InterruptedException
	{
		Thread.sleep(4000);
		sp.realmewatch3().click();
		
	}
	@Test(priority=5)
	public void Black()throws InterruptedException
	{
		Thread.sleep(4000);
		sp.Black().click();
		
	}
	@Test(priority=6)
	public void pincode()throws InterruptedException
	{
		Thread.sleep(4000);
		
		sp.pincode().sendKeys("181205");
	}
	@Test(priority=7)
	public void Accept()throws InterruptedException
	{
		Thread.sleep(4000);
		sp.Accept().click();
	}
		@Test(priority=8)
		public void Notify_Me()throws InterruptedException
		{
			Thread.sleep(4000);
			sp.Notify_Me().click();
	}
		@Test(priority = 9)
		public void phonenumber()throws InterruptedException
		{
			Thread.sleep(4000);
			sp.phonenumber().sendKeys("9682647124");
			Thread.sleep(5000);
			
		}
		@Test(priority = 10)
		public void passward()throws InterruptedException
		{
			sp.password().click();
			sp.password().sendKeys("ishita@123");
			Thread.sleep(5000);
		}
		@Test(priority = 11)
		public void Signinpassword()throws InterruptedException
		{
			sp.Signinpassword().click();
			Thread.sleep(20000);
			
			
		}
		@Test(priority = 12)
		public void CART()throws InterruptedException
		{
			Thread.sleep(5000);
	    sp.CART().click();
			
			
		}
		@Test(priority = 13)
		public void RealMeNarzo()throws InterruptedException
		{
	    sp.RealMeNarzo().click();
			
			
		}
		@Test(priority = 14)
		public void AddCartNajro()throws InterruptedException
		{
	    sp.AddCartNajro().click();
			
			
		}
		
}


