package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allOption=driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div/a"));
		System.out.println("Size of Options: "+allOption.size());
		for(int i=0;i<allOption.size();i++) {
//			System.out.println(allOption.get(i).getText());
//			if(allOption.get(i).getText().equals("Amazon Pay")) {
//				allOption.get(i).click();
//				break;
//			}else {
//				System.out.println("Menu not found.");
//			}
			WebElement option=allOption.get(i);
			String name=option.getText();
			System.out.println("Option Name: "+name);
			if(name.equals("Amazon Pay")) {
				option.click();
				break;
			}else {
				System.out.println("Not matched.....");
			}
		}
		driver.navigate().back();

	}

}
