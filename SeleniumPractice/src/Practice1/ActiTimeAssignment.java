package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeAssignment {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		if (driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("Login Page Open Sucessfully.");
		} else {
			System.out.println("Page title got changed or Login Page Error.");
		}

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).clear();
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		if (driver.getTitle().equals("actiTIME -  Enter Time-Track")) {
			System.out.println("Home Page Open Sucessfully.");
		} else {
			System.out.println("Home Page title got changed or Home Page Error.");
		}
	
		driver.findElement(By.cssSelector("a.content.tasks")).click();
		driver.findElement(By.cssSelector("div.title.ellipsis")).click();
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
	
		WebElement selectCust=driver.findElement(By.xpath("(//div[@class='selectedItem' and @style='display: block;'])[1]"));
		selectCust.click();
		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(selectCust));
		
		WebElement selectProj=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[8]"));
		selectProj.click();
		
		WebElement selectTask=driver.findElement(By.xpath("(//div[ text()='Android testing'])[3]"));
		selectTask.click();

		
	}

}
