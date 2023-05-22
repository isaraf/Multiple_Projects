package testfile;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefile.meesho;
import pages.SignUpPage;

public class addtocartmessho extends meesho {
	SignUpPage sp;
	String actualTitle;
	@BeforeSuite
	public void Launch()throws InterruptedException
	{
		initialization();
		sp=new SignUpPage();   	
}
	@Test(priority=1)
	public void ethic()throws InterruptedException
	{
		sp.ethicicon().click();
	}
	@Test(priority=2)
	public void kurtas()throws InterruptedException
	{
		sp.kurta().click();
	}
	@Test(priority=3)
	public void kurtasclick()throws InterruptedException
	{
		sp.kurtas().click();
	}
	@Test(priority=4)
	public void size()throws InterruptedException
	{
		sp.sizes().click();
	}
	@Test(priority=5)
	public void carts()throws InterruptedException
	{
		sp.cart().click();
	}

}
