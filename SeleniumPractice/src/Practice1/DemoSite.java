package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demosite.executeautomation.com/Login.html");

		String pageTile = driver.getTitle();
		System.out.println("Application Page Title: " + pageTile);
		System.out.println("Page Title lenght : " + pageTile.length());

		String expectedLoginTitle = "Execute Automation";
		String actualLoginTitle = driver.getTitle();
		if (actualLoginTitle.equals(expectedLoginTitle)) {
			System.out.println("Login Page Open Sucessfully.");
		} else {
			System.out.println("Page title got changed or Login Page Error.");
		}

		WebElement usernameInputField = driver.findElement(By.name("UserName"));
		usernameInputField.clear();
		usernameInputField.sendKeys("execution");

		WebElement passwordInputField = driver.findElement(By.name("Password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");

		WebElement loginButtonField = driver.findElement(By.name("Login"));
		loginButtonField.click();

		System.out.println("Home Page Title: " + driver.getTitle());
		System.out.println("Application Current URL: " + driver.getCurrentUrl());
		
		WebElement logoutButtonField = driver.findElement(By.linkText("Login.html"));
		logoutButtonField.click();

//		driver.close();

	}

}
