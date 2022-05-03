package Ultility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	 WebDriver driver=null;
	 Actions action=null;
	
	public WebDriver setUp(String browser, String appUrl) {
	
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appUrl);
		action=new Actions(driver);
		return driver;
	}
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	public void pageRefresh() {
		driver.navigate().refresh();
	}
	
	public void backPage() {
		driver.navigate().back();
	}
	
	public void switchBackToMainPage() {
		driver.switchTo().defaultContent();
	}
	
	public void cleanUp() {
		driver.close();
	}
	
	public void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void mouseHoverWithChords(WebElement element, int x, int y) {
		action.moveToElement(element, x, y);
	}
	public void rightClick(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}
	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().build().perform();
	}
	
	public void switchToFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchToFrameByName(String name) {
		driver.switchTo().frame(name);
	}
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public String getCurrentWorkingDir() {
		String path=System.getProperty("user.dir");
		return path;
	}
	public FileInputStream loadPropertyFile(String path) throws IOException {
		
		FileInputStream fis=new FileInputStream(path);
		return fis;
	}
	public String getPropertyFile(FileInputStream fis, String filename) throws IOException {
		
		Properties prop=new Properties();
		prop.load(fis);
		String getData=prop.getProperty(filename);
		return getData;
		
	}
}












