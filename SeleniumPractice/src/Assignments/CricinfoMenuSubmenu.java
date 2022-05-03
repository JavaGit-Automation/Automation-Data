package Assignments;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoMenuSubmenu {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		
		Actions act=new Actions(driver);
		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));
		for(int i=0;i<allOptions.size();i++) {
			try {
				driver.findElement(By.xpath("//button[text()='Not Now']")).click();
			}catch(NoSuchElementException e){
				
			}
			System.out.println("*****"+allOptions.get(i).getText()+"*****");
			act.moveToElement(allOptions.get(i)).perform();
			Thread.sleep(1000);
			List<WebElement> subOptions=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
			if(subOptions.size()>0) {
				for(int j=0;j<subOptions.size()	;j++) {
					subOptions=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
					try {
						System.out.println("*****"+subOptions.get(j).getText());
					}catch(StaleElementReferenceException e) {
						driver.navigate().refresh();
						act.moveToElement(allOptions.get(i)).perform();
						Thread.sleep(1000);
						subOptions=driver.findElements(By.xpath("//ul[contains(@class,'ds-overflow-ellipsis')]/li/a/span"));
						System.out.println(subOptions.get(j).getText());
					}
				}
			}
		}

	}

}
