package pages;
import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import basefile.HrmsBase;

public class HrmsTest2 extends HrmsBase {

HrmsLogin Loginobj;

String actual_title;

public ExtentTest test;

public ExtentReports extent;

@BeforeClass

public void Launch() throws IOException

{

initialization();

Loginobj = new HrmsLogin();

extent=new ExtentReports("C:\\Users\\isaraf\\.jenkins\\workspace\\realme2\\extent.html",true);

}

@AfterClass

public void stop() throws IOException

{

terminate();

extent.endTest(test);

extent.flush();

}

@Test (priority=1)

public void loginfunctionality() throws InterruptedException {

test=extent.startTest("Verify user is able to successfully login on entering valid credentials.");

test.log(LogStatus.INFO,"Entering user data to login");

Loginobj.login();

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

test.log(LogStatus.PASS, "Successfull Login");

}

@Test (priority=2)

public void newuserfunctionality() throws InterruptedException, IOException {

test=extent.startTest("Verify user is able to successfully register on entering valid personal information");

test.log(LogStatus.INFO,"Entering user data to register");

Loginobj.newuser();

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

test.log(LogStatus.PASS, "Successfull Registration");

}

}



