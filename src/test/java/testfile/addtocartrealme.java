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

public class addtocartrealme extends realme {

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
		//extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);	
		extent=new ExtentReports("C:\\Users\\isaraf\\.jenkins\\workspace\\realmewindow\\realme_testlogin.html",true);	
	}
//
	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 1)
	public void Brand() throws InterruptedException {
		test = extent.startTest("Verify whether Brand Page Loads Successfully");
		test.log(LogStatus.INFO, "Brand load Test is intiated");
		test.log(LogStatus.INFO, "Verify Brand Page Loads Successfully");
		sp.Brand().click();
		Thread.sleep(10000);
		String actual = driver.getTitle();
		String expected = "realme (India) - Dare to leap";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Brand page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Brand page is not loaded properly");
		}

		assertEquals(actual, expected);
	}

@Test(priority = 2)
public void App() throws InterruptedException {
	test = extent.startTest("Verify whether  App Page Loads Successfully");
	test.log(LogStatus.INFO, " App load Test is intiated");
	test.log(LogStatus.INFO, "Verify  App Page Loads Successfully");
	sp. App().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, "App page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " App page is not loaded properly");
	}

	assertEquals(actual, expected);
}
	
@Test(priority = 3)
public void  Bulkorders() throws InterruptedException {
	test = extent.startTest("Verify whether  Bulkorders Page Loads Successfully");
	test.log(LogStatus.INFO, " Bulkordersload Test is intiated");
	test.log(LogStatus.INFO, "Verify  Bulkorders Page Loads Successfully");
	sp. Bulkorders().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " Bulkorders page loaded properly");
	} else {
		test.log(LogStatus.FAIL, "Bulkorders page is not loaded properly");
	}

	assertEquals(actual, expected);
}
	
@Test(priority = 4)
public void  Community() throws InterruptedException {
	test = extent.startTest("Verify whether  Bulkorders Page Loads Successfully");
	test.log(LogStatus.INFO, " Bulkordersload Test is intiated");
	test.log(LogStatus.INFO, "Verify  Bulkorders Page Loads Successfully");
	sp.Community().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, "Community page loaded properly");
	} else {
		test.log(LogStatus.FAIL, "Community page is not loaded properly");
	}

	assertEquals(actual, expected);
}
@Test(priority = 5)
public void  Support() throws InterruptedException {
	test = extent.startTest("Verify whether  Support Page Loads Successfully");
	test.log(LogStatus.INFO, "  Support Test is intiated");
	test.log(LogStatus.INFO, "Verify  Support Page Loads Successfully");
	sp. Support().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " Support page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " Support page is not loaded properly");
	}

	assertEquals(actual, expected);
}
@Test(priority = 6)
public void   realmestores() throws InterruptedException {
	test = extent.startTest("Verify whether  realmestores Page Loads Successfully");
	test.log(LogStatus.INFO, "  realmestores Test is intiated");
	test.log(LogStatus.INFO, "Verify  realmestores Page Loads Successfully");
	sp. realmestores().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " realmestores page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " realmestores page is not loaded properly");
	}

	assertEquals(actual, expected);
}
	
@Test(priority = 7)
public void   realmeow() throws InterruptedException {
	test = extent.startTest("Verify whether  realmeow Page Loads Successfully");
	test.log(LogStatus.INFO, "  realmeow Test is intiated");
	test.log(LogStatus.INFO, "Verify  realmeow Page Loads Successfully");
	sp. realmeow().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " realmeow page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " realmeow page is not loaded properly");
	}

	assertEquals(actual, expected);
}
@Test(priority = 8)
public void   UI4() throws InterruptedException {
	test = extent.startTest("Verify whether  UI4 Page Loads Successfully");
	test.log(LogStatus.INFO, "  UI4 Test is intiated");
	test.log(LogStatus.INFO, "Verify  UI4 Page Loads Successfully");
	sp. UI4().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " UI4 page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " UI4 page is not loaded properly");
	}

	assertEquals(actual, expected);
}
@Test(priority = 9)
public void   G4() throws InterruptedException {
	test = extent.startTest("Verify whether  G4 Page Loads Successfully");
	test.log(LogStatus.INFO, " G4 Test is intiated");
	test.log(LogStatus.INFO, "Verify  G4 Page Loads Successfully");
	sp. G5().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " G4 page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " G4 page is not loaded properly");
	}

	assertEquals(actual, expected);
}
@Test(priority = 10)
public void   realmesmartphones() throws InterruptedException {
	test = extent.startTest("Verify whether  realmesmartphones Page Loads Successfully");
	test.log(LogStatus.INFO, " realmesmartphones Test is intiated");
	test.log(LogStatus.INFO, "Verify  realmesmartphones Page Loads Successfully");
	sp. realmesmartphones().click();
	Thread.sleep(10000);
	String actual = driver.getTitle();
	String expected = "realme (India) - Dare to leap";

	if (actual.equals(expected)) {
		test.log(LogStatus.PASS, " G4 page loaded properly");
	} else {
		test.log(LogStatus.FAIL, " G4 page is not loaded properly");
	}

	assertEquals(actual, expected);
}
}	




