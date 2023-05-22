package testfile;
import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import basefile.HrmsBase;
import pages.HrmsLogin;

public class HrmsTest extends HrmsBase {

HrmsLogin Loginobj;

String actual_title;

public ExtentTest test;

public ExtentReports extent;

@BeforeClass
public void Launch() throws IOException

{

initialization();

Loginobj = new HrmsLogin();

extent=new ExtentReports("C:\\Users\\isaraf\\.jenkins\\workspace\\update\\extent_report.html",true);

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

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.login();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

@Test (priority=2)

public void infomodulefunctionality() throws InterruptedException {

test=extent.startTest("Verify manager mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.selectmember(prop.getProperty("code1"));

Loginobj.changemail1();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

@Test (priority=3)

public void infomodulefunctionality2() throws InterruptedException {

test=extent.startTest("Verify teamlead mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : bebo123");

Loginobj.selectmember(prop.getProperty("code2"));

Loginobj.changemail2();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

@Test (priority=4)

public void infomodulefunctionality3() throws InterruptedException {

test=extent.startTest("Verify user1 mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.selectmember(prop.getProperty("code3"));

Loginobj.changemail3();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

Loginobj.logout().click();

}

@Test (priority=5)

public void infomodulefunctionality4() throws InterruptedException {

test=extent.startTest("Verify user2 mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.login();

Loginobj.selectmember(prop.getProperty("code4"));

Loginobj.changemail4();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

@Test (priority=6)

public void infomodulefunctionality5() throws InterruptedException {

test=extent.startTest("Verify user3 mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.selectmember(prop.getProperty("code5"));

Loginobj.changemail5();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

@Test (priority=7)

public void infomodulefunctionality6() throws InterruptedException {

test=extent.startTest("Verify user4 mail id is updated");

//test.log(LogStatus.INFO,"User Data : username : harsimran, Password : *******");

Loginobj.selectmember(prop.getProperty("code6"));

Loginobj.changemail6();

if(Loginobj.infodropdown.isDisplayed()==true) {

test.log(LogStatus.PASS, "Successfull Login");

} else {

test.log(LogStatus.FAIL, "User is not able to login.");

}

Assert.assertEquals(Loginobj.infodropdown.isDisplayed(),true);

}

}