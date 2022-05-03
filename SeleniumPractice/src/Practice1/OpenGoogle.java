package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String sourceCode=driver.getPageSource();
		System.out.println("Application source code: "+driver.getPageSource());
		System.out.println("Application source code: "+sourceCode);
		System.out.println("Source code leght : "+sourceCode.length());
		
		System.out.println("Application Current URL: "+driver.getCurrentUrl());
		System.out.println("Application current Title: "+driver.getTitle());
		
		driver.close();
	}

}
