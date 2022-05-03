package Assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultility.SeleniumUtility;

public class SampleTest {

	public static void main(String[] args) throws IOException {

		
		SeleniumUtility ul = new SeleniumUtility();
		WebDriver driver=ul.setUp("Chrome", "https://www.google.com/");
		
		System.out.println("Page URL :"+ul.getCurrentURL());
		System.out.println("Page Title :"+ul.getCurrentPageTitle());
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Java");
		ul.doubleClick(search);
		
		System.out.println("Current Working Directory :"+ul.getCurrentWorkingDir());
		String path = ul.getCurrentWorkingDir() + ".\\TestData\\SampleData.properties";
		String username=ul.getPropertyFile(ul.loadPropertyFile(path), "username");
		System.out.println("USERNAME :"+username);
	}
}