package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demosite.executeautomation.com/");
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		WebElement titleDDL=driver.findElement(By.id("TitleId"));	//Identify Dropdown List
		
		Select s1=new Select(titleDDL);		//Create Select Class Object and Pass DDL WebElement as parameter
		
		System.out.println("Is it Multiselect Dropdown List: "+s1.isMultiple());
		
		List<WebElement> Options=s1.getOptions();		//.getOption() is List of all the Options Present in Droppdown List
		System.out.println("Dropdown List Options Count: "+Options.size());		//Size of Options present in Dropdown List
		for(int i=0;i<Options.size();i++) {			//Printing All the Options from Dropdown List using for-loop
			System.out.println(Options.get(i).getText());
		}
		
		System.out.println("Already Selected Option: "+s1.getFirstSelectedOption());	//Printing Already selected option from Dropdown List
		
		s1.selectByIndex(0);			//Select option By its Index
		s1.selectByValue("2");			//Select option By its Value
		s1.selectByVisibleText("Mr.");	//Select option By its Visible Text

	}

}
