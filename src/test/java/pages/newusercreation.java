package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import basefile.HrmsBase;


public class newusercreation extends HrmsBase  {
	 public newusercreation ()
     {
   	  PageFactory.initElements(driver, this);
     }

// Login to application
	 
	 @FindBy(xpath = "//*[@id=\"username\"]")
		WebElement U_serName;
	 
	 public WebElement username () {
			return  U_serName;
		}
	 
	 @FindBy(xpath = "//*[@id=\"password\"]")
		WebElement P_assword ;
	 
	 public WebElement password  () {
			return P_assword ;
		}

	 @FindBy(xpath = "//*[@id=\"LoginBtn\"]")
		WebElement L_ogin ;
	 
	 public WebElement Login  () {
			return L_ogin  ;
		}
	 
	 // Add New Member In Hierarchy
	 
	 @FindBy(xpath = "//*[@id=\"smoothmenu1\"]/ul[2]/li")
		WebElement I_nformationcenter ;
	 
	 public WebElement InformationCenter   () {
			return I_nformationcenter  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"smoothmenu1\"]/ul[2]/li/ul/li[2]/a")
		WebElement Add_New_Member ;
	 
	 public WebElement Addnewmember   () {
			return Add_New_Member  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"first_name\"]")
		WebElement F_irstName ;
	 
	 public WebElement FirstName    () {
			return F_irstName  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"middle_name\"]")
		WebElement M_iddleName ;
	 
	 public WebElement MiddleName    () {
			return M_iddleName  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"last_name\"]")
		WebElement L_astName  ;
	 
	 public WebElement LastName    () {
			return L_astName  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"emp_gender\"]/option[2]")
		WebElement G_ender  ;
	 
	 public WebElement Gender   () {
			return G_ender  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"father_name\"]")
		WebElement F_name  ;
	 
	 public WebElement Fathername   () {
			return F_name  ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"mother_name\"]")
		WebElement M_name  ;
	 
	 public WebElement Mothername   () {
			return M_name   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"date_birth\"]")
		WebElement D_O_B  ;
	 
	 public WebElement Dateofbirth   () {
			return D_O_B   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[33]")
		WebElement Y_ear  ;
	 
	 public WebElement Year   () {
			return Y_ear   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a")
		WebElement D_ay  ;
	 
	 public WebElement Day  () {
			return D_ay   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"b_group\"]/option[5]")
		WebElement B_loodGroup  ;
	 
	 public WebElement Bloodgroup  () {
			return B_loodGroup   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"present_address\"]")
		WebElement P_resentADD   ;
	 
	 public WebElement Presentaddress  () {
			return  P_resentADD   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"select2-time_zone_present_add-container\"]")
		WebElement T_imeZone   ;
	 
	 public WebElement TimeZone  () {
			return  T_imeZone   ;
		}
	 
	 @FindBy(xpath = "/html/body/span/span/span[1]/input")
		WebElement P_resent   ;
	 
	 public WebElement Present  () {
			return  P_resent   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"country_present\"]/option[3]")
		WebElement C_ountry  ;
	 
	 public WebElement Country  () {
			return  C_ountry   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"state_present\"]/option[4]")
		WebElement S_tate  ;
	 
	 public WebElement State  () {
			return  S_tate   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"city_present\"]/option[16]")
		WebElement C_ITY ;
	 
	 public WebElement CITY  () {
			return  C_ITY   ;
		}
	 
	 @FindBy(xpath = "//input[@class='select2-search__field']")
		WebElement O_FFICE ;
	 
	 public WebElement OFFICE  () {
			return  O_FFICE   ;
		}
	 @FindBy(xpath = "//li[@class='select2-results__option' and contains(text(),'Chandigarh')]")
		WebElement C_handigarh ;
	 
	 public WebElement Chandigarh  () {
			return  C_handigarh   ;
		}
	 
	 @FindBy(xpath = "//li[contains(text(),'Asia/Kolkata')]")
		WebElement zoneval ;
	 
	 public WebElement zval  () {
			return  zoneval   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"permanentAddr\"]")
		WebElement C_heck ;
	 
	 public WebElement Check  () {
			return  C_heck   ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"mob_number\"]")
		WebElement M_number ;
	 
	 public WebElement Mnumber   () {
			return  M_number    ;
		}
	 @FindBy(xpath = "//*[@id=\"phn_number\"]")
		WebElement L_number ;
	 
	 public WebElement Lnumber   () {
			return  L_number    ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"email_id\"]")
		WebElement E_mail ;
	 
	 public WebElement Email   () {
			return  E_mail    ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"eme_per\"]")
		WebElement E_contact ;
	 
	 public WebElement Econtact   () {
			return  E_contact    ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"eme_num\"]")
		WebElement E_phone ;
	 
	 public WebElement Ephone   () {
			return  E_phone    ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"med_ailment\"]")
		WebElement M_ailment ;
	 
	 public WebElement  Mailment   () {
			return   M_ailment    ;
		}
	 
	 @FindBy(xpath = "//*[@id=\"browse\"]")
		WebElement B_rowser ;
	 
	 public WebElement  Browser   () {
			return   B_rowser   ;
		}
	
	 @FindBy(xpath = "")
	 WebElement S_ave ;
	 public WebElement Save  () {
			return   S_ave   ;
		}
}
	 


