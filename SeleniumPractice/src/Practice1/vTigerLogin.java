package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTigerLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String expectedTitle="vTiger";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login Page Open Sucessfully.");
		}else {
			System.out.println("Page title got changed or Login Page Error.");
		}
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		
		WebElement loginButtonField=driver.findElement(By.tagName("button"));
		loginButtonField.click();
		
		
		
	}

}
