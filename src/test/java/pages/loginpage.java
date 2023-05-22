package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import basefile.shaddi;

//public class loginpage {
	public class loginpage  extends shaddi {
	      public loginpage ()
	      {
	    	  PageFactory.initElements(driver, this);
	      }
	      @FindBy(xpath="//*[@id=\"__next\"]/div[1]/div[1]/div[2]/a[1]")
	      WebElement login;
	      @FindBy(xpath="//*[@id=\"shaadiHelpLink\"]")
	      WebElement help;
	      @FindBy(xpath="//div[text()='Woman']")
	      WebElement women;
	      @FindBy(xpath="//label[text()='aged']")
	      WebElement aged;
	      @FindBy(xpath="//label[text()='of religion']")
	      WebElement ofreligion;
	      @FindBy(xpath="//label[text()='and mother tongue']")
	      WebElement andmothertounge;
	      @FindBy(xpath="//div[@class='PreferenceForm_formGroup__7JJxn col-md-2 col-12 btnWrap']/button")
	      WebElement LetsBegin;
	      // login 
	      @FindBy(xpath="//*[@id=\"__next\"]/div[1]/div[1]/div[2]/a[1]")
	      WebElement logologin;
	      @FindBy(xpath="//*[@id=\"frmLogin\"]/div[2]/button[2]")
	      WebElement LoginwithOTP;
	      @FindBy(xpath="//*[@id=\"frmLogin\"]/div[2]/p/a")
	      WebElement SignUpFree;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/span[1]")
	      WebElement Myself;
	      @FindBy(xpath="//span[text()='Female']")
	      WebElement Female;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div")
	      WebElement Firstname;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[2]/div[1]/div[4]/div/input")
	      WebElement Lastname;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/input")
	      WebElement Day ;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/input")
	      WebElement Month ;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/input")
	      WebElement Year ;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[3]/button")
	      WebElement Continue  ;
	      @FindBy(xpath="//div[@id='mui-component-select-community']")
	      WebElement Religion;
	      @FindBy(xpath="//li[text()='Sikh']")
	      WebElement ReligionSelection ;
	      @FindBy(xpath="//div[@id='mui-component-select-mother_tongue']")
	      WebElement Community  ;
	      @FindBy(xpath="//li[text()='Punjabi']")
	      WebElement CommunitySelection  ;
	      @FindBy(xpath="//*[@id=\"mui-component-select-countryofresidence\"]")
	      WebElement Country  ;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[3]/div/div[3]/button/span[1]/span[1]/p")
	      WebElement Continues;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[4]/div/div[3]/div[1]/div[2]/div/input")
	      WebElement Email;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/input")
	      WebElement Mobilenumber;
	      @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[4]/div/div[4]/button/span[1]/span[1]/p")
	      WebElement Submit;
	      
	      // profile 
	      
	      @FindBy(xpath="//*[@id=\"__next\"]/div[1]/div[1]/div[2]/a[1]")
	      WebElement Login ;
	      @FindBy(xpath="//*[@id=\"frmLogin\"]/div[2]/div[2]/input")
	      WebElement Emailid ;
	      @FindBy(xpath="//*[@id=\"frmLogin\"]/div[2]/div[3]/input")
	      WebElement Password ;
	      @FindBy(xpath="//button[@data-testid='sign_in' and contains(text(),'Login')]")
	      WebElement Loginn ;
	      
	      
	      
	      //visibility
	      public WebElement login () {
	    	  return login ;
	      }
	      public WebElement help () {
	    	  return help ;
	      }
	      public WebElement women () {
	    	  return   women;
	      }
	      public WebElement aged () {
	    	  return  aged;
	      }
	      public WebElement ofreligion () {
	    	  return  ofreligion;
	      }
	      public WebElement andmothertounge () {
	    	  return  andmothertounge;
          }
	      public WebElement LetsBegin () {
	    	  return  LetsBegin;
	  }
	      
	      // login in return
	      public WebElement logologin  () {
	    	  return logologin  ;
	      }
	      public WebElement LoginwithOTP   () {
	    	  return  LoginwithOTP  ;
	      }
	      public WebElement SignUpFree    () {
	    	  return SignUpFree    ;
	      }
	      public WebElement Myself    () {
	    	  return Myself    ;
	      }
	      public WebElement Female     () {
	    	  return Female    ;
	      }
	      public WebElement Firstname   () {
	    	  return  Firstname  ;
	      }
	      public WebElement Lastname    () {
	    	  return Lastname    ;
	      }
	      public WebElement  Day  () {
	    	  return   Day  ;
	      }
	      public WebElement  Month  () {
	    	  return  Month  ;
	      }
	      public WebElement Year  () {
	    	  return  Year  ;
	      }
	      public WebElement Continue () {
	    	  return  Continue  ;
	      }
	      public WebElement Religion  () {
	    	  return  Religion ;
	      }
	      
	      public WebElement ReligionSelect  () {
	    	  return  ReligionSelection ;
	      }
	      public WebElement Community   () {
	    	  return  Community   ;
	      }
	      
	      public WebElement CommunitySelect  () {
	    	  return  CommunitySelection ;
	      }
	      public WebElement Country   () {
	    	  return  Country   ;
	      }
	      public WebElement Continues   () {
	    	  return  Continues  ;
	      }
	      public WebElement EmailId   () {
	    	  return  Email  ;
	      }
	      public WebElement Mobilenumber   () {
	    	  return  Mobilenumber  ;
	      }
	      public WebElement Submit  () {
	    	  return  Submit  ;
	      }
	      
	      // prolog
	      public WebElement Login () {
	    	  return  login  ;
	      }
	      public WebElement Emailid  () {
	    	  return  Emailid   ;
	      }
	      public WebElement Password () {
	    	  return  Password   ;
	      }
	      public WebElement Loginn() {
	    	  return  Loginn   ;
	      }
	      
	      
	       
	      
	}
	
	    	  
