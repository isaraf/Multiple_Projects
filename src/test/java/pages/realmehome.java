package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import basefile.realme;

public class realmehome extends realme {
	 public realmehome ()
     {
   	  PageFactory.initElements(driver, this);
     }

	// login in realme
	@FindBy(xpath = "//*[@id=\"plus-accountLogin\"]")
	WebElement Login;

	@FindBy(xpath = "//img[@class='loginicon_img__1tbnms']")
	WebElement Email;

	@FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/div/div/div/div/div[2]/form/div[5]/button[2]")
	WebElement Createaccount;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Emailaddress;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[3]/form/div[2]/span/a")
	WebElement Getcode;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[3]/form/div[5]/button")
	WebElement Continue;
//	      @FindBy(xpath="")
//	      WebElement ;

	// for add to cart

	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[1]/a")
	WebElement Brand;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[3]/a")
	WebElement App;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[5]/a")
	WebElement Bulkorders;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[7]/a")
	WebElement Community;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[9]/a")
	WebElement Support;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[11]/a")
	WebElement realmestores;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[13]/a")
	WebElement realmeow;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[15]/a")
	WebElement UI4;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[17]/a")
	WebElement G4;
	@FindBy(xpath = "/html/body/header/div/nav/ul/li[1]/a")
	WebElement realmesmartphones;

	// for realmeproj
	@FindBy(xpath = "//a[@title='Accessories & Lifestyle']")
	WebElement AccessoriesandLifestyle;
	@FindBy(xpath = "//span[@class='icon icon-search']")
	WebElement search_icon;
	@FindBy(xpath = "//li[text()='realme Watch 3 Pro']")
	WebElement realme_Watch3pro ;
	@FindBy(xpath = "//*[@id=\"search-result-products\"]/li[1]/a")
	WebElement realme_Watch ;
	@FindBy(xpath = "//a[@class='goods-select-item disabled selected']")
	WebElement B_lack ;
	@FindBy(xpath = "//input[@placeholder='Enter pincode for delivery details']")
	WebElement pin_Code ;
	@FindBy(xpath = "//div[@class='btn r-btn r-btn--primary']")
	WebElement Accept ;
	@FindBy(xpath = "//div[@class='goods-summary-btns']")
	WebElement Notify_Me ;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	WebElement Phone_Number ;
	@FindBy(xpath = " //input[@placeholder='Password']")
	WebElement Pa_ssword ;
	@FindBy(xpath = "//span[text()='Sign in with password']")
	WebElement Signinpassword ;
	
	@FindBy(xpath = "//a[@id='cart']")
	WebElement C_ART ;
	
	@FindBy(xpath = "//a[@href='/in/goods/631']/div")
	WebElement R_ealMeNa_rzo ;
	
	@FindBy(xpath = "//a[@class='btn btn-black']")
	WebElement Add_Cart_Najro ;
	
	
	
	

	public WebElement Login() {
		return Login;
	}

	public WebElement Email() {
		return Email;
	}

	public WebElement Createaccount() {
		return Createaccount;
	}

	public WebElement Emailaddres() {
		return Emailaddress;
	}

	public WebElement Getcode() {
		return Getcode;
	}

	public WebElement Continue() {
		return Continue;
	}

	// return for add to cart
	public WebElement Brand() {
		return Brand;
	}

	public WebElement App() {
		return App;
	}

	public WebElement Bulkorders() {
		return Bulkorders;
	}

	public WebElement Community() {
		return Community;
	}

	public WebElement Support() {
		return Support;
	}

	public WebElement realmestores() {
		return realmestores;
	}

	public WebElement realmeow() {
		return realmeow;
	}

	public WebElement UI4() {
		return UI4;
	}

	public WebElement G5() {
		return G4;
	}
	
	public WebElement realmesmartphones() {
		return realmesmartphones;
	}
	// return realmeproj

	public WebElement AccessoriesandLifestyle() {
		return AccessoriesandLifestyle;
	}
	public WebElement SearchIcon() {
		return search_icon;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement search_bar;
	public WebElement SearchBar() {
		return search_bar;
	}
	public WebElement realmewatch3pro() {
		return realme_Watch3pro;
	}
	public WebElement realmewatch3() {
		return realme_Watch;
	}
	public WebElement Black() {
		return B_lack ;
	}
	public WebElement pincode() {
		return pin_Code ;
	}
	public WebElement Accept() {
		return Accept ;
	}
	public WebElement Notify_Me() {
		return Notify_Me ;
	}
	
	public WebElement phonenumber() {
		return Phone_Number   ;
	}
	public WebElement password() {
		return Pa_ssword   ;
	}
	public WebElement Signinpassword () {
		return Signinpassword    ;
	}
	public WebElement CART () {
		return C_ART    ;
	}
	public WebElement RealMeNarzo () {
		return R_ealMeNa_rzo    ;
	}
	public WebElement AddCartNajro () {
		return Add_Cart_Najro    ;
	}
	
	}
	

