package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login Page Open Sucessfully.");
		}else {
			System.out.println("Page title got changed or Login Page Error.");
		}
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		WebElement loginButtonField=driver.findElement(By.id("loginButton"));
		loginButtonField.click();
		
		WebElement logoutButtonField=driver.findElement(By.id("logoutLink"));
		logoutButtonField.click();
		
		//driver.close();
		
	}

}
