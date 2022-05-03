package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		if (driver.getTitle().equals("GSMArena.com - mobile phone reviews, news, specifications and more...")) {
			System.out.println("Home Page Open Sucessfully.");
		} else {
			System.out.println("Either Home page not open correclty or page title not found.");
		}
		
		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:nth-of-type(14)")).click();
	
		System.out.println(driver.findElement(By.cssSelector("div.nav-pages>strong")).getText());
		System.out.println("Realme-1stPage Url: "+driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://www.gsmarena.com/realme-phones-118.php")) {
			System.out.println("RealMe-1st Page Open SucessFully.");
		}else {
			System.out.println("Page Error: Pagination not done.");
		}
		
		driver.findElement(By.cssSelector("div.nav-pages>a")).click();
		System.out.println(driver.findElement(By.cssSelector("div.nav-pages>strong")).getText());
		System.out.println("Realme-1stPage Url: "+driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://www.gsmarena.com/realme-phones-f-118-0-p3.php")) {
			System.out.println("RealMe-2st Page Open SucessFully.");
		}else {
			System.out.println("Page Error: Pagination not done.");
		}
		
		driver.findElement(By.cssSelector("div.nav-pages>a:nth-of-type(2)")).click();
		System.out.println(driver.findElement(By.cssSelector("div.nav-pages>strong")).getText());
		System.out.println("Realme-1stPage Url: "+driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://www.gsmarena.com/realme-phones-f-118-0-p2.php")) {
			System.out.println("RealMe-3st Page Open SucessFully.");
		}else {
			System.out.println("Page Error: Pagination not done.");
		}
		
		
	}

}
