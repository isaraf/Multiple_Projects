package basefile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class meesho {
	public static WebDriver driver;

	public static Properties prop;

	public void initialization()throws InterruptedException {

	try {

	//1.to read file using file handling

	FileInputStream fs=new FileInputStream("C:\\Users\\isaraf\\eclipse-workspace\\projecttraning1\\src\\test\\java\\configurefile\\meesho.properties");

	prop=new Properties();

	prop.load(fs);

	WebDriverManager.chromedriver().setup();

	ChromeOptions chromeOptions = new ChromeOptions();

	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

	driver=new ChromeDriver();

	driver.get(prop.getProperty("url"));

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	catch(FileNotFoundException e) {

	//todo auto-generated catch block

	System.out.println("File not available");

	}

	catch(IOException e)

	{

	e.printStackTrace();

	}

	}

	public void terminate() {

	driver.quit();

	}

	}

	
	