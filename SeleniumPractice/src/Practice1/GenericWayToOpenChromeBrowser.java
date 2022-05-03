package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {

		String driverPath1="D:\\MyWork\\SeleniumPractice\\Executable\\chromedriver.exe";
		//or
		String driverPath2=".\\Executable\\\\chromedriver.exe";
		//or
		String driverPath3=System.getProperty("user.dir")+"\\Executable\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath2);
		WebDriver driver=new ChromeDriver();
		driver.quit();
		
		ChromeDriver chdriver=new ChromeDriver();
		chdriver.close();
		
				
	}

}
