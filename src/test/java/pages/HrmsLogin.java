package pages;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import basefile.HrmsBase;

public class HrmsLogin extends HrmsBase {

//constructor

public HrmsLogin()

{

PageFactory.initElements(driver,this);

}

//WebElements : Locators + Identification

@FindBy(id="username")

WebElement uname;

@FindBy(id="password")

WebElement pass;

@FindBy(id="LoginBtn")

WebElement loginbutton;

@FindBy(xpath="//*[@id='smoothmenu1']/ul[2]/li/a")
public

WebElement infodropdown;

@FindBy(xpath="//a[contains(text(),'Member List')]")

WebElement memberlist;

@FindBy(xpath="//a[contains(text(),'Add New Member')]")

WebElement addnewmember;

@FindBy(id="select2-stype-container")

WebElement membertype;

@FindBy(xpath="//li[contains(text(),'Member Code')]")

WebElement membercode;

@FindBy(id="course")

WebElement codevalue;

@FindBy(xpath="//input[@type='submit']")

WebElement searchbutton;

@FindBy(xpath="//a[contains(text(),'Gopal Puri')]")

WebElement manager;

@FindBy(id="email_id")

WebElement usermail;

@FindBy(id="update-pim")

WebElement updatebtn;

@FindBy(xpath="//a[contains(text(),'Meenakshi Chaubey')]")

WebElement teamlead;

@FindBy(xpath="//a[contains(text(),'Harmanjot Singh Bal')]")

WebElement user1;

@FindBy(xpath="//a[contains(text(),'Kamalnoor Sekhon')]")

WebElement user2;

@FindBy(xpath="//a[contains(text(),'Girdhar Kumar')]")

WebElement user3;

@FindBy(xpath="//a[contains(text(),'Mausam Kumari')]")

WebElement user4;

@FindBy(xpath="//a[@title='Log Out']")

WebElement logoutbtn;

@FindBy(id="first_name")

WebElement firstname;

@FindBy(id="emp_gender")

WebElement empgender;

@FindBy(id="father_name")

WebElement fathername;

@FindBy(id="mother_name")

WebElement mothername;

@FindBy(id="date_birth")

WebElement datebirth;

@FindBy(xpath="//select[@class='ui-datepicker-year']")

WebElement dobyear;

@FindBy(xpath="//option[@value='2004']")

WebElement yearval;

@FindBy(xpath="//a[contains(text(),'14')]")

WebElement dayval;

@FindBy(id="present_address")

WebElement presentaddress;

@FindBy(id="select2-time_zone_present_add-container")

WebElement timezone;

@FindBy(xpath="/html/body/span/span/span[1]/input")

WebElement timesearch;

@FindBy(xpath="//li[contains(text(),'Asia/Kolkata')]")

WebElement zoneval;

@FindBy(id="country_present")

WebElement countrypresent;

@FindBy(xpath="//option[@value='4' and contains(text(),'INDIA')]")

WebElement countryval;

@FindBy(id="state_present")

WebElement statepresent;

@FindBy(xpath="//option[@value='11' and contains(text(),'Punjab')]")

WebElement stateval;

@FindBy(id="city_present")

WebElement citypresent;

@FindBy(xpath="//option[@value='4869']")

WebElement cityval;

@FindBy(xpath="//input[@class='select2-search__field']")

WebElement officesearchbox;

@FindBy(xpath="//li[@class='select2-results__option' and contains(text(),'Chandigarh')]")

WebElement officelocval;

@FindBy(id="permanentAddr")

WebElement Addrcheckbox;

@FindBy(id="mob_number")

WebElement mobnumber;

@FindBy(id="eme_per")

WebElement emeper;

@FindBy(id="eme_num")

WebElement emenum;

@FindBy(id="browse")

WebElement browse;

@FindBy(xpath="//a[text()='Joining Details']")

WebElement joiningdetails;

@FindBy(id="mail_id")

WebElement oldmail;

@FindBy(xpath="//input[@value='Update']")

WebElement updatemail;

//action methods

public void newuser() throws IOException, InterruptedException

{

infodropdown.click();

addnewmember.click();

firstname.sendKeys(prop.getProperty("fname"));

empgender.click();

Select obj = new Select(empgender);

obj.selectByVisibleText("Male");

fathername.sendKeys(prop.getProperty("father"));

mothername.sendKeys(prop.getProperty("mother"));

datebirth.click();

dobyear.click();

yearval.click();

dayval.click();

browse.click();

Runtime.getRuntime().exec("C:\\Users\\isaraf\\Documents\\uploadautoit.exe");

presentaddress.sendKeys(prop.getProperty("paddr"));

timezone.click();

timesearch.sendKeys(prop.getProperty("tzone"));

zoneval.click();

countrypresent.click();

countryval.click();

statepresent.click();

stateval.click();

citypresent.click();

cityval.click();

officesearchbox.click();

officelocval.click();

Addrcheckbox.click();

mobnumber.sendKeys(prop.getProperty("mobno"));

usermail.sendKeys(prop.getProperty("mail1"));



JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatebtn);

updatebtn.click();

Thread.sleep(50000);

}

public void setUsername(String username)

{

uname.clear();

uname.sendKeys(username);

}

public void setPassword(String password)

{

pass.clear();

pass.sendKeys(password);

}

public void clickSubmit()

{

loginbutton.click();

}

public void login()

{

setUsername(prop.getProperty("username"));

setPassword(prop.getProperty("password"));

clickSubmit();

}

public void selectmember(String memcode)

{

infodropdown.click();

memberlist.click();

membertype.click();

membercode.click();

codevalue.sendKeys(memcode);

searchbutton.click();

}

public void changemail1() throws InterruptedException

{

manager.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}

public void changemail2() throws InterruptedException

{

teamlead.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}

public void changemail3() throws InterruptedException

{

user1.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}

public void changemail4() throws InterruptedException

{

user2.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}

public void changemail5() throws InterruptedException

{

user3.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}

public void changemail6() throws InterruptedException

{

user4.click();

joiningdetails.click();

oldmail.clear();

oldmail.sendKeys(prop.getProperty("mail2"));

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)", updatemail);

Thread.sleep(2000);

updatemail.click();

Thread.sleep(5000);

}
}