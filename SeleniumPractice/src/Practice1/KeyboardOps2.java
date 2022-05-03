package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOps2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.ESCAPE));

		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
		}
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.PAGE_UP));
		
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.f5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}


}
