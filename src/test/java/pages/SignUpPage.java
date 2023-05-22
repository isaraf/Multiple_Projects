package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import basefile.meesho;

public class SignUpPage  extends meesho {
      public SignUpPage ()
      {
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/div[5]")
      WebElement profilelogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/div[5]/div/div/button/div/span")
      WebElement signuplogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/input")
      WebElement mobileno;
      @FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div[2]/div/button")
      WebElement countinue;
      @FindBy(xpath="/html/body/div/div[3]/div/div[2]/div/button/div/span")
      WebElement verify;
      @FindBy(xpath="//span[text()='Women Ethnic']")
      WebElement WomenEthnicOption;
      @FindBy(xpath="//span[text()='Women Western']")
      WebElement WomenWesternOption;
      //add cart 
      @FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[1]/span")
      WebElement womenethicicon;
      @FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/div/div[3]/a[1]/p")
      WebElement kurta;
      @FindBy(xpath="//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[3]/div[2]/div[2]/div/div[1]/a/div")
      WebElement kurtaclick;
      @FindBy(xpath="/html/body/div/div[3]/div/div[2]/div[2]/div/div/span[1]")
      WebElement size;
      @FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]")
      WebElement addtocart;
      //visibility
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]")
      WebElement logo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[1]")
      WebElement womenethicicons;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[3]")
      WebElement womenwesternlogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]/span")
      WebElement menlogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[7]/span")
      WebElement kidslogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[9]/span")
      WebElement homelogo;
      @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[11]")
      WebElement beautylogo;
      
      
      
      
      
      public WebElement profile() {
    	  return profilelogo;
      }
      public WebElement signup() {
    	  return signuplogo;
      }
      public WebElement mobile() {
    	  return mobileno;
      }
      public WebElement continues() {
    	  return countinue;
      }
      public WebElement verifys() {
    	  return verify;
      }
      public WebElement WomenEthnicOptionVisibility() {
    	  return WomenEthnicOption;
      }
      public WebElement WomenWesternOptionVisibility() {
    	  return WomenWesternOption;
      }
      //add to cart 
      public WebElement ethicicon() {
    	  return womenethicicon;
      }
      public WebElement kurta() {
    	  return kurta;
      }
      public WebElement kurtas() {
    	  return kurtaclick;
      }
      public WebElement sizes() {
    	  return size;
      }
      public WebElement cart() {
    	  return addtocart;
      }
      //visisbility
      public WebElement logos() {
    	  return logo;
      }
      public WebElement womenethiclogo() {
    	  return womenethicicons;
      }
      public WebElement womenwesternlogo() {
    	  return  womenwesternlogo;
      }
      public WebElement menlogo() {
    	  return  menlogo;
      }
      public WebElement kidslogo() {
    	  return  kidslogo;
      }
      public WebElement homelogo() {
    	  return  homelogo;
      }
      public WebElement beautylogo() {
    	  return  beautylogo;
      }
      
      
      

      }




