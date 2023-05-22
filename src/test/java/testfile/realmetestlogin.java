package testfile;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basefile.realme;
import pages.realmehome;

public class realmetestlogin extends realme {

	realmehome sp;
	String actualTitle;
	public ExtentTest test;
	public ExtentReports extent;

	@BeforeSuite
	public void Launch() throws InterruptedException {
		initialization();
		sp = new realmehome();
	}
	
	@BeforeTest
	public void x() {
//		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);	
		extent=new ExtentReports("C:\\Users\\isaraf\\.jenkins\\workspace\\realme2\\extent.html",true);	
	}

	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 1)
	public void clicklogin() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Login().click();
		String actual = driver.getTitle();
		String expected = "Sign in";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void Email() throws InterruptedException {
		sp.Email().click();
		test = extent.startTest("Verify whether Email Page Loads Successfully");
		test.log(LogStatus.INFO, "Email load Test is intiated");
		test.log(LogStatus.INFO, "Verify Email Page Loads Successfully");

		if ((sp.Email().isEnabled()) == true) {
			test.log(LogStatus.PASS, "Email page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Email page is not loaded properly");
		}
		Assert.assertEquals(sp.Email().isEnabled(), true);
	}
	@Test(priority = 3)
	public void Createaccount () throws InterruptedException {
		sp.Createaccount().click();
		test = extent.startTest("Verify whether Createaccount Page Loads Successfully");
		test.log(LogStatus.INFO, "Createaccount load Test is intiated");
		test.log(LogStatus.INFO, "Verify Createaccount Page Loads Successfully");

		if ((sp.Createaccount().isEnabled()) == true) {
			test.log(LogStatus.PASS, "Createaccount page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Createaccount page is not loaded properly");
		}
		Assert.assertEquals(sp.Createaccount().isEnabled(), true);
	}
	@Test(priority = 4)
	public void Emailaddress () throws InterruptedException {
		sp.Emailaddres().click();
		Thread.sleep(4000);
		sp.Emailaddres().sendKeys("isaraf677@gmail.com");
		test = extent.startTest("Verify whether Emailaddress Page Loads Successfully");
		test.log(LogStatus.INFO, "Emailaddress load Test is intiated");
		test.log(LogStatus.INFO, "Verify Emailaddress Page Loads Successfully");

		if ((sp.Createaccount().isEnabled()) == true) {
			test.log(LogStatus.PASS, "Emailaddress page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Emailaddress page is not loaded properly");
		}
		Assert.assertEquals(sp.Emailaddres().isEnabled(), true);
	}
@Test(priority = 5)
	public void Getcode () throws InterruptedException {
		sp.Getcode().click();
		Thread.sleep(4000);
		
		test = extent.startTest("Verify whether Getcode Page Loads Successfully");
		test.log(LogStatus.INFO, "Getcode load Test is intiated");
		test.log(LogStatus.INFO, "Verify Getcode Page Loads Successfully");

		if ((sp.Getcode().isEnabled()) == true) {
			test.log(LogStatus.PASS, "Getcode page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Getcode page is not loaded properly");
		}
		Assert.assertEquals(sp.Getcode().isEnabled(), true);
	}
	






}
