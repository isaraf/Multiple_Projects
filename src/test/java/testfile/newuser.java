package testfile;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

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

import basefile.HrmsBase;
import pages.newusercreation;


public class newuser extends HrmsBase{

	newusercreation sp;
	String actualTitle;
	public ExtentTest test;
	public ExtentReports extent;

	@BeforeSuite
	public void Launch() throws InterruptedException, IOException {
		initialization();
		sp = new newusercreation();
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
	public void username() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.username().sendKeys("harsimran");
		String actual = driver.getTitle();
		String expected = "::: Log In Page ::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 2)
	public void password() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.password().sendKeys("bebo123");
		String actual = driver.getTitle();
		String expected = "::: Log In Page ::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 3)
	public void Login() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Login().click();
		String actual = driver.getTitle();
		String expected = "::: Log In Page ::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 4)
	public void InformationCenter() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.InformationCenter().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 5)
	public void Addnewmember() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Addnewmember().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 6)
	public void FirstName () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.FirstName ().sendKeys("Jaspreet");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 7)
	public void MiddleName  () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.MiddleName  ().sendKeys("Kaur");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 8)
	public void LastName  () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.LastName ().sendKeys("Saini");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 9)
	public void Gender() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Gender().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 10)
	public void Fathername   () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Fathername  ().sendKeys("Hardeepsingh");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 11)
	public void Mothername   () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Mothername  ().sendKeys("Sarabjeet kaur");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	
	@Test(priority = 12)
	public void Dateofbirth    () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Dateofbirth().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}

	@Test(priority = 13)
	public void Year() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Year().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}

	@Test(priority = 14)
	public void Day() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Day().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 15)
	public void Bloodgroup() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Bloodgroup().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 16)
	public void Presentaddress   () throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Presentaddress().sendKeys("Rajpura");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}

		assertEquals(actual, expected);
	}
	@Test(priority = 17)
	public void TimeZone() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.TimeZone().click();
		
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 18)
	public void Present() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Present().sendKeys("Asia/Kolkata");
		sp.zval().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 19)
	public void Country() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Country().click();
		
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 20)
	public void State() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.State().click();
		
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 21)
	public void CITY() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.CITY().click();
		
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 22)
	public void OFFICE() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.OFFICE().click();
		
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 23)
	public void Chandigarh() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Chandigarh().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 24)
	public void Check() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Check().click();
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
		}
	@Test(priority = 25)
	public void Mnumber() throws InterruptedException {
		test = extent.startTest("Verify whether Sign In Page Loads Successfully");
		test.log(LogStatus.INFO, "Sign In load Test is intiated");
		test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
		sp.Mnumber().sendKeys("9988997766");
		String actual = driver.getTitle();
		String expected = "::: Human Resource Management System - bebo technologies";

		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sign In page loaded properly");
		} else {
			test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
		}
		assertEquals(actual, expected);
	}
	
		@Test(priority = 26)
		public void Lnumber() throws InterruptedException {
			test = extent.startTest("Verify whether Sign In Page Loads Successfully");
			test.log(LogStatus.INFO, "Sign In load Test is intiated");
			test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
			sp.Lnumber().sendKeys("01912595170");
			String actual = driver.getTitle();
			String expected = "::: Human Resource Management System - bebo technologies";

			if (actual.equals(expected)) {
				test.log(LogStatus.PASS, "Sign In page loaded properly");
			} else {
				test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
			}
			assertEquals(actual, expected);
		}
		
			@Test(priority = 27)
			public void Email() throws InterruptedException {
				test = extent.startTest("Verify whether Sign In Page Loads Successfully");
				test.log(LogStatus.INFO, "Sign In load Test is intiated");
				test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
				sp.Email().sendKeys("isaraf@bebotechnologies");
				String actual = driver.getTitle();
				String expected = "::: Human Resource Management System - bebo technologies";

				if (actual.equals(expected)) {
					test.log(LogStatus.PASS, "Sign In page loaded properly");
				} else {
					test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
				}
				assertEquals(actual, expected);
			}
				

			@Test(priority = 28)
			public void Econtact() throws InterruptedException {
				test = extent.startTest("Verify whether Sign In Page Loads Successfully");
				test.log(LogStatus.INFO, "Sign In load Test is intiated");
				test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
				sp.Econtact().sendKeys("ichita");
				String actual = driver.getTitle();
				String expected = "::: Human Resource Management System - bebo technologies";

				if (actual.equals(expected)) {
					test.log(LogStatus.PASS, "Sign In page loaded properly");
				} else {
					test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
				}
				assertEquals(actual, expected);
			}
			
				@Test(priority = 29)
				public void Ephone() throws InterruptedException {
					test = extent.startTest("Verify whether Sign In Page Loads Successfully");
					test.log(LogStatus.INFO, "Sign In load Test is intiated");
					test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
					sp.Ephone().sendKeys("7812345687");
					String actual = driver.getTitle();
					String expected = "::: Human Resource Management System - bebo technologies";

					if (actual.equals(expected)) {
						test.log(LogStatus.PASS, "Sign In page loaded properly");
					} else {
						test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
					}
					assertEquals(actual, expected);
				}
				
				@Test(priority = 30)
				public void Mailment() throws InterruptedException {
					test = extent.startTest("Verify whether Sign In Page Loads Successfully");
					test.log(LogStatus.INFO, "Sign In load Test is intiated");
					test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
					sp.Mailment().sendKeys("None");
					String actual = driver.getTitle();
					String expected = "::: Human Resource Management System - bebo technologies";

					if (actual.equals(expected)) {
						test.log(LogStatus.PASS, "Sign In page loaded properly");
					} else {
						test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
					}
					assertEquals(actual, expected);
				}
				@Test(priority = 31)
				public void Browser() throws InterruptedException, IOException {
					test = extent.startTest("Verify whether Sign In Page Loads Successfully");
					test.log(LogStatus.INFO, "Sign In load Test is intiated");
					test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
					sp.Browser().click();
					Runtime.getRuntime().exec("C:\\Users\\isaraf\\Documents\\uploadautoit.exe");
					String actual = driver.getTitle();
					String expected = "::: Human Resource Management System - bebo technologies";

					if (actual.equals(expected)) {
						test.log(LogStatus.PASS, "Sign In page loaded properly");
					} else {
						test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
					}
					assertEquals(actual, expected);
					}
				@Test(priority = 32)
				public void SaveButton() throws InterruptedException, IOException {
					test = extent.startTest("Verify whether Sign In Page Loads Successfully");
					test.log(LogStatus.INFO, "Sign In load Test is intiated");
					test.log(LogStatus.INFO, "Verify Sign In Page Loads Successfully");
					sp.Save().click();
					//Runtime.getRuntime().exec("C:\\Users\\isaraf\\Documents\\uploadautoit.exe");
					String actual = driver.getTitle();
					String expected = "::: Human Resource Management System - bebo technologies";

					if (actual.equals(expected)) {
						test.log(LogStatus.PASS, "Sign In page loaded properly");
					} else {
						test.log(LogStatus.FAIL, "Sign In page is not loaded properly");
					}
					assertEquals(actual, expected);
					}
					
}

