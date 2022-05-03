package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {
	
	static void openBrowser(String driverPath, String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", driverPath);
			WebDriver driver=new FirefoxDriver();
		}
			
		
	}

	public static void main(String[] args) {
		
		String geckoDriverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
		String chromeDriverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		
		openBrowser(chromeDriverPath,"chrome");
		openBrowser(geckoDriverPath,"firefox");

	}

}
