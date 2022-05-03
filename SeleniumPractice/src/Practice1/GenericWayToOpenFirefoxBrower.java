package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefoxBrower {

	public static void main(String[] args) {

		String driverPath1="D:\\MyWork\\SeleniumPractice\\Executable\\geckodriver.exe";
		String driverPath2=".\\Executable\\\\geckodriver.exe";
		String driverPath3=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driverPath2);
		WebDriver driver=new FirefoxDriver();
		driver.close();
		
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.close();

	}

}
