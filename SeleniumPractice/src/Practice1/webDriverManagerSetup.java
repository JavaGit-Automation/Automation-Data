package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerSetup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.close();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		
		
		driver1.get("https://www.google.com/");
		driver1.close();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver2=new InternetExplorerDriver();
		driver2.manage().window().maximize();
	
		
		driver2.get("https://www.google.com/");
		driver2.close();
		
	}

}
