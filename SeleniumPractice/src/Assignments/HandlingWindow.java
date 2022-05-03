package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		
		String homePageWinId=driver.getWindowHandle();
		System.out.println("Home Window Id: "+homePageWinId);
		
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();		
		
		Set<String> allWinId=driver.getWindowHandles();
		System.out.println("All Window Ids: "+allWinId);
		
		allWinId.remove(homePageWinId);
		System.out.println("All Window Ids after removing HomePage Id: "+allWinId);
		
		Iterator<String> itr=allWinId.iterator();
		String childWinId=itr.next();
		driver.switchTo().window(childWinId);
		//or
		//driver.switchTo().window(allWinId.iterator().next());
		
		System.out.println("LinkedIn Page Title: "+driver.getTitle());
		System.out.println("LinkedIn Page URL: "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(homePageWinId);
		System.out.println("Home Page Title: "+driver.getTitle());
		System.out.println("Home Page URL: "+driver.getCurrentUrl());
		
		
		
		
		

	}

}
