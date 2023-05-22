package basefile;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsBase {

public static WebDriver driver;

public static Properties prop;

@SuppressWarnings("deprecation")

public static void initialization() throws IOException

{

try {

//1. Reading file

	FileInputStream fs=new FileInputStream("C:\\Users\\isaraf\\eclipse-workspace\\projecttraning1\\src\\test\\java\\configurefile\\hrms.properties");

prop = new Properties();

prop.load(fs);

} catch (FileNotFoundException e) {

System.out.println("File not available");

}

//2. Create Properties class object to read this file object

WebDriverManager.chromedriver().setup();

ChromeOptions chromeOptions = new ChromeOptions();

chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

driver = new ChromeDriver(chromeOptions);

//properties object can be used to fetch the value using getProperty method

driver.get(prop.getProperty("url"));

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

public void terminate()

{

driver.quit();

}

}